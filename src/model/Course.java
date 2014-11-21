package model;

/**
 * @author Xu Jingyi
 * @date 2014-11-21
 * @since JDK1.6
 */
import com.jfinal.plugin.activerecord.Model;

public class Course extends Model<Course> {
    public static final Course dao = new Course();
}
