package ComparableAndComparator;
import java.util.*;
class Student{
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
}
class comp implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return Double.compare(s1.getCgpa(), s2.getCgpa()); // for ascending order of CGPA
    }
}
class comp2 implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return Double.compare(s2.getCgpa(), s1.getCgpa()); // for descending order of CGPA
    }
}
public class ComparatorClassSort {
    public static void main(String[] args) {
        Student s1 = new Student("Bob", 3.8);
        Student s2 = new Student("Alice", 3.8);
        Student s3 = new Student("Charlie", 3.2);
        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.sort(new comp());
        for(Student s: students){
            System.out.println(s.getName() + " " + s.getCgpa());
        }
        // Shorthand
        Comparator<Student> comp2 = Comparator.comparing(Student::getCgpa);
        Comparator<Student> comp3 = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName);  
        // This will sort the students based on their CGPA in descending order. If two students have the same CGPA, then they will be sorted based on their name in ascending order.      
        students.sort(comp2);
        for(Student s: students){
            System.out.println(s.getName() + " " + s.getCgpa());
        }
        System.out.println("Sorting in descending order");
        students.sort(comp3);
        for(Student s: students){
            System.out.println(s.getName() + " " + s.getCgpa());
        }
    }
    // Output:
    // Charlie 3.2
    // Alice 3.5
    // Bob 3.8
}
