import java.util.*;

/**
 * Created by Luts on 2015/12/5.
 */
public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private Set<Course> courses;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
        this.courses = new HashSet<Course>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Student))
            return false;
        Student other = (Student) obj;
        if (this.getName()== null) {
            if (other.getName() != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    //@Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return this.id.compareTo(o.id);
    }
}

