import java.util.Scanner;
public class numOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("What is your name ? ");
        name = scan.nextLine();
        System.out.println("Hello " + name + ".\nNice to meet you.");
    }
}
