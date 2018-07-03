import java.util.Vector;
import java.util.Scanner;
import java.util.Random;
public class numThirtyFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector<String> name = new Vector<String>(1);
        String player = null;
        Random choice = new Random();
        boolean finish = true;
        do{
            System.out.print("Enter a name: ");
            player = scan.nextLine();
            if(player.length() !=0){
                name.add(player);
            }
            else
                finish = false;

        }while(finish);
        if(name.size() > 0){
            int a = choice.nextInt(name.size());
            System.out.print("The winner is " + name.elementAt(a));
        }
        else
            System.out.print("Input properly.");
    }
}
