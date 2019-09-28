package com.qyq.designpatterns.factory;

/**
 * 使用反射，生成对应的实例
 */
public class BookFactory {

    //字符串，可以优化
//    public static Book getBook(String className){
//        if(className != null && !className.equals("")){
//            try {
//                return (Book) Class.forName(className).newInstance();
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//            return null;
//    }

    //class类匹配
    public static Book getBook(Class<? extends Book> clazz) {
        if (clazz != null) {
            try {
                return clazz.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
