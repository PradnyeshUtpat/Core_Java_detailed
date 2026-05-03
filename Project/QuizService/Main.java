package Project.QuizService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the OOP Quiz!");
        Question q1 = new Question(1, "What does OOP stand for?", "Object Oriented Programming", "Object Organized Programming", "Ordered Object Programming", "Optimized Object Programming", 1);
        Question q2 = new Question(2, "Which concept allows reuse of code?", "Encapsulation", "Inheritance", "Abstraction", "Polymorphism", 2);
        Question q3 = new Question(3, "Which concept hides implementation details?", "Encapsulation", "Inheritance", "Abstraction", "Polymorphism", 3);
        Question q4 = new Question(4, "Which feature allows a method to have different implementations?", "Encapsulation", "Inheritance", "Polymorphism", "Abstraction", 3);
        Question q5 = new Question(5, "Which keyword is used to inherit a class in Java?", "this", "super", "extends", "implements", 3);
        Question q6 = new Question(6, "What is it called when a class has multiple methods with same name but different parameters?", "Overriding", "Overloading", "Encapsulation", "Inheritance", 2);
        Question q7 = new Question(7, "Which concept binds data and methods together?", "Encapsulation", "Polymorphism", "Abstraction", "Inheritance", 1);
        Question q8 = new Question(8, "Which keyword is used to refer to current object?", "this", "super", "static", "final", 1);
        Question q9 = new Question(9, "What is runtime polymorphism also known as?", "Method Overloading", "Method Overriding", "Encapsulation", "Abstraction", 2);
        Question q10 = new Question(10, "Which access modifier makes members accessible only within the same class?", "public", "protected", "private", "default", 3);
        Question q11 = new Question(11, "What is a constructor?", "A method to destroy objects", "A method to initialize objects", "A method to copy objects", "A static method", 2);
        Question q12 = new Question(12, "Which concept means one interface, multiple implementations?", "Encapsulation", "Inheritance", "Polymorphism", "Abstraction", 3);
        Question q13 = new Question(13, "Which keyword is used to prevent inheritance?", "final", "static", "const", "super", 1);
        Question q14 = new Question(14, "Which concept allows a class to be defined without providing implementation?", "Encapsulation", "Inheritance", "Polymorphism", "Abstraction", 4);
        Question q15 = new Question(15, "Which keyword is used to refer to parent class?", "this", "super", "static", "final", 2);
        Question q16 = new Question(16, "What is compile-time polymorphism also known as?", "Method Overloading", "Method Overriding", "Encapsulation", "Abstraction", 1);
        Question q17 = new Question(17, "Which keyword is used to call parent class constructor?", "this", "super", "extends", "implements", 2);
        Question q18 = new Question(18, "What is a class?", "Instance of object", "Blueprint of object", "Method of object", "Variable of object", 2);
        Question q19 = new Question(19, "What is an object?", "Blueprint of class", "Instance of class", "Method", "Variable", 2);
        Question[] questions = {q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19};
        QuizService quizService = new QuizService(questions);
        quizService.startQuiz();
    }
}

