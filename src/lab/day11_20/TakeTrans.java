package lab.day11_20;

public class TakeTrans {
    public static void main(String[] args) {
        Student lee=new Student("이선우",5000);
        Student yoon=new Student("윤혜린",15000);
        Bus bus100=new Bus(100);
        Subway greenLine=new Subway(2);

        lee.takeBus(bus100);
        yoon.takeSubway(greenLine);

        bus100.busInfo();
        greenLine.subwayInfo();

        lee.showInfo();
        yoon.showInfo();
    }
}
