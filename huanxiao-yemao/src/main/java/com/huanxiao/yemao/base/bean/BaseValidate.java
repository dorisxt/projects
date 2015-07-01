package com.huanxiao.yemao.base.bean;

import java.io.Serializable;

/**
 * 类名:		BaseValidate
 * 描述:		后台验证bean
 * @author 	xiangguo
 *
 */
public class BaseValidate implements Serializable {

    private static final long serialVersionUID = 1L;

    private String            message          = "success";

    private String            type             = ValiType.SUCCESS.getStatu();

    private boolean           result           = true;

    /**
     * @return 返回变量message的值
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message 设置message的值
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return 返回变量type的值
     */
    public String getType() {
        return type;
    }

    /**
     * @param type 设置type的值
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return 返回变量result的值
     */
    public boolean isResult() {
        return result;
    }

    /**
     * @param result 设置result的值
     */
    public void setResult(boolean result) {
        this.result = result;
    }

    /**
     * 
     * 类名:		ValiType
     * 描述:		验证类型枚举
     * @author 	xiangguo
     *
     */
    public enum ValiType {
        SUCCESS("success", "成功"), ERROR("error", "错误"), WARN("warn", "警告"), UNKNOWN("unknown", "未知");

        private String statu;

        private String desc;

        ValiType(String statu, String desc) {
            this.statu = statu;
            this.desc = desc;
        }

        public String getStatu() {
            return statu;
        }

        public String getDesc() {
            return desc;
        }

        public static ValiType getValiType(String statu) {
            for (ValiType valiType : values()) {
                if (valiType.getStatu().equals(statu)) {
                    return valiType;
                }
            }
            return UNKNOWN;
        }
    }

}
