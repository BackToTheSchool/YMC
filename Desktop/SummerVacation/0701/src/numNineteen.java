import java.util.Scanner;
public class numNineteen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight, height,result;
        System.out.print("How much weigh you are? ");
        weight = scan.nextDouble();
        System.out.print("How much tall you are? ");
        height = scan.nextDouble() / 100 ;
        result = weight / Math.pow(height,2);
        if(result < 18.5){
            System.out.printf("Your BMI is %.1f. You need to eat something.",result);
        }
        else if(result > 25){
            System.out.printf("Your BMI is %.1f. You need to lose some weight.",result);
        }
        else{
            System.out.printf("Your BMI is %.1f. You are perfect.",result);
        }
    }
}
