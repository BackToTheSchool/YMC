import java.util.Scanner;
import java.util.Random;
public class numThirtyThree {
    public static void main(String[] args) {
        Random makeAnswer = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your question? ");
        String question = scan.next();
        int answer = makeAnswer.nextInt(4);
        switch(answer){
            case 0 : question = "Yes."; break;
            case 1 : question = "No."; break;
            case 2 : question = "Maybe."; break;
            case 3 : question = "Ask again later."; break;
        }
        System.out.print(question);
    }
}

