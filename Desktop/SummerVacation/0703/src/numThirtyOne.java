import java.util.Scanner;
public class numThirtyOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean finish = true;
        String pulse =null;
        String age = null;
        while(finish){
            System.out.print("Input your resting pulse: ");
            pulse = scan.next();
            System.out.print("Input your age: ");
            age = scan.next();
            char[] restingPulse = pulse.toCharArray();
            char[] inputAge = age.toCharArray();
            for(char c : restingPulse){
                if(!Character.isDigit(c))
                    finish = true;
                else
                    finish = false;
            }
            for(char c : inputAge){
                if(!Character.isDigit(c))
                    finish = true;
                else
                    finish = false;
            }
            if(finish == true)
                System.out.print("Input properly.\n");
        }
        System.out.print("Intensity     | Rate\n");
        System.out.print("--------------|------\n");
        for(double intensity = 0.5 ; intensity < 1; intensity = intensity+0.05){
            double result = ((220 - Integer.parseInt(age))-Integer.parseInt(pulse))*intensity+Integer.parseInt(pulse);
            double rate = intensity * 100;
            System.out.printf("%d           | %d bpm\n",(int)rate,(int)result);
        }
    }
}
