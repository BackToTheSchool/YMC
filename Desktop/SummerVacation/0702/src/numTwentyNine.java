import java.util.Scanner;
public class numTwentyNine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean finish = true;
        while(finish) {
            boolean check = true;
            System.out.print("What is the rate of return? ");
            String input = scan.next();
            char[] result = input.toCharArray();
            for(char c : result){
                if(!Character.isDigit(c))
                    check = false;
            }
            if(check) {
                if(Integer.parseInt(input) != 0){
                System.out.printf("It will take %d years.",(72 / Integer.parseInt(input)));
                finish = false;
                }
                else
                    System.out.printf("%s is invalid input.\n", input );
            }
            else{
                System.out.printf("%s is invalid input.\n", input );
            }
        }

    }

}
