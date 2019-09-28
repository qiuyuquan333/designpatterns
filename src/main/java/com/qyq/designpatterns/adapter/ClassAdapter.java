package com.qyq.designpatterns.adapter;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target{

    @Override
    public void outPut5V() {
        int i = outPut220V();
        System.out.println("类适配器开始工作，适配电压");
        int want = i/44;
        System.out.println("适配完成后，输出电压："+want+"V");
    }
}
