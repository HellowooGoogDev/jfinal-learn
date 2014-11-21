package interceptor;

/**
 * @author Xu Jingyi
 * @date 2014-11-21
 * @since JDK1.6
 */
import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class StudentInterceptor implements Interceptor {

    public void intercept(ActionInvocation ai) {
        System.out.println("Before action invoking");
        ai.invoke();
        System.out.println("After action invoking");
    }

}
