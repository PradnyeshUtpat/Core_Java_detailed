package Project.QuizService;

import java.util.Scanner;

public class QuizService {
    Question[] questions;

    public QuizService(Question[] questions) {
        this.questions = questions;
    }

    public void startQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in); 
        try {
            for (Question question : questions) {
                System.out.println(question.getQuestionText());
                System.out.println("1. " + question.getOption1());
                System.out.println("2. " + question.getOption2());
                System.out.println("3. " + question.getOption3());
                System.out.println("4. " + question.getOption4());

                System.out.print("Enter your answer: ");
                int answer = scanner.nextInt();

                if (answer == question.getAnswer()) {
                    score++;
                }
            }

            System.out.println("Your final score is: " + score);

        } catch (Exception e) {
            System.out.println("An error occurred while running the quiz: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}