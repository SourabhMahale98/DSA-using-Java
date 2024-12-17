import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        return this.age > that.age ? 1 : -1;
    }

}

public class ComparableEx {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(26, "Nikhil"));
        studentList.add(new Student(18, "Tanu"));
        studentList.add(new Student(34, "Mama"));
        studentList.add(new Student(20, "dadu"));
        studentList.add(new Student(23, "gaurav"));

        Collections.sort(studentList);

        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
