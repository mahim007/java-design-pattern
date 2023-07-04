package structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityProxy implements InvocationHandler {

    private final Object object;

    public SecurityProxy(Object object) {
        this.object = object;
    }

    public static Object newInstance(Object object) {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new SecurityProxy(object));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        Object result;
        try {
            if (method.getName().contains("post")) {
                throw new RuntimeException("Posts are currently not allowed");
            }
            result = method.invoke(this.object, args);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw new RuntimeException("Unexpected Invocation exception: " + e.getMessage());
        }

        return result;
    }
}
