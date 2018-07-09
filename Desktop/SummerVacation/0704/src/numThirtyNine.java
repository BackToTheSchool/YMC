import java.util.ArrayList;
import java.util.List;

class Human{
    private String firstName, secondName,position, date;
    public Human(){
        firstName = null;
        secondName = null;
        position = null;
        date = null;
    }
    public Human setHuman(String fiName, String seName, String job, int day){
        firstName = fiName;
        secondName = seName;
        position = job;
        if(day != 0){
            date = String.valueOf(day/10000)+"-";
            day = day % 10000;
            date = date + String.valueOf(day/100)+"-";
            day = day % 100;
            date = date + String.valueOf(day);
        }
        return this;
    }
    public void showHuman(){
        if(date != null)
        System.out.print(firstName + " " +secondName+"  |"+position+"       |"+date + "\n");
        else
            System.out.print(firstName + " " +secondName+"  |"+position+"       |\n");
    }
    public String getSecondName(){
        return secondName;
    }
}
public class numThirtyNine {
    public List sorting(List<Human> HumanList){
        Human temp = null;
        for(int count =0; count < HumanList.size();count++){
            for(int another = 0; another < HumanList.size(); another++){
                int compare = HumanList.get(another).getSecondName().compareTo(HumanList.get(count).getSecondName());
                if(compare > 0) {
                    temp = HumanList.get(another);
                    HumanList.set(another, HumanList.get(count));
                    HumanList.set(count, temp);
                }
            }
        }
        return HumanList;
    }

    public static void main(String[] args) {
        numThirtyNine example = new numThirtyNine();
        List<Human> humanList= new ArrayList<>();
        humanList.add(new Human().setHuman("John      ","Johnson   ","Manager          ",20161231));
        humanList.add(new Human().setHuman("Tou       ","Xiong     ","Software Engineer",20161015));
        humanList.add(new Human().setHuman("Michaela  ","Michaelson","District Manager ",20151219));
        humanList.add(new Human().setHuman("Jake      ","Jacobson  ","Programmer       ",0));
        humanList.add(new Human().setHuman("Jacpquelyn","Jackson   ","DBA              ",0));
        humanList.add(new Human().setHuman("Sally     ","Weber     ","Web Developer    ",20151218));
        humanList = example.sorting(humanList);
        for(Human a : humanList){
            a.showHuman();
        }
    }
}
