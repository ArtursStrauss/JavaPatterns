package DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object obj;

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result;

        try {
            if (method.getName().contains("get")) {
                System.out.println("...get Method Executing...");
            } else {
                System.out.println("...set Method Executing...");
            }
            result = method.invoke(obj, args);
        } catch (InvocationTargetException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
        return result;
    }
}
