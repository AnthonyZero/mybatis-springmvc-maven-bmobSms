package cn.pingjinsite.framework.common;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: Pagination
 * @Description: 分页对象
 * @author pingjin(736252868@qq.com)
 * @date 2017年4月13日 下午4:51:02
 */
public class Pagination extends SimplePage implements Paginable, Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 当前页的数据
     */
    private List<?> list;

    public Pagination() {
    }

    /**
     * 构造器
     * 
     * @param pageNo 页码
     * @param pageSize 每页几条数据
     * @param totalCount 总共几条数据
     */
    public Pagination(int pageNo, int pageSize, int totalCount) {
        super(pageNo, pageSize, totalCount);
    }

    /**
     * 构造器
     * 
     * @param pageNo 页码
     * @param pageSize 每页几条数据
     * @param totalCount 总共几条数据
     * @param list 分页内容
     */
    public Pagination(int pageNo, int pageSize, int totalCount, List<?> list) {
        super(pageNo, pageSize, totalCount);
        this.list = list;
    }

    /**
     * 第一条数据位置
     * 
     * @return
     */
    public int getFirstResult() {
        return (pageNo - 1) * pageSize;
    }

    /**
     * 最后一条数据位置
     * 
     * @return
     */
    public int getEndResult() {
        return getFirstResult() + pageSize;
    }

    /**
     * 获得分页内容
     * 
     * @return
     */
    public List<?> getList() {
        return list;
    }

    /**
     * 设置分页内容
     * 
     * @param list
     */
    public void setList(List<?> list) {
        this.list = list;
    }

}
