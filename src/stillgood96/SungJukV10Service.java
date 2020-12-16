package stillgood96;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SungJukV10Service  {

    public SungJukV10Service()  { }

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("성적 처리프로그램 v10\n")
                .append("-------------------\n")
                .append("1. 성적 데이터 입력\n")
                .append("2. 성적 데이터 조회\n")
                .append("3. 성적 데이터 상세조회\n")
                .append("4. 성적 데이터 수정\n")
                .append("5. 성적 데이터 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? [1,2,3,4,5,0] ");
        System.out.print(sb);
    }

    /**
     * SungJukV8Service의 newSungJuk을 재정의
     */

    public void newSungJuk() {
        String name;
        int kor;
        int eng;
        int math;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");          //이름을 입력하세요 : 줄바꿈이 안일어나고 입력받을 수 있게 print문으로 한다.
        name = sc.nextLine();  //문자를 받을때는 nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor = sc.nextInt();    //정수를 받을때는 nextInt(); 실수는 Double
        System.out.print("영어점수를 입력하세요 :");
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        math = sc.nextInt();

        SungJukV0 sj =
                new SungJukV0(name, kor, eng, math, 0, 0.0, ' ');
        // 총점 평균 학점을 계산
        computeSungJuk(sj);

        // 최종적으로 처리한 성적데이터를 sungjuk2테이블에 저장하기 위해
        // sungjukv10DAO의 insertSungJuk메서드를 호출하고
        // 매개변수로 성적데이터를 넘김
        String result = SungJukV10DAO.insertSungJuk(sj);
        System.out.println(result);

    }


    public void computeSungJuk(SungJukV0 sw) {
        sw.setSum(sw.getKor() + sw.getEng() + sw.getMath());   //총합
//        mean = (double)sum/3; //평균
        sw.setMean((double) sw.getSum() / 3);
        //학점계산은 switch문으로 처리


//        switch((int)(mean/10)) {
        switch ((int) (sw.getMean() / 10)) {
            case 10:
            case 9:
                sw.setGrd('수');
                break;
            case 8:
                sw.setGrd('우');
                break;
            case 7:
                sw.setGrd('미');
                break;
            case 6:
                sw.setGrd('양');
                break;
            default:
                sw.setGrd('가');
                break;
        }


    }

    // 조회할 성적데이터를 DAO로부터 넘겨받아 출력
    public void readSungJuk() {
        String fmt =   "번호 :%s, 이름:%s, 국어 :%d, 영어 :%d, 수학 :%d, 등록일 :%s\n";
        StringBuilder sb = new StringBuilder();

        ArrayList<SungJukV0> sjs = SungJukV10DAO.selectSungJuk();

        for(SungJukV0 sj : sjs){
            String result = String.format(fmt,sj.getSjno(),sj.getName(),sj.getKor(),sj.getEng(),sj.getMath(),sj.getRegdate().substring(0,10));
            sb.append(result);
        }
        System.out.println(sb.toString());

    }

    public void readOneSungJuk() {
        String fmt =
                "번호 :%s 이름 :%s 국어 :%d, 영어 :%d, 수학 :%d\n"+
                        "총점 :%d, 평균 :%.1f, 학점 :%s 등록일 :%s\n";

        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 성적번호는? ");
        String sjno = sc.nextLine();

        SungJukV0 sj = SungJukV10DAO.selectOneSungJuk(sjno);

        String result = String.format(fmt,sj.getSjno(),sj.getName(),sj.getKor(),sj.getEng(),
                sj.getMath(),sj.getSum(),sj.getMean(),sj.getGrd(),sj.getRegdate());

        System.out.println(result);
    }
}
