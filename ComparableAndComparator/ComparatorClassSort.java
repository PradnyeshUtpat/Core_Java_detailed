package ComparableAndComparator;
import java.util.*;
class Student2{
    private String name;
    private double cgpa;
    public Student2(String name, double cgpa){
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
class comp implements Comparator<Student2>{
    @Override
    public int compare(Student2 s1, Student2 s2){
        return Double.compare(s1.getCgpa(), s2.getCgpa()); // for ascending order of CGPA
    }
}
class comp2 implements Comparator<Student2>{
    @Override
    public int compare(Student2 s1, Student2 s2){
        return Double.compare(s2.getCgpa(), s1.getCgpa()); // for descending order of CGPA
    }
}
public class ComparatorClassSort {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Bob", 3.8);
        Student2 s2 = new Student2("Alice", 3.8);
        Student2 s3 = new Student2("Charlie", 3.2);
        List<Student2> Student2s = new ArrayList<>();
        Student2s.add(s1);
        Student2s.add(s2);
        Student2s.add(s3);
        Student2s.sort(new comp());
        for(Student2 s: Student2s){
            System.out.println(s.getName() + " " + s.getCgpa());
        }
        // Shorthand
        Comparator<Student2> comp2 = Comparator.comparing(Student2::getCgpa);
        Comparator<Student2> comp3 = Comparator.comparing(Student2::getCgpa).reversed().thenComparing(Student2::getName);  
        // This will sort the Student2s based on their CGPA in descending order. If two Student2s have the same CGPA, then they will be sorted based on their name in ascending order.      
        Student2s.sort(comp2);
        for(Student2 s: Student2s){
            System.out.println(s.getName() + " " + s.getCgpa());
        }
        System.out.println("Sorting in descending order");
        Student2s.sort(comp3);
        for(Student2 s: Student2s){
            System.out.println(s.getName() + " " + s.getCgpa());
        }
    }
    // Output:
    // Charlie 3.2
    // Alice 3.5
    // Bob 3.8
}
