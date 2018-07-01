import java.util.Scanner;
public class numSeventeen {
    public final static double MAN = 0.73;
    public final static double WOMAN = 0.6;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double oz,weight,result;
        int hours;
        char sex;
        System.out.print("How much oz you drink? ");
        oz  = scan.nextDouble();
        System.out.print("How weigh you are? ");
        weight = scan.nextDouble();
        System.out.print("How many hours after you drink? ");
        hours = scan.nextInt();
        System.out.print("If you are man input 'm', if you are woman input 'w'. ");
        sex = scan.next().charAt(0);
        if(sex == 'm'){
            result = oz * 5.14 / (weight * MAN) - (0.015 * hours);
        }
        else if(sex == 'w'){
            result = oz * 5.14 / (weight * WOMAN) - (0.015 *hours);
        }
        else{
            System.out.print("Input your gender properly.");
            result = 0;
        }
        if((0 < result) && (result < 0.08)){
            System.out.printf("Your BAC is %.2f\nIt is legal for you drive.",result);
        }
        else if(result == 0){

        }
        else{
            System.out.printf("Your BAC is %.2f\nIt is illegal for you drive.",result);
        }


    }
}
