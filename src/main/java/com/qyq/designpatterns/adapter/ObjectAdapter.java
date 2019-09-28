package com.qyq.designpatterns.adapter;

/**
 * 对象适配器
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void outPut5V() {
        int i = adaptee.outPut220V();
        System.out.println("对象适配器开始工作");
        int want = i/44;
        System.out.println("适配完成后，输出电压："+want+"V");
    }
}
