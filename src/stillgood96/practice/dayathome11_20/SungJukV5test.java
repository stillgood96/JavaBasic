package stillgood96.practice.dayathome11_20;

public class SungJukV5test {
    public static void main(String[] args) {
        SungJukV5serv cal=new SungJukV5serv();
        SungJukV5prac cla= cal.readSungJuk();
        cal.computeScore(cla);
        cal.printSungJuk(cla);
    }

}
