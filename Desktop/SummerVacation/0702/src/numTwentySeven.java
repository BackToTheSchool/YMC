import java.util.Scanner;
public class numTwentySeven {
    public static void main(String[] args) {
        numTwentySeven check = new numTwentySeven();
        Scanner scan = new Scanner(System.in);
        String fiName,laName,code,id;
        System.out.print("Enter the first name: ");
        fiName = scan.next();
        System.out.print("Enter the last name: ");
        laName = scan.next();
        System.out.print("Enter the ZIP code: ");
        code = scan.next();
        System.out.print("Enter an employee ID: ");
        id = scan.next();
        check.validateInput(fiName,laName,code,id);
    }
    public boolean checkID(String id){
        if(id.length() == 7){//if length is perfect
            if(!Character.isLetter(id.charAt(0))&&!Character.isLetter(id.charAt(1)))// if first 2 letters isn't perfect
                return false;
            else if(id.charAt(2)!='-')// if 3rd letter isn't -
                return false;
            else{
                char code[] = id.toCharArray();
                for(int count = 3 ; count < id.length(); count++){//check other letters
                    if(!Character.isDigit(code[count]))//if other letters aren't numbers
                        return false;
                }
                return true;//everything is perfect
            }
        }
        else{// length is wrong
            return false;
        }
    }
    public boolean validateInput(String firstName, String secondName, String zipCode, String employeeId){
        boolean result = true;
        String message = null;
        if(firstName.length() < 2){
            message = firstName + " is too short\n";
            result = false;
        }
        if(secondName.length() < 2){
            message = message + secondName + " is too short.\n";
            result = false;
        }
        if(!checkID(employeeId)){
            message = message + employeeId + " is wrong.\n";
            result = false;
        }
        char[] code = zipCode.toCharArray();
        for(char c : code){
            if(!Character.isDigit(c)){
                result = false;
                message = message + zipCode + " is wrong.\n";
                System.out.print(message);
                return result;
            }
        }
        if(result){
            System.out.print("There are no errors.");
        }
        else{
            System.out.print(message);
        }
        return result;
    }
}
