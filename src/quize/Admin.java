package quize;

import java.util.Scanner;

public class Admin {

 private Quiz quiz;

    public Admin(Quiz quiz) {
        this.quiz = quiz;
    }

    public void addQuestion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the question: ");
        String questionText = scanner.nextLine();
        System.out.println("Enter 4 options:");
        String[] options = new String[4];
        for (int i = 0; i < 4; i++) {
            options[i] = scanner.nextLine();
        }
        System.out.print("Enter the correct answer (1-4): ");
        int correctAnswer = scanner.nextInt();

        Question question = new Question(questionText, options, correctAnswer - 1);
        quiz.addQuestion(question);
        System.out.println("Question added successfully.");
    }
}
