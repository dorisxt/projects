package com.huanxiao.yemao.base.bean;

import java.io.Serializable;

import com.huanxiao.yemao.constant.YmConstants;

/**
 * 类名:		BasePage
 * 描述:		分页
 * @author 	xiangguo
 *
 */
public class BasePage implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long              offset;                                    //第..个

    private Long              rows;                                      //取..个

    private Long              pageNumber       = YmConstants.pageNumber; //第..页

    private Long              pageSize         = YmConstants.pageSize;  //每页..个

    private String            orderProperty;                             //排序字段

    private String            orderDirection;                            //排序方向

    /**
     * @return 返回变量offset的值
     */
    public Long getOffset() {
        if (null == pageNumber || null == pageSize) {
            return offset;
        }
        return (pageNumber - 1) * pageSize;
    }

    /**
     * @param offset 设置offset的值
     */
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    /**
     * @return 返回变量rows的值
     */
    public Long getRows() {
        if (null == pageSize) {
            return rows;
        }
        return pageSize;
    }

    /**
     * @param rows 设置rows的值
     */
    public void setRows(Long rows) {
        this.rows = rows;
    }

    /**
     * @return 返回变量pageNumber的值
     */
    public Long getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber 设置pageNumber的值
     */
    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * @return 返回变量pageSize的值
     */
    public Long getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize 设置pageSize的值
     */
    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * @return 返回变量orderProperty的值
     */
    public String getOrderProperty() {
        return orderProperty;
    }

    /**
     * @param orderProperty 设置orderProperty的值
     */
    public void setOrderProperty(String orderProperty) {
        this.orderProperty = orderProperty;
    }

    /**
     * @return 返回变量orderDirection的值
     */
    public String getOrderDirection() {
        return orderDirection;
    }

    /**
     * @param orderDirection 设置orderDirection的值
     */
    public void setOrderDirection(String orderDirection) {
        this.orderDirection = orderDirection;
    }

}
