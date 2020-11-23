package stillgood96.practice.dayathome11_20;

public class SungJukV5prac {
    private String name;
    private int eng;
    private int math;
    private int kor;
    private int sum;
    private double mean;
    private char grade;

    public SungJukV5prac() {
    }

    public SungJukV5prac(String name, int eng, int math, int kor, int sum, double mean, char grade) {
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.kor = kor;
        this.sum = sum;
        this.mean = mean;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
