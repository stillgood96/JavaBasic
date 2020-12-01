package stillgood96.lunchtime12_01;

public class Bus {
    int busNumber;
    int money;
    int passengerCount;


    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }
    public void take(int income) {
        money +=1000;
        passengerCount++;
    }
    public void busInfo() {
        System.out.printf("%d번 버스의 총 수입은 %d이며 승객수는 %d입니다.\n",busNumber,money,passengerCount);
    }

}
