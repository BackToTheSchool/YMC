import java.util.Scanner;
public class numEleven {
    public static final double RATETO = 1113.58575;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double euros,rate;
        System.out.print("How many Euros are you exchanging? ");
        euros = scan.nextDouble();
        System.out.print("What is the exchange rate? ");
        rate = scan.nextDouble();
        System.out.printf("%.2f Euros at an exchange rate of %.2f is\n %.2f dollars",euros,rate,euros*rate/RATETO);
    }
}
