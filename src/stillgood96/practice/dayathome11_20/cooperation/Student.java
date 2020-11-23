package stillgood96.practice.dayathome11_20.cooperation;

public class Student {
    private String name;
    private int money;

    public Student(String name,int money){
        this.name=name;
        this.money=money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        money-=1000;
    }

    public void takeSubway(Subway subway){
        subway.take(1500);
        money-=1500;
    }
    public void showInfo(){
        System.out.printf("%s의 남은돈은 %d원입니다.\n",name,money);

    }

}
