import java.util.Scanner;
public class numTwentyone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mon[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.print("What is the number of the month? ");
        int number = scan.nextInt();
        System.out.printf("%d is %s.",number,mon[number - 1]);
    }
}
