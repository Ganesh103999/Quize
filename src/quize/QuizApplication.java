package quize;

import java.util.Scanner;

public class QuizApplication {


    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        Admin admin = new Admin(quiz);

        // Adding some hardcoded questions
        quiz.addQuestion(new Question("Which is not type of Inheritance",
                new String[] { "Abstract", "Multi level", "Hybrid", "Single level" }, 0));
        quiz.addQuestion(new Question("What is 5 + 3?",
                new String[] { "5", "8", "6", "9" }, 1));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" ");
            System.out.println("1. Take Quiz");
            System.out.println("2. Admin - Add Question");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                quiz.takeQuiz();
            } else if (choice == 2) {
                admin.addQuestion();
            } else if (choice == 3) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }



}
