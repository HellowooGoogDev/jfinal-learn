package controller;

/**
 * @author Xu Jingyi
 * @date 2014-11-21
 * @since JDK1.6
 */
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import interceptor.StudentInterceptor;
import model.Student;

import java.util.List;

public class StudentController extends Controller {
    @Before(StudentInterceptor.class)
    public void index() {
        List<Student> list = Student.dao.find("select * from student");
        setAttr("studentList", list);
        render("/index.ftl");
    }

    public void add() {
        render("/add.ftl");
    }

    public void delete() {
        // 获取表单域名为studentID的值
        // Student.dao.deleteById(getPara("studentID"));
        // 获取url请求中第一个值
        Student.dao.deleteById(getParaToInt());
        forwardAction("/student");
    }

    public void update() {
        Student student = getModel(Student.class);
        student.update();
        forwardAction("/student");
    }

    public void get() {
        Student student = Student.dao.findById(getParaToInt());
        setAttr("student", student);
        render("/update.ftl");
    }

   // @Before(StudentValidator.class)
    public void save() {
        Student student = getModel(Student.class);
        student.save();
        forwardAction("/student");
    }

}
