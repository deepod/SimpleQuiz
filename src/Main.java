import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // for user input
        String userAnswer; // will be used to store the user's answer
        int points = 0;

        //create two question objects and update their variables
        Question question1 = new Question();
        question1.questionText = "What is the capital of France?";
        question1.answerText = "Paris";

        Question question2 = new Question();
        question2.questionText = "What is the capital of Germany?";
        question2.answerText = "Berlin";

        //process question 1
        System.out.println(question1.questionText); //output the question
        userAnswer = sc.nextLine();
        if (userAnswer.equals(question1.answerText)){
            System.out.println("Correct");
            points = points + 1;
        }
        else{
            System.out.println("Wrong");
        }

        //next question
        System.out.println(question2.questionText); //output the question
        userAnswer = sc.nextLine();
        if (userAnswer.equals(question2.answerText)){
            System.out.println("Correct");
            points = points + 1;
        }
        else{
            System.out.println("Wrong");
        }

        //output points
        System.out.println("Your points so far: " + points);


    }
}