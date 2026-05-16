package StreamsAPI;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

class Student{
    private String name;
    private double cgpa;
    private String department;
    Student(String name,double cgpa,String department){
        this.cgpa = cgpa;
        this.name = name;
        this.department = department;
    }
    public String getName(){
        return this.name;
    }
    public double getCgpa(){
        return this.cgpa;
    }
    public String getDepartment(){
        return this.department;
    }
    @Override
    public String toString(){
        return this.name + " " + this.cgpa + " " + this.department;
    }
}
public class StreamsCollect {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pradnyesh",8.67,"Computer Engineering"));
        students.add(new Student("Aman",8.68,"Mechanical Engineering"));
        students.add(new Student("Anshul",9.17,"Instrumentation Engineering"));
        students.add(new Student("Soham",7.67,"Computer Engineering"));
        students.add(new Student("Vivek",8.4,"Computer Engineering"));
        Map<String,List<Student>> deptWiseStudents = students.stream().collect(Collectors.groupingBy(student -> student.getDepartment()));
        System.out.println(deptWiseStudents);

    }
}
