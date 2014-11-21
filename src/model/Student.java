package model;

/**
 * @author Xu Jingyi
 * @date 2014-11-21
 * @since JDK1.6
 */
import com.jfinal.plugin.activerecord.Model;

public class Student extends Model<Student> {
    public static final Student dao = new Student();

    public Course getCourse() {
        return Course.dao.findById(get("courseId"));
    }

}