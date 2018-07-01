import java.util.Scanner;
public class numThirteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount, rate, result;
        int years, interest;
        System.out.print("What is the principal amount? ");
        amount = scan.nextDouble();
        System.out.print("What is the rate? ");
        rate = scan.nextDouble();
        System.out.print("What is the number of year? ");
        years = scan.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        interest = scan.nextInt();
        result = amount * Math.pow(1+(rate/100/years),interest*years);
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is\n$%.2f" ,amount,rate,years,interest,result);
    }
}
