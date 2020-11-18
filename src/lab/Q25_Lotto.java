package lab;

import java.util.Scanner;

public class Q25_Lotto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("로또 번호 총 몇개 ? :");
        final int num = sc.nextInt();
        int pickNum[] = new int[num];
        int lottoNum[] = new int[num];

        //선택번호 입력
        for (int i = 0; i < num; i++) {
            System.out.printf("%d 번째 번호 입력: ", i + 1);
            pickNum[i] = sc.nextInt();
            if (pickNum[i] > 45 || pickNum[i] < 0) {
                i--;
                System.out.println("0이상 45이하 번호만 입력해주세요");
            }
            if(i>0){
                for(int j=0;j<i;j++){
                    if(pickNum[i]==pickNum[j]){
                        System.out.println("번호가 중복되었습니다.");
                        i--;
                        break;
                    }
                }
            }
        }




        //당첨번호 저장
        for (int j = 0; j < num; j++) {
            lottoNum[j] = (int) (Math.random() * 45) + 1;

            if(j>0){
                for(int k=0;k<j;k++){
                    if(lottoNum[j]==lottoNum[k]){
                        j--;
                        break;
                    }
                }
            }
        }

        //적중 및 당첨
        int count=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(pickNum[i]==lottoNum[j]){
                    count++;
                }
            }
        }
        //출력
        for(int i=0;i<num;i++){
            System.out.printf("%d번째 번호 : %d\n",i+1,lottoNum[i]);
        }

        if(count==3){
            System.out.println("3개 적중 상금 1백만원 지금");
        }else{
            System.out.println("아쉽지만 다음기회에");
        }

    }
}
