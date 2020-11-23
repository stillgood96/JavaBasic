package stillgood96.practice.dayathome11_22;

public class SungJukV5 {
    public static void main(String[] args) {
       SungJukV5service all=new SungJukV5service(); //서비스 클래스 생성
       SungJukV5VO studentLee=new SungJukV5VO();  //VO 클래스 studentLee 생성

       studentLee=all.readSungJuk();
       all.computeSungJuk(studentLee);
       all.print(studentLee);
    }
}
