package quize;

public class Question {


    private String questionText;
    private String[] options;
    private int correctAnswer; // Will use Index correct answer

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrectAnswer(int choice) {
        return (choice - 1) == correctAnswer;
    }

}
