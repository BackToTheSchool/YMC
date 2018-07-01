import java.util.Scanner;
public class numTwentythree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char answer;
        System.out.print("열쇠를 꽃고 돌렸을 때 차가 조용한가? ");
        answer = scan.next().charAt(0);
        if(answer == 'y'){
            System.out.print("배터리 단자가 부식되었는가? ");
            answer = scan.next().charAt(0);
            if(answer == 'y'){
                System.out.print("단자를 깨끗하게 하고 다시 시도하라.");
            }
            else{
                System.out.print("케이블을 교체하고 다시 시도하라.");
            }
        }
        else{
            System.out.print("차에서 달깍거리는 소리가 나는가? ");
            answer = scan.next().charAt(0);
            if(answer == 'y'){
                System.out.print("배터리를 교체하고 다시 시도하라");
            }
            else{
                System.out.print("시동이 완전히 걸리지 않는가? ");
                answer = scan.next().charAt(0);
                if(answer == 'y'){
                    System.out.print("점화플러그 연결 상태를 점검하라.");
                }
                else{
                    System.out.print("엔진이 동작한 후 바로 꺼지는가? ");
                    answer = scan.next().charAt(0);
                    if(answer == 'y'){
                        System.out.print("차에 연료 분사 장치가 있는가? ");
                        answer = scan.next().charAt(0);
                        if(answer == 'y'){
                            System.out.print("초크가 제대로 여닫히느지 확인하라.");
                        }
                        else{
                            System.out.print("서비스 센터에 의뢰하라.");
                        }
                    }
                }
            }
        }
    }
}
