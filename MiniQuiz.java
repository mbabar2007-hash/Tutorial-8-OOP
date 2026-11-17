// ************************************************************
// MiniQuiz.java
//
// Gives the user a two-question quiz using Question objects.
// ************************************************************
import java.util.Scanner;

public class MiniQuiz {
    public static void askQuestion(Question q, Scanner scan) {
        System.out.println("Question (level " + q.getLevel() + "): " + q.getText());
        System.out.print("Your answer: ");
        String response = scan.nextLine();
        if (q.isCorrect(response))
            System.out.println("Correct!");
        else   
            System.out.println("Sorry, the answer is " + q.getAnswer());
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Question q1 = new Question("How many bits are in a byte?", "8");
        q1.setLevel(1);

        Question q2 = new Question("Which keyword makes a class use an interface?",
                                    "implements");
        q2.setLevel(3);

        askQuestion(q1, scan);
        askQuestion(q2, scan);
    }
}