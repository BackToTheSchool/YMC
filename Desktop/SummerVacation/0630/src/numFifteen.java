import java.util.Scanner;
public class numFifteen {
    public static void main(String[] args) {
        String password = "joons";
        String input;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the password?");
        input = scan.nextLine();
        if(password.equals(input)){
            System.out.print("Welcome.");
        }
        else{
            System.out.print("Your password is incorrect.");
        }
    }
}