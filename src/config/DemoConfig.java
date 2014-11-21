package config;

/**
 * @author Xu Jingyi
 * @date 2014-11-21
 * @since JDK1.6
 */
import com.jfinal.config.*;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import controller.CourseController;
import controller.StudentController;
import model.Course;
import model.Student;

public class DemoConfig extends JFinalConfig {

    @Override
    public void configConstant(Constants me) {
    }

    @Override
    public void configHandler(Handlers me) {
        // TODO Auto-generated method stub

    }

    @Override
    public void configInterceptor(Interceptors me) {
        // TODO Auto-generated method stub

    }

    @Override
    public void configPlugin(Plugins me) {
        C3p0Plugin  cp  =  new  C3p0Plugin("jdbc:mysql://localhost/test", "root", "root");
        me.add(cp);
        ActiveRecordPlugin arp = new ActiveRecordPlugin(cp);
        me.add(arp);
        arp.addMapping("student", "studentId", Student.class);
        arp.addMapping("course", "courseId", Course.class);
    }

    @Override
    public void configRoute(Routes me) {
        me.add("/", StudentController.class);
        me.add("/student", StudentController.class);
        me.add("/course", CourseController.class);
    }

}
