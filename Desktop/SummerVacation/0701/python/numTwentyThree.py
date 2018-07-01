answer = input("열쇠를 꽃고 돌렸을 떄 차가 조용한가? ")
if answer == "y" :
    answer = input("배터리 단자가 부식되었는가? ")
    if answer == "y" :
        print("단자를 꺠끗하게 하고 다시 시도해라.")
    else :
        print("케이블을 교체하고 다시 시도해라")
else :
    answer = input("차에서 달깍거리는 소리가 나는가? ")
    if answer == "y" :
        print("배터리를 교체하고 다시 시도해라")
    else :
        answer = input("시동이 완전히 걸리지 않는가? ")
        if answer == "y" :
            print("점화플러그 연결 상태를 점검하라")
        else :
            answer = input("엔진이 동작한 후 바로 꺼지는가? ")
            if answer == "y" :
                answer = input("차에 연료 분사 장치가 있는가? ")
                if answer == "y":
                    print("초크가 제대로 여닫히는지 확인하라.")
                else :
                    print("서비스센터에 의뢰하라")
