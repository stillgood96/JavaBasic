package stillgood96.lunchtime12_01;

public class Subway {
    int SubwayNum;
    int money;
    int passengerCount;


    public Subway(int subwayNum) {
        SubwayNum = subwayNum;
    }

    public void take(int income){
        money += 1500;
        passengerCount++;
    }
    public void subwayInfo() {
        System.out.printf("%d호선 지하철의 총 수입은 %d원이며 총 승객수는 %d명입니다.\n",SubwayNum,money,passengerCount);
    }
}
