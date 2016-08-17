import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by solax on 2016/8/17.
 */
public class Handle implements InvocationHandler{

    public static void main(String [] args) {
        System.out.println("----------");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
