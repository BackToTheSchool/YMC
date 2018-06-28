import java.util.Scanner;
public class numFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fNum,sNum;
        int firstNumber, secondNumber;
        System.out.print("What is first number? ");
        fNum = scan.nextLine();
        System.out.print("What is second number? ");
        sNum = scan.nextLine();
        firstNumber = Integer.valueOf(fNum);
        secondNumber = Integer.valueOf(sNum);
        System.out.print(fNum + " + " + sNum +" = " + (firstNumber + secondNumber)+ "\n");
        System.out.print(fNum + " - " + sNum +" = " + (firstNumber - secondNumber)+ "\n");
        System.out.print(fNum + " * " + sNum +" = " + (firstNumber * secondNumber)+ "\n");
        System.out.print(fNum + " / " + sNum +" = " + (firstNumber / secondNumber)+ "\n");
    }
}
