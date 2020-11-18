package stillgood96;

import java.util.Scanner;

public class Repeat11_18 {
    public static void main(String[] args) {



        input_Student();












    }
    //성적,학생 정보 입력받기
    public static void input_Student(){
        Scanner sc=new Scanner(System.in);
        System.out.print("학생 수를 입력해주세요:");
        final int num=sc.nextInt();
        String student[]=new String[num];
        System.out.print("입력하실 과목 수를 정해주세요:");
        final int subjectNum=sc.nextInt();
        String subjectName[]=new String[subjectNum];
        int subjectScore[][]=new int[num][subjectNum];
        sc.skip("\r\n|[\n\r]");


       //과목 이름 정하기
        for(int i=0;i<subjectNum;i++) {
            System.out.printf("%d번째 과목 이름입력:", i+ 1);
            subjectName[i] = sc.nextLine();
        }

        //학생정보, 점수 입력하기
        for(int i=0;i<num;i++){
            System.out.printf("%d번째 학생 이름: ",i+1);
            student[i]=sc.nextLine();
            for(int j=0;j<subjectNum;j++){
                System.out.printf("%s 점수 입력:",subjectName[j]);
                subjectScore[i][j]=sc.nextInt();
                sc.skip("\r\n|[\n\r]");
            }

        }
        //성적 총점, 평균, '수우미양가'구하기
            int sum[]=new int[num]; //총점
            double avg[]=new double[num];
            for(int i=0; i<num;i++) {
                for (int j = 0; j < subjectNum; j++) {
                    sum[i] = sum[i] + subjectScore[i][j];
                }
                avg[i]=(double)sum[i]/subjectNum;
            }

            char grade[]=new char[num];
            for(int i=0;i<num;i++){
                if(avg[i]>=90 || avg[i]==100){
                    grade[i]='수';
                }else if(avg[i]>=80){
                    grade[i]='우';
                }else if(avg[i]>=70){
                    grade[i]='미';
                }else if(avg[i]>=60){
                    grade[i]='양';
                }else{
                    grade[i]='가';
                }
            }
            //나중에 스위치문으로도 만들어보기




        //출력하기
        System.out.printf("------------------------------------\n");
        for(int i=0;i<num;i++){
//            avg[i]=Double.parseDouble(           //소수점 첫째자리까지 나오게하기
//                    String.format("%.1f",avg[i]));
            System.out.printf("학생 %s\n총점: %d\n평균: %.1f\n학점: %c\n",student[i],sum[i],avg[i],grade[i]);
            System.out.printf("----------------------------------------\n");

        }




    }







}
