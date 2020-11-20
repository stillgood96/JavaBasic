package lab.day11_20;

public class Subway {
    int lineNumber;
    int income;
    int count;

    public Subway(int lineNumber){
        this.lineNumber=lineNumber;
    }
    public void take(int money){
        this.income=money;
        count++;
    }
    public void subwayInfo(){
        System.out.printf("%d번 지하철의 총승객수는 %d이며 수입은 %d원입니다.\n",lineNumber,count,income);
    }
}
