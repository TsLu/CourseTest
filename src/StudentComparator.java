/**
 * Created by Luts on 2015/12/5.
 */
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        return o1.getName().compareTo(o2.getName());
    }

}
