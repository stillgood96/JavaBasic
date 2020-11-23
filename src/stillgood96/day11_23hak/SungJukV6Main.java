package stillgood96.day11_23hak;

import stillgood96.SungJukV0;

import java.util.Scanner;

/**
 * 파일명: SungjukV6
 * 작성일: 2020.11.23
 * 프로그램 설명: 성적처리프로그램 v6
 * 중간고사와 기말고사 성적처리프로그램을 만들려고 함
 * SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 상속을 이용해서 작성하세요
 *
 * 중간고사(MidSungJuk) : 국어,영어,수학
 * 기말고사(FinalSungJuk) : 국여,영어,수학,미술,과학
 * 성적처리 : computeSungJuk
 * 결과출력 : printSungJuk
 */

public class SungJukV6Main {
    public static void main(String[] args) {
        /*
        MidSungJuk sw=new MidSungJuk();
        sw.readSungJuk();
        sw.computeSungJuk();
        sw.printSungJuk();
*/
    FinalSungJuk fsw=new FinalSungJuk();
    fsw.readSungJuk();
    fsw.computeSungJuk();
    fsw.printSungJuk();

    }


}

class MidSungJuk {
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected double mean;
    protected char grd;

    public MidSungJuk() {
    }

    //매개변수가
    // 이름, 국어, 영어, 수학점수만 필요하니 (이름,국어,영어,수학점수만 입력하면되니/까)
    // 이것만 매개변수 설정한다.
    public MidSungJuk(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        //나머지 기본값들은 이렇게 넣어도되고 안넣어도 되고
        sum = 0;
        mean = 0.0;
        grd = '가';
    }

    //이것또한 우리는 전부다 만들지만 나중에 고급프로그래밍으로 가면
    //필요부분만 set,get만 만들어 사용한다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    protected void readSungJuk(){


        Scanner sc=new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");          //이름을 입력하세요 : 줄바꿈이 안일어나고 입력받을 수 있게 print문으로 한다.
        name=sc.nextLine();  //문자를 받을때는 nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor=sc.nextInt();    //정수를 받을때는 nextInt(); 실수는 Double
        System.out.print("영어점수를 입력하세요 :");
        eng=sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        math=sc.nextInt();



    } //readSungJuk


    protected void computeSungJuk() {
        sum = kor+math+eng;   //총합
        mean = (double)sum/3; //평균

        //학점계산은 switch문으로 처리
        switch((int)(mean/10)) {
            case 10:
            case 9: grd='수'; break;
            case 8: grd='우'; break;
            case 7: grd='미'; break;
            case 6: grd='양'; break;
            default: grd='가'; break;
        }
    }
    protected void printSungJuk(){
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 78번줄로 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n" +
                        "수학: %d\n총합: %d\n평균:%.1f\n학점:%c";
        String result=String.format
                (fmt,name,kor,eng,math,sum,mean,grd);

        System.out.println(result);
    }//printSungJuk
}

//기말고사
class FinalSungJuk extends MidSungJuk {
    protected int art;
    protected int sci;

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    public FinalSungJuk() { }

    public FinalSungJuk(
            String name, int kor, int eng, int math,
            int art, int sci) {
        /*
        부모 클래스에 정의된 멤버변수 초기화 코드를
        'super'라는 이름으로 치환해서 호출할 수 있음
        super(생성자의 매개변수목록)
        그리고 애초에 다 써버리면 상속받는 의미가 없어짐
        this.name=name;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
        */
        super(name, kor, eng, math);
        this.art = art;
        this.sci = sci;
    }

    @Override
    protected void readSungJuk() {
        //부모 클래스에 정의된 성적 입력코드를
        //'super'라는 이름으로 치환해서 호출할 수 있음

        // sumper.메서드이름()
        super.readSungJuk();

        Scanner sc=new Scanner(System.in);
        System.out.print("미술 :");
        art=sc.nextInt();
        System.out.print("과학 :");
        sci=sc.nextInt();
    }

    @Override
    protected void computeSungJuk() {
        //부모 클래스에 정의된 총점 입력코드를
        //'super'라는 이름으로 치환해서 호출할 수 있음
        // super.멤버변수명;
        //super.computeSungJuk(); 기존sum값이 안구해졌기때문에 어쩔수없이 메서드를 갖옴
        //sum = super.sum + sci +art; //super.sum 부모멤버변수가져오기
        sum=kor+eng+math+sci+art;
        mean=(double)sum/5;
        switch((int)(mean/10)) {
            case 10:
            case 9: grd='수'; break;
            case 8: grd='우'; break;
            case 7: grd='미'; break;
            case 6: grd='양'; break;
            default: grd='가'; break;
            //이거같은경우는 내가 생각했을때 부모클래스에서 상속받더라도 값이 제대로안나와
            //다시써야하는게 아닌가 했는데 선생님도 다시 쓰셨다.
        }
    }

    @Override
    protected void printSungJuk() {
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 78번줄로 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n" +
                        "수학: %d\n미술:%d\n과학:%d\n총합: %d\n평균:%.1f\n학점:%c";
        String result=String.format
                (fmt,name,kor,eng,math,art,sci,
                        sum,mean,grd);

        System.out.println(result);
        //이것역시 compute성적과 동일
    }
}






