package stillgood96;
/**
 * 파일명: SungjukV5
 * 작성일: 2020.11.20
 * 프로그램 설명: 성적처리프로그램 v5
 * 이름,국어,영어,수학, 총점, 평균, 학점에
 * 관한 변수를 정의하는 V0클래스
 * +원래는 VO인데 V0으로 잘못만듬..
 *
 */

public class SungJukV0 {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private double mean;
    private char grd;


    public SungJukV0() {
    }

    public SungJukV0(String name, int kor, int eng, int math, int sum, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
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
