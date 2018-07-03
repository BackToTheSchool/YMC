import java.util.Scanner;
public class numTwentyFive {
    public int isDigit(String arg){//check String is Digit
        char[] password = arg.toCharArray();
        int count = 0;
        for(char c : password){
            if(!Character.isDigit(c))
                count++;
        }
        return count;
    }
    public int isAlpha(String arg){//check String is letter
        char[] password = arg.toCharArray();
        int count = 0;
        for(char c : password){
            if(!Character.isLetter(c))
                count++;
        }
        return count;
    }
    public boolean isAlnum(String arg){//check String is letter or digit
        char[] password = arg.toCharArray();
        for(char c : password){
            if(!Character.isLetterOrDigit(c))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        numTwentyFive checkPassword = new numTwentyFive();
        System.out.print("Input your password : ");
        String password = scan.next();
        if(password.length() < 8){
            if(checkPassword.isDigit(password) == password.length()){
                System.out.print(password + " Your password is very weak.");
            }
            else if(checkPassword.isAlpha(password) == password.length()){
                System.out.print(password + " Your password is weak,");
            }
            else{
                System.out.print(password + " Your password is so-so.");
            }
        }
        else{
            if(checkPassword.isAlpha(password) > 0 && checkPassword.isDigit(password) > 0){
                if(checkPassword.isAlnum(password)){
                    System.out.print(password + " Your password is strong.");
                }
                else{
                    System.out.print(password + " Your password is very strong.");
                }
            }
            else{
                System.out.print(password + " Your password is strong.");
            }
        }

    }
}
