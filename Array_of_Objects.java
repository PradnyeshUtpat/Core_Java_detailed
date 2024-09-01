public class Array_of_Objects {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 1;
        s1.name = "John";
        s1.marks = 81;

        Student s2 = new Student();
        s2.rno = 2;
        s2.name = "Jose";
        s2.marks = 89;

        Student s3 = new Student();
        s3.rno = 3;
        s3.name = "Brendon";
        s3.marks = 91;

        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        for(Student s : student){
            System.out.print(s.rno + " ");
            System.out.print(s.name + " ");
            System.out.print(s.marks + " ");
            System.out.println();
        }

    }
    
}
class Student{
    int rno;
    String name;
    int marks;
}