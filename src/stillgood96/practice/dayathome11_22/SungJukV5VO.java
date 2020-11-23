package stillgood96.practice.dayathome11_22;

public class SungJukV5VO {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private char grd;
    private int sum;
    private double mean;

    public SungJukV5VO() {
    }

    public SungJukV5VO(String name, int kor, int eng, int math, char grd, int sum, double mean) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.grd = grd;
        this.sum = sum;
        this.mean = mean;
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

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
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
}
