package stillgood96;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * SungJukV8Service
 * 성적처리 추상클래스를 상속해서 만든 클래스
 *
 * 인터페이스를 바로 가져와서 쓰면 인터페이스 안에 선언된 메서드를 전부 정의해야 하지만
 * 추상클래스를 만들어 그 추상 클래스에 인터페이스를 implements 후 SungJukV8Service에
 * 상속 하게하면 원하는 인터페이스의 메서드만 정의 할 수 있다.
 *
 */
public class SungJukV8Service
        extends stillgood96.SungJukV8GenericService {

    // 멤버변수 선언
    // 입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<SungJukV0> sjdata = new ArrayList<>();


    @Override
    /**
     * 이름과 국/영/수 성적 데이터를 입력받아
     * 총점,평균,학점을 계산한 뒤
     * 동적배열에 추가함
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
        // 처리된 성적데이터를 동적배열에 저장
        sjdata.add(sj);

    }

    @Override
    /**
     * 저장된 성적 데이터들 중에서
     * 번호,이름,국어,영어,수학만 뽑아서
     * 리스트형태로 출력
     */
    public void readSungJuk() {
       String fmt =
               "이름:%s 국어:%d, 영어:%d, 수학:%d\n";

       // 동적배열에 저장된 데이터들을 출력하기 위해
       // 각 요소를 순회할수 있도록 Iterator 객체 선언
       Iterator<SungJukV0> iter =
                sjdata.iterator();
       while (iter.hasNext()) {
           SungJukV0 sj = iter.next();
            //지금은 급해서 반복문에 프린트문을 넣었지만
           // StringBuilder 로 하는게 좋다.
           System.out.printf(fmt,sj.getName(),
                   sj.getKor(),sj.getEng(),sj.getMath());
       }
    }

    @Override
    /**
     * 상세조회할 학생이름을 입력받아
     * 이름,국어,영어,수학,총점,평균,학점을 출력
     */
    public void readOneSungJuk() {
        String fmt =
                "이름:%s 국어:%d, 영어:%d, 수학:%d\n"+
                "총점:%d, 평균:%.1f, 학점:%s\n";

        // 상세조회할 학생이름 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 학생이름은? ");
        String name = sc.nextLine();

        // 입력받은 이름으로 데이터 검색후 결과 출력
        for (SungJukV0 sj : sjdata) {
           if (sj.getName().equals(name)) {
               System.out.printf(fmt,sj.getName(),sj.getKor(),sj.getEng(),
                       sj.getMath(),sj.getSum(),sj.getMean(),sj.getGrd());
               break;
           }
        }
    }

    /**
     * 성적 처리 프로그램의 메뉴 출력 기능
     */
    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
              sb.append("-------------------\n")
                .append("성적 처리프로그램 v8\n")
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
}
