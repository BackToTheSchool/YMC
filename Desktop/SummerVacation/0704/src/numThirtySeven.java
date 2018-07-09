import java.util.*;

public class numThirtySeven {
    public static void main(String[] args) {
        Random makePassword = new Random();
        Scanner scan = new Scanner(System.in);
        int length,numbers,characters,word;
        List<Object>password = new ArrayList();
        System.out.print("What's the minimum length? ");
        length = scan.nextInt();
        System.out.print("How many special characters? ");
        characters = scan.nextInt();
        System.out.print("How many numbers? ");
        numbers = scan.nextInt();
        //97~122 char, 33~38 special
        for(int count = 0 ; count < characters; count++) {
                word = makePassword.nextInt(15) + 33;
                password.add((char)word);
        }
        for(int count = 0; count < numbers; count++){
                word = makePassword.nextInt(10);
                password.add(word);
        }
        if(length > characters+numbers){
            for(int count = 0; count < length - characters - numbers ; count++){
                word = makePassword.nextInt(26)+ 97;
                password.add((char)word);
            }
        }
        else{
            for(int count = 0; count < makePassword.nextInt(5)+1;count++){
                word = makePassword.nextInt(26) + 97;
                password.add((char)word);
            }
        }
        System.out.print("Your password is ");
        for(Object alpha : password){
            System.out.print(alpha);
        }
    }
}
