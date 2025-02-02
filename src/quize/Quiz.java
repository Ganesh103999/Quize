package quize;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;
    private int correctAnswers;
    private int incorrectAnswers;
    private int xyz;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        correctAnswers = 0;
        incorrectAnswers = 0;

        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Your answer: ");
            int choice = scanner.nextInt();

            if (question.isCorrectAnswer(choice)) {
                correctAnswers++;
            } else {
                incorrectAnswers++;
            }
        }
        displayResults();
    }

    private void displayResults() {
        int totalQuestions = correctAnswers + incorrectAnswers;
        double percentage = (correctAnswers * 100.0) / totalQuestions;

        System.out.println("\nQuiz Results:");
        System.out.println("Correct Answers: " + correctAnswers);
        System.out.println("Incorrect Answers: " + incorrectAnswers);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage <= 30) {
            System.out.println("Feedback: You must study much harder.");
        } else if (percentage <= 60) {
            System.out.println("Feedback: You are studying good. Need some more study.");
        } else if (percentage <= 90) {
            System.out.println("Feedback: You are becoming a topper with just a bit of extra effort.");
        } else {
            System.out.println("Feedback: You are very good at concepts and in the top list!");
        }
    }
}
