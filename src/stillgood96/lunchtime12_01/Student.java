package stillgood96.lunchtime12_01;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        money-=1000;
    }
    public void takeSubway(Subway subway) {
        subway.take(1500);
        money-=1500;
    }

    public void showInfo(){
        System.out.printf("%s의 남은돈은 %d입니다.\n",name,money);
    }
}
