package modle.Proxy;

import java.lang.reflect.Proxy;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class Test {

   /* public static void main(String[] args) {
        BuyCar my = new My();
        BuyCar buyCar = new ProxyMy(my);
        buyCar.getCar();
    }*/

    public static void main(String[] args) {
        BuyCar my = new My();
        DynamicProxy dynamicProxy = new DynamicProxy(my);

        ClassLoader classLoader = my.getClass().getClassLoader();
        BuyCar buyCar = (BuyCar) Proxy.newProxyInstance(classLoader, new Class[]{BuyCar.class}, dynamicProxy);
        buyCar.getCar();
    }


}
