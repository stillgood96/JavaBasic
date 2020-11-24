package stillgood96.day11_24hak;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

// 문자열 처리시 유용한 기능을 제공하는 메서드
//
public class Strings2 {
    public static void main(String[] args) {
        String str = "Hello, World!!";
        // 문자열 길이 : length
        System.out.println(str.length());

        // 문자열 검색
        // indexOf(문자'') : 왼쪽 기준 지정한 문자 찾기, 위치값 출력(0부터시작)

        int idx = str.indexOf('W');
        System.out.println( idx );
        idx = str.indexOf('?');
        System.out.println( idx );
        idx = str.indexOf( "Hello" );
        System.out.println(idx);

        // lastIndexOf(문자) : 오른쪽 기준 지정한 문자 찾기, 위치값 출력
        str = "Hello, Hi, noon";
        idx=str.lastIndexOf('H');
        System.out.println(idx);
        idx=str.lastIndexOf('n');
        System.out.println(idx);

        // 문자 바꾸기 : replace
        // replace(찾을문자열, 바꿀문자열)
        str = "A*B*C*D";
        str = str.replace("*","-");
        System.out.println(str);


        // 문자열 분리 : split
        // 지정한 문자를 기준으로 문자열을 나눠 배열에 저장
        // split(구분기호)
        str = "201650050,김태희,경기도,1985.3.22,컴퓨터,504";
        String[] result = str.split(",");
        /*옛날버전 for
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

         */

        //향상된 for문
        for ( String data : result ){
            System.out.println( data );
        }
        // 향상된 for문을 사용하면 배열을 쉽게 다를 수 있습니다.


        // 문자열 추출 : substring
        // substring(시작위치, 끝위치-1)
        str = "Hello, World!!";
        String word = str.substring(7,12);
        System.out.println(word);



        /*
        // ex) 주민번호에서 성별체크하는 코드 작성
        // 123456-1234567 , 987654-4567890
        // 1, 2 : 2000년 이전 남여 구분
        // 3, 4 : 2000년 이후 남여 구분
        Scanner sc=new Scanner(System.in);
        System.out.print("주민번호 입력(ex:960506-1234567):");
        str=sc.nextLine();
        //남녀 구분
        String mf="";
        //성별구분자리
        String fm = str.substring(7,8);
        //생년월일
        String year=str.substring(0,2);
        String month=str.substring(2,4);
        String day=str.substring(4,6);
         나는 if문으로만들어봄
        if(fm.equals("1")==true){
                        mf="남자";
        }else if(fm.equals("2")==true){
                        mf="여자";
        }else if(fm.equals("3")==true){
                        mf="남자";
        }else if(fm.equals("4")==true){
                        mf="여자";
        }
        System.out.printf("%s년 %s월 %s일생 %s입니다.",year,month,day,mf);

        //수업에서는 스위치문
        switch (fm){
            case "1":mf="남자"; break;
            case "2":mf="여자"; break;
            case "3":mf="남자"; break;
            case "4":mf="여자"; break;
        }
        System.out.printf("%s년 %s월 %s일생 %s입니다.",year,month,day,mf);
        */

        // 문자 하나뽑는데 위와같이 코드를 짜면 낭비다 그럴때는 다른방법을 사용
        // 지정한 위치의 문자추출 : charAt
        str = "123456-1234567";
        System.out.println( str.charAt(7)); // 문자를 뽑아낼 위치 입력 (0부터 시작)

        // 정규표현식에 따라 일치여부 확인 : matches
        // 정규식 사용가능 메서드 : split, replaceAll
        int num = 1234567;
        String str1 = String.format("%d", num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));

        str1= String.format("%,d",num);
        System.out.println( str1.matches(str2) );
        System.out.println( str1.matches("[a-z].+"));
        System.out.println( str1.matches("[0-9].+"));
        System.out.println("---------------------------");

        // 정규 표현식 regular expression
        // 특정한 규칙을 가진 문자열의 집합을 표현하기
        // 위해 사용하는 형식언어
        // [] : 문자집합이나표현, -는 두 문자 사이의 범위를 나타냄
        // [0-9] : 숫자집합 ([0123456789])
        // [a-zA-Z] : 영문자집합
        // [가-힣] : 한글 집합
        // * : 0개 이상 무한개의 임의의 문자 반복
        // ab* : ab, aba, ab1, abA, abaa ...

        // + : 1개 이상 무한개의 임의의 문자 반복
        // ab+ : aba, ab1, abA, abaa ...

        // ? : 0개 또는 1개의 임의의 문자 반복
        // ab? : aba, abb, ... ab0, abZ, abz

        // {n,m} : 최소 n개 이상 m개 이하 반복
        // [0-9]{3,4} : 123, 987, 1234, 9876

        // ^ : 문자열 시작
        // ^123 : 123으로 시작하는 문자열 의미

        // $ : 문자열 끝
        // 123$ : 123으로 끝나는 문자열 의미

        // . : 임의의 문자를 의미
        // .{3, } : 문자의 최소길이는 3임

        // 1234567890
        // abcdefghijklmnopqrstuvwxyz
        // 가나다라마바사아자차카타파하

        // 다음 문자열이 전화번호형식에 맞게 작성되었는지
        // 알아보는 정규식을 작성하세요
        // 010-123-4567, 011-1234-5678
        String phone = "010-123-4567";
        String pattern1 = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";
        System.out.println( phone.matches(pattern1) );

        phone = "011-1234-5678";
        System.out.println( phone.matches(pattern1) );



        // ex) 사용자 아이디가 다음 규칙에 적합하게 작성되었는지 확인
        // 영문자 소문자/대문자 숫자 특수기호 등으로
        // abc123!XYZ, 123jkl
        String pattern2 = "[a-zA-Z0-9!@#$%]+";

        String uid = "abc123@XYZ";
        System.out.println(uid.matches( pattern2 ));

        uid = "123jkl";
        System.out.println( uid.matches( pattern2 ));
        System.out.println("--------------------");


        // 첫글자는 영문자 소문자/대문자
        // 두번째문자는 숫자, 특수기호()등이 포함
        //최소 길이는 6자~18자
        // abc123!XYZ, 123jkl

        uid = "abc123@XYZ12345678";

        String pattern3 = "^[a-zA-Z]{1}[a-zA-Z0-9!?@$]{5,17}"; //명시적인것
        // String patterns = "^[a-zA-Z][a-zA-Z0-9!@##@]{5,17}"; //이렇게해도 되긴됨
        System.out.println( uid.matches( pattern3 ));

        uid= "123jkl";
        System.out.println( uid.matches( pattern3 ));





    }
}
