package com.blueberry.pattern.iterator;

/**
 * Created by Administrator on 2016/10/10.
 */
public interface Iterator<T> {

    /**
     * 是否还有下一个元素
     *
     * @return true 表示有,false表示没有
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移植下一位
     *
     * @return
     */
    T next();
}
