import java.util.Scanner;

public class numSeven{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? ");
        double length = scan.nextFloat();
        System.out.print("What is the width of the room in feet? ");
        double width = scan.nextFloat();
        double result = Math.pow((length*width),2);
        result = Math.sqrt(result)* 0.09290304;
        System.out.printf("You entered dimensions of %.3f feet by %.3f feet.\nThe area is\n%d square feet\n%.3f square meters",length,width,(int)(length*width),result);
    }
}