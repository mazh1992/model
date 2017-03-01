package modle.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by mazhenhua on 2017/2/10.
 */
public class DynamicProxy implements InvocationHandler {

    private Object obj;

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理：我是代购，我帮别人代购一辆车");
        Object result=method.invoke(obj, args);
        System.out.println("代理：代购完成，车辆已经交给客户");
        return result;
    }
}
