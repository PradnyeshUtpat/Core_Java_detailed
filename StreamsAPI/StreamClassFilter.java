package StreamsAPI;

import java.util.ArrayList;
import java.util.List;

class Student1{
    private String name;
    private double cgpa;
    private String department;
    Student1(String name,double cgpa,String department){
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
        List<Student1> students = new ArrayList<>();
        students.add(new Student1("Pradnyesh",8.67,"Computer Engineering"));
        students.add(new Student1("Aman",8.68,"Mechanical Engineering"));
        students.add(new Student1("Anshul",9.17,"Instrumentation Engineering"));
        students.add(new Student1("Soham",7.67,"Computer Engineering"));
        students.add(new Student1("Vivek",8.4,"Computer Engineering"));
        List<Student1> toppers = students.stream().filter((student)->student.getCgpa()>8.5).toList();
        System.out.println(toppers.toString());
        List<Student1> computerToppers = toppers.stream().filter((element)->element.getDepartment().equals("Computer Engineering")).toList();
        System.out.println(computerToppers);
    }
}
