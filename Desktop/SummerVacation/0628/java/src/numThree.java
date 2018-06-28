import java.util.Scanner;
public class numThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, quote;
        System.out.print("What is the quote ? ");
        quote = scan.nextLine();
        System.out.print("Who said that ? ");
        name = scan.nextLine();
        System.out.print(name + " says, "+ "\"" + quote +"\"");
    }
}
