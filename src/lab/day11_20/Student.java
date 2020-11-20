package lab.day11_20;

public class Student {
    String name;
    int money;

    public Student (String name,int money){
        this.name=name;
        this.money=money;
    }
    public void takeBus(Bus bus){
        bus.take(1000);
        this.money-=1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1500);
        this.money-=1500;
    }
    public void showInfo(){
        System.out.printf("%s의 남은돈은 %d원입니다.\n",name,money);
    }
}
