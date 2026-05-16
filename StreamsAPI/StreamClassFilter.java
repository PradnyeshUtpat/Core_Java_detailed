package StreamsAPI;

import java.util.ArrayList;
import java.util.List;

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
public class StreamClassFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pradnyesh",8.67,"Computer Engineering"));
        students.add(new Student("Aman",8.68,"Mechanical Engineering"));
        students.add(new Student("Anshul",9.17,"Instrumentation Engineering"));
        students.add(new Student("Soham",7.67,"Computer Engineering"));
        students.add(new Student("Vivek",8.4,"Computer Engineering"));
        List<Student> toppers = students.stream().filter((student)->student.getCgpa()>8.5).toList();
        System.out.println(toppers.toString());
        List<Student> computerToppers = toppers.stream().filter((element)->element.getDepartment().equals("Computer Engineering")).toList();
        System.out.println(computerToppers);
    }
}
