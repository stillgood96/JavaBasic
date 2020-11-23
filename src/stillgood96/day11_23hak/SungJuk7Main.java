package stillgood96.day11_23hak;

import java.util.Scanner;

/**
 * 파일명: SungjukV7
 * 작성일: 2020.11.23
 * 프로그램 설명: 성적처리프로그램 v7
 * 중간고사와 기말고사 성적처리프로그램을 만들려고 함
 * SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 인터페이스를 이용해서 작성하세요
 *
 * 부모클래스 : SungJukV7
 * 인터페이스 : IsungJukV6
 * 중간고사(MidSungJuk2) : 국어,영어,수학
 * 기말고사(FinalSungJuk2) : 국여,영어,수학,미술,과학
 * 성적입력 : readSungJuk2
 * 성적처리 : computeSungJuk2
 * 결과출력 : printSungJuk2
 */
public class SungJuk7Main {
    public static void main(String[] args) {
        /*
        MidSungJuk2 sw=new MidSungJuk2();
        sw.readSungJuk2();
        sw.computeSungJuk2();
        sw.printSungJuk2();
        */
        FinalSungJuk fsw=new FinalSungJuk();
        fsw.readSungJuk();
        fsw.computeSungJuk();
        fsw.printSungJuk();
    }

}

class SungJukV7 {
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int art;
    protected int sci;
    protected int sum;
    protected double mean;
    protected char grd;

    public SungJukV7() {
    }

    public SungJukV7(String name, int kor, int eng, int math, int art, int sci) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.art = art;
        this.sci = sci;
    }

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
}

interface IsungJukV6{
    void readSungJuk2();
    void computeSungJuk2();
    void printSungJuk2();
}

class MidSungJuk2 extends SungJukV7
    implements IsungJukV6{

    @Override
    public void readSungJuk2() {
        Scanner sc=new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");          //이름을 입력하세요 : 줄바꿈이 안일어나고 입력받을 수 있게 print문으로 한다.
        name=sc.nextLine();  //문자를 받을때는 nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor=sc.nextInt();    //정수를 받을때는 nextInt(); 실수는 Double
        System.out.print("영어점수를 입력하세요 :");
        eng=sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        math=sc.nextInt();

    }

    @Override
    public void computeSungJuk2() {
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

    @Override
    public void printSungJuk2() {
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 78번줄로 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n" +
                        "수학: %d\n총합: %d\n평균:%.1f\n학점:%c";
        String result=String.format
                (fmt,name,kor,eng,math,sum,mean,grd);

        System.out.println(result);
    }//printSungJuk
    }


    class FinalSungJuk2 extends SungJukV7
        implements IsungJukV6{

        @Override
        public void readSungJuk2() {
            Scanner sc=new Scanner(System.in);
            System.out.print("이름을 입력하세요 :");          //이름을 입력하세요 : 줄바꿈이 안일어나고 입력받을 수 있게 print문으로 한다.
            name=sc.nextLine();  //문자를 받을때는 nextLine();
            System.out.print("국어점수를 입력하세요 :");
            kor=sc.nextInt();    //정수를 받을때는 nextInt(); 실수는 Double
            System.out.print("영어점수를 입력하세요 :");
            eng=sc.nextInt();
            System.out.print("수학점수를 입력하세요 :");
            math=sc.nextInt();
            System.out.print("미술점수를 입력하세요 :");
            art=sc.nextInt();
            System.out.print("과학점수를 입력하세요 :");
            sci=sc.nextInt();

        }

        @Override
        public void computeSungJuk2() {
            sum = kor+math+eng+math+art;   //총합
            mean = (double)sum/5; //평균

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

        @Override
        public void printSungJuk2() {
            String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 78번줄로 내려가서
                    "이름 : %s\n국어: %d\n영어: %d\n" +
                            "수학: %d\n미술: %d\n과학: %d\n총합: %d\n평균:%.1f\n학점:%c";
            String result=String.format
                    (fmt,name,kor,eng,math,art,sci,sum,mean,grd);

            System.out.println(result);
        }//printSungJuk
        }

