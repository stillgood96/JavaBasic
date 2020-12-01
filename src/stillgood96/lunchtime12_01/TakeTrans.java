package stillgood96.lunchtime12_01;

public class TakeTrans {
    public static void main(String[] args) {
        Student lee = new Student("이선우",12400);
        Student yoon = new Student("윤혜린",24000);
        Bus bus100 = new Bus(100);
        Subway greenLine = new Subway(2);

        lee.takeBus(bus100);
        yoon.takeSubway(greenLine);


        lee.showInfo();
        yoon.showInfo();


        bus100.busInfo();
        greenLine.subwayInfo();
    }
}
