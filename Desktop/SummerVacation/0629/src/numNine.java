import java.util.Scanner;
public class numNine {
    public static final int PAINT = 9;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the length of the room in meters? ");
        int length = scan.nextInt();
        System.out.print("What is the width of the room in meters? ");
        int width = scan.nextInt();
        int result = length * width;
        if(result % PAINT > 0 ){
            result = result / PAINT + 1;
        }
        else{
            result = result / PAINT;
        }
        System.out.printf("You will need to but %d liters of paint.", result);

    }
}
