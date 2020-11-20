package lab.day11_20;

public class Bus {
    int bNum;
    int income;
    int count;

    public Bus(int bNum) {
        this.bNum = bNum;
    }

    public void take(int money){
        this.income+=money;
        count++;
    }
    public void busInfo(){
        System.out.printf("%d번의 총 승객수는 %d명이며 수입은 %d원입니다.\n",bNum,count,income);
    }
}
