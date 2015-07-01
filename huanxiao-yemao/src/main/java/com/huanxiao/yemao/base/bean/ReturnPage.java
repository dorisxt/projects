package com.huanxiao.yemao.base.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.huanxiao.yemao.constant.YmConstants;

/**
 * 类名:		BaseReturnPage
 * 描述:		分页返回bean
 * @author 	xiangguo
 *
 */
public class ReturnPage<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    List<T>                   list             = new ArrayList<T>();

    private Long              total            = YmConstants.total;     //总个数

    private Long              pageNumber       = YmConstants.pageNumber; //第..页

    private Long              pageSize         = YmConstants.pageSize;  //每页..个

    private Long              totalPages       = YmConstants.totalPages; //总页数

    private String            orderProperty;                             //排序字段

    private String            orderDirection;                            //排序方向

    /**
     * @return 返回变量list的值
     */
    public List<T> getList() {
        return list;
    }

    /**
     * @param list 设置list的值
     */
    public void setList(List<T> list) {
        this.list = list;
    }

    /**
     * @return 返回变量total的值
     */
    public Long getTotal() {
        return total;
    }

    /**
     * @param total 设置total的值
     */
    public void setTotal(Long total) {
        this.total = total;
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
     * @return 返回变量totalPages的值
     */
    public Long getTotalPages() {
        if (null == total || null == pageSize) {
            return totalPages;
        }
        return Math.round(Math.ceil(total * 1.0 / pageSize));
    }

    /**
     * @param totalPages 设置totalPages的值
     */
    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
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
