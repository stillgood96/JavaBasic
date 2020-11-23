package stillgood96.practice.dayathome11_20.cooperation;

public class Subway {
    private int lNum;
    private int income;
    private int count;


    public Subway(int lnum){
        this.lNum=lnum;
    }
    public void take(int money){
        income+=1500;
        count++;
    }
    public void subwayInfo(){
        System.out.printf("%d번의 승객은 %d명 이었으며 수입은 총 %d원 입니다.",lNum,count,income);
    }
}
