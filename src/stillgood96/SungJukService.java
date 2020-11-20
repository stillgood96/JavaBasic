package stillgood96;

import java.util.Scanner;

/**
 * 파일명: SungjukService
 * 작성일: 2020.11.20
 * 프로그램 설명: 성적처리프로그램 v5
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd


 * 단, 평균은 소수점 첫째 자리 까지 출력
 * 단,학점기준은 '수우미양가' 로 함 +switch문을 이용함
 * 만점은 100점으로
 * 100~90, 89~80, 79~70, 69~60, 59~0기준으로 학점부여
 *
 *
 *
 */

public class SungJukService {

    /**
     *
     * 성적 데이터 입력 메서드
     * @retun 키보드로 입력받는 성적데이터 SungJukV0
     */

    public SungJukV0 readSungJuk(){
        String name;
        int kor;
        int eng;
        int math;

        Scanner sc=new Scanner(System.in);
        System.out.print("이름을 입력하세요 :");          //이름을 입력하세요 : 줄바꿈이 안일어나고 입력받을 수 있게 print문으로 한다.
        name=sc.nextLine();  //문자를 받을때는 nextLine();
        System.out.print("국어점수를 입력하세요 :");
        kor=sc.nextInt();    //정수를 받을때는 nextInt(); 실수는 Double
        System.out.print("영어점수를 입력하세요 :");
        eng=sc.nextInt();
        System.out.print("수학점수를 입력하세요 :");
        math=sc.nextInt();


        return new SungJukV0(name,kor,eng,math,
                0,0,' ');

    } //readSungJuk

    /**
     * 입력받은 성적에 대해
     * 총점,평균,학점을 계산하는 메서드
     */
    public void computeSungJuk(SungJukV0 sw){
        //SungJukV2B에서 긁어옴
        //       sum=kor+eng+math;
        sw.setSum( sw.getKor()+sw.getEng()+sw.getMath() );   //총합
//        mean = (double)sum/3; //평균
        sw.setMean((double)sw.getSum()/3);
        //학점계산은 switch문으로 처리


//        switch((int)(mean/10)) {
          switch((int)(sw.getMean()/10)){
            case 10:
            case 9: sw.setGrd('수'); break;
            case 8: sw.setGrd('우'); break;
            case 7: sw.setGrd('미'); break;
            case 6: sw.setGrd('양'); break;
            default: sw.setGrd('가'); break;
        }//switch
    } // computeSngJuk
    /**
     *입력한 이름,국어,영어 수학와
     * 계산된 총점,평균,학점등을 출력하는 메서드
     */
    public void printSungJuk(SungJukV0 sw){
        String fmt=        //평균의 %f로 하면 플롯의 소수점 7자리까지나온다. string으로 바꾸고 78번줄로 내려가서
                "이름 : %s\n국어: %d\n영어: %d\n" +
                        "수학: %d\n총합: %d\n평균:%.1f\n학점:%c";
       String result=String.format
               (fmt,sw.getName(),sw.getKor(),sw.getEng(),
                       sw.getMath(),sw.getSum(),
                       sw.getMean(),sw.getGrd());

       System.out.println(result);
    }//printSungJuk
}





