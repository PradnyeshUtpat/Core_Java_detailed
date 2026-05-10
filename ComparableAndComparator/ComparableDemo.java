package ComparableAndComparator;
import java.util.*;
class Student implements Comparable<Student>{
    private String name;
    private double cgpa;
    public Student(String name, double cgpa){
        this.name = name;
        this.cgpa = cgpa;
    }
    public String getName(){
        return name;
    }
    public double getCgpa(){
        return cgpa;
    }
    @Override
    public int compareTo(Student that){
        return Double.compare(this.cgpa, that.cgpa); // for ascending order of CGPA
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 3.8);
        Student s2 = new Student("Alice", 3.8);
        Student s3 = new Student("Charlie", 3.2);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Collections.sort(students); // This will sort the students based on their CGPA in ascending order.
        for(Student s: students){
            System.out.println(s.getName() + " " + s.getCgpa());
        }
    }
}
