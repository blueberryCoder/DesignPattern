package com.blueberry.pattern.interpreter;

import java.util.Stack;

/**
 * Created by Administrator on 2016/10/10.
 */
public class Calculator {
    private Stack<ArithmeticExpression> mExpStack = new Stack<>();

    public Calculator(String expression){
        // 声明两个ArithmeticExpression类型的临时变量,存储运算符左右两边的数字解释器
        ArithmeticExpression exp1,exp2;

        // 根据空格分割表达式字符串
        String[] elements = expression.split(" ");

        /**
         * 循环遍历表达式元素数组
         */
        for(int i=0;i<elements.length;i++){
            /**
             * 判断运算符号
             */
            switch (elements[i].charAt(0)){
                case '+': // 如果是加号 则将栈中的解释器弹出作为运算符左边的解释器
                    exp1 = mExpStack.pop();
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new AdditionExpression(exp1,exp2));
                    break;
                default://如果位数字
                    /**
                     * 如果不是运算符则为数字
                     * 若是数字，直接构造数字解释器并压入栈
                     */
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));

            }
        }
    }

    /**
     * 计算结果
     */
    public int calculate(){
        return mExpStack.pop().interpret();
    }
}
