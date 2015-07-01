package com.huanxiao.yemao.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
 
/**
 * @author doris
 *
 */
public class SimpleMappingExceptionResolver extends org.springframework.web.servlet.handler.SimpleMappingExceptionResolver {

	private static final Logger	LOGGER	= LoggerFactory.getLogger(SimpleMappingExceptionResolver.class);

	@Override
	protected ModelAndView doResolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
		LOGGER.warn("Resolving exception from handler [{}]: ", handler, ex);
		return super.doResolveException(request, response, handler, ex);
	}
}
