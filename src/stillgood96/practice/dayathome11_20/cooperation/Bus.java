package stillgood96.practice.dayathome11_20.cooperation;

public class Bus {
    private int bNum;
    private int income;
    private int count;


    public Bus(int bNum){
        this.bNum=bNum;
    }
    public void take(int money){
        income+=1000;
        count++;
    }
    public void busInfo(){
        System.out.printf("%d의 승객수는 %d명이었으며 수입은 총 %d원 입니다.\n",bNum,count,income);
    }
}
