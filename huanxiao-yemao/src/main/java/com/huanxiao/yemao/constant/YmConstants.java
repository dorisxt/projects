package com.huanxiao.yemao.constant;

/**
 * 
 * 类名:		ErpConstants
 * 描述:		静态常量类
 *
 */
public final class YmConstants {

    private YmConstants() {}

    /** 时间格式 */
    public static final String  YYYY_MM           = "yyyy-MM";

    /** 时间格式 */
    public static final String  YYYY_MM_DD        = "yyyy-MM-dd";

    /** 空字符串 */
    public static final String  EMPTY_STRING      = "";

    /** 空格字符串 */
    public static final String  SPACE_STRING      = " ";

    public static final String  QUOTATION         = "\"";

    /** 连接字符串 */
    public static final String  HYPHEN            = "-";

    /** 横杠--连接字符串 **/
    public static final String  HYPEN_EMPTY       = " - ";

    /**加号连接符*/
    public static final String  ADD               = "+";

    /** 中文逗号 */
    public static final String  COMMA_CHINESE     = "，";

    /** 逗号字符 */
    public static final String  COMMA             = ",";

    /** 冒号字符 */
    public static final String  COLON             = ":";

    /** 分号字符 */
    public static final String  SEMICOLON_CHINESE = "；";

    /** 分号字符 */
    public static final String  SEMICOLON_ENGLISH = ";";

    /** 百分号字符 */
    public static final String  PERCENT           = "%";

    /** 句点字符 */
    public static final String  DOT               = ".";

    /** 并且字符 */
    public static final String  AND               = "&";

    /*############################# 编码  ##########################*/
    public static final String  UTF8              = "UTF-8";

    public static final String  ISO88591          = "ISO-8859-1";

    /** 金额保留两位小数*/
    public static final Integer PRICE_SCALE       = 2;

    /** RMB货币符号*/
    public static final String  CURRENCY_SIGN     = "￥";

    /** 重量单位符号*/
    public static final String  SUFFIX_UNIT       = "g";

    /*############################# 分页  ##########################*/
    /** 默认第1页*/
    public static final Long    pageNumber        = 1L;

    /** 默认每页显示10条数据*/
    public static final Long    pageSize          = 10L;

    /** 默认共1页*/
    public static final Long    totalPages        = 1L;

    /** 默认数据为0条*/
    public static final Long    total             = 0L;
}
