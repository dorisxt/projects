package com.huanxiao.yemao.base.controller;

import java.awt.image.BufferedImage;
import java.util.Calendar;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import com.huanxiao.yemao.base.bean.Message;
import com.huanxiao.yemao.template.directive.FlashMessageDirective;

/**
 * BaseController
 */
@Controller
public class BaseController {

    /** 错误消息 */
    protected static final Message ERROR_MESSAGE   = Message.error("admin.message.error");

    /** 成功消息 */
    protected static final Message SUCCESS_MESSAGE = Message.success("admin.message.success");

    @Resource(name = "captchaProducer")
    private Producer               captchaProducer;

    private Logger                 LOGGER          = LoggerFactory.getLogger(BaseController.class);

    /**
     * 验证码
     */
    @RequestMapping(value = "/captcha.jhtml", method = RequestMethod.GET)
    public void image(HttpServletRequest request, HttpServletResponse response) {
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");

        String text = captchaProducer.createText();
        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);

        ServletOutputStream out = null;
        try {
            BufferedImage bi = captchaProducer.createImage(text);
            out = response.getOutputStream();
            ImageIO.write(bi, "jpg", out);
            out.flush();
        } catch (Exception e) {
            LOGGER.error("Error occur when getting response output stream error.", e);
        } finally {
            IOUtils.closeQuietly(out);
        }
    }

    /**
     * 登录
     */
    @RequestMapping(value = "/login.jhtml")
    public String login(ModelMap modelMap, HttpServletResponse response) {
        setNoCacheIfFlashMessage(modelMap, response);
        modelMap.addAttribute("timestamp", Calendar.getInstance().getTimeInMillis());
        return "login/login";
    }

    /**
     * 主页
     */
    @RequestMapping(value = "/main.jhtml")
    public String main(ModelMap modelMap) {
        modelMap.addAttribute("userType", "admin");
        return "common/main";
    }

    /**
     * 主页
     */
    @RequestMapping(value = "/index.jhtml")
    public String index(ModelMap modelMap) {
        return "common/index";
    }

    /**
     * 添加瞬时消息
     * 
     * @param redirectAttributes
     *            RedirectAttributes
     * @param message
     *            消息
     */
    protected void addFlashMessage(RedirectAttributes redirectAttributes, Message message) {
        if (redirectAttributes != null && message != null) {
            redirectAttributes.addFlashAttribute(FlashMessageDirective.FLASH_MESSAGE_ATTRIBUTE_NAME, message);
        }
    }

    /**
     * 当存在瞬时消息时，设置页面的response header，使页面不被缓存
     * 
     * @param modelMap
     *            ModelMap
     * @param response
     *            HttpServletResponse
     */
    protected void setNoCacheIfFlashMessage(ModelMap modelMap, HttpServletResponse response) {
        Message message = (Message) modelMap.get(FlashMessageDirective.FLASH_MESSAGE_ATTRIBUTE_NAME);
        if (message != null) {
            response.setHeader("Cache-Control", "no-cache, no-store");
            response.setHeader("Expires", "-1");
            response.setHeader("Pragma", "no-cache");
        }
    }

}