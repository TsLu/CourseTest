import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * Created by Luts on 2015/12/5.
 */
public class ListTest {
    public List courseToSelect;
    public ListTest(){
        this.courseToSelect = new ArrayList();
    }

    //向courseToSelect中添加备选课程
    public void testAdd(){
        Course cr1 = new Course("1", "数据结构");
        courseToSelect.add(cr1);
        Course temp = (Course) courseToSelect.get(0);
        System.out.println("添加了课程：" +  temp.getId() + ":" + temp.getName());

        Course cr2 = new Course("2", "C语言");
        courseToSelect.add(0, cr2);
        Course temp2 = (Course) courseToSelect.get(0);
        System.out.println("添加了课程：" + temp.getId() + ":" + temp2.getName());

        courseToSelect.add(cr1);
        Course temp0 = (Course) courseToSelect.get(2);
        System.out.println("添加了课程：" + temp.getId() + ":" + temp0.getName());

        Course[] course = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
        courseToSelect.addAll(Arrays.asList(course));
        Course temp3 = (Course) courseToSelect.get(2);
        Course temp4 = (Course) courseToSelect.get(3);

        System.out.println("添加了两门课程：" + temp3.getId() + ":" +
                temp3.getName() + ";" + temp4.getId() + ":" + temp4.getName());

        Course[] course2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
        courseToSelect.addAll(2, Arrays.asList(course2));
        Course temp5 = (Course) courseToSelect.get(2);
        Course temp6 = (Course) courseToSelect.get(3);
        System.out.println("添加了两门课程：" + temp5.getId() + ":" +
                temp5.getName() + ";" + temp6.getId() + ":" + temp6.getName());
    }

    //取得List中的元素
    public void testGet() {
        int size = courseToSelect.size();
        System.out.println("有如下课程待选：");
        for(int i= 0 ; i < size; i++) {
            Course cr = (Course) courseToSelect.get(i);
            System.out.println("课程：" + cr.getId() + ":" + cr.getName());
        }
    }

    //通过迭代器来访问遍历List
    public void testIterator() {
        //通过集合的iterator方法，取得迭代器的实例
        Iterator<Course> it = courseToSelect.iterator();
        System.out.println("有如下课程待选(通过迭代器访问)：");
        while(it.hasNext()) {
            Course cr = it.next();
            System.out.println("课程：" + cr.getId() + ":" + cr.getName());
        }
    }

    //通过for each方法访问集合元素
    public void testForEach() {
        System.out.println("有如下课程待选(通过for each访问)：");
        for (Object obj : courseToSelect) {
            Course cr = (Course) obj;
            System.out.println("课程：" + cr.getId() + ":" + cr.getName());
        }
    }

    //修改元素
    public void testModify() {
        courseToSelect.set(4, new Course("7", "毛概"));
    }

    //删除元素
    public void testRemove() {
//		Course cr = (Course) coursesToSelect.get(4);
        System.out.println("即将删除4位置和5位置上的课程！");
        Course[] courses = {(Course) courseToSelect.get(4), (Course) courseToSelect.get(5)};
        courseToSelect.removeAll(Arrays.asList(courses));
        //		coursesToSelect.remove(4);
        System.out.println("成功删除课程！");
        testForEach();
    }

    //添加一些别的东西
    public void testType() {
        System.out.println("能否往List中添加一些奇怪的东西呢！？");
        courseToSelect.add("我不是课程，我只是一个无辜的字符串！！");
    }

    public static void main( String[] args) {
        ListTest lt = new ListTest();
        lt.testAdd();
      //  lt.testType();
        lt.testForEach();
		lt.testGet();
//		lt.testIterator();
//		lt.testForEach();
//		lt.testModify();
//		lt.testForEach();
//		lt.testRemove();
    }


}
