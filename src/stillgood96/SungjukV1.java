package stillgood96;

/**
 * 파일명: SungjukV1
 * 작성일: 2020.11.17
 * 프로그램 설명: 성적처리프로그램 v1
 * 이름,국어,영어,수학점수를 설정하면
 * 총점,평균,학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 단, 학점기준은 '수우미양가' 로 함
 * 만점은 100점으로
 * 100~90, 89~80, 79~70, 69~60, 59~0기준으로 학점부여
 */


public class SungjukV1 {
    public static void main(String[] args) {
        String name;
        int kor,eng,mat;
        int sum;
        double mean;
        char grd;


        name="sunwooLee";
        kor=99; eng=98; mat=99;
        sum=kor+eng+mat;
        mean=(double)sum/3;


        System.out.println("이름:"+name);
        System.out.println("국어:"+mat);
        System.out.println("영어:"+eng);
        System.out.println("수학:"+mat);
        System.out.println("------------");
        System.out.println("총점:"+sum);
        System.out.println("평균:"+mean);




    }



}
