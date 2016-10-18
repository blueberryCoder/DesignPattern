package com.blueberry.pattern.chain_of_responsibility;

/**
 * Created by Administrator on 2016/10/9.
 */
public abstract class Handler {
    protected Handler successor;//下一节点的处理者

    /**
     * 请求处理
     *
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}
