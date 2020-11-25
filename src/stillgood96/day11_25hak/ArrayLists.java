package stillgood96.day11_25hak;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ArrayList
 * 동적배열의 한 종류
 * List 인터페이스를 구현해서 만든 컬렉션 프레임워크
 * 요소의 저장순서가 유지
 * 중복으로 데이터를 저장할 수 있음
 * 크기가 늘어나면 새로운 배열을 생성하고
 * 기존의 요소들을 옮겨야 하는 복잡한 과정이 동반됨
 */
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        // 데이터 추가 : add(대상)
        names.add("혜교");
        names.add("지현");
        names.add("수지");

        //특정 위치에 데이터 추가 : add(위치, 대상);
        names.add(1,"수현");

        // 컬렉션 자료구조에 저장된 데이터를
        // 출력하려면 foreach 구문 사용
        // 출력하려면 이름들을 담을 공간인 String name(새로운 참조형변수) 이 필요
        for (String name : names){
            System.out.println(name);
        }
        //ArrayList 특징인 순서가 잘 적용되어 출력되는걸 확인.


        // 특정 위치 요소 추출 : get(위치);
        System.out.println( names.get(1) );

        // 요소 수정 : set(위치, 대상)
        names.set(1,"윤아");
        System.out.println( names.get(1) );

        // 요소삭제 : remove(위치);
        names.remove(1);
        System.out.println( names.get(1) );
        // 1번위치가 삭제되고 2번위치가 1번위치로 당겨진다.

        // 요소 모두삭제 : clear();

        // 데이터 검색하기
        // 배열에서 원하는 데이터를 찾는 방법은 2가지
        // 위치로 찾음 : get(위치)
        // 실제값으로 찾음 : contains, indexOf
        String[] game = {"롤","피파","배그"};

        //일반배열을 ArrayList로 바꾸기

        //ArrayList<String> games = (ArrayList<String>)Arrays.asList(game);
        // 이렇게하면 문법적으로는 문제없지만 실행시 다운캐스팅 오류가 발생한다.
        // OOPCasting 클래스에서 나온 문제와 동일 ArrayList<Arrays 라서 ? 부모격인 클래스를 자식클래스에 넣으려니까 안디나

        //이렇게해도됨 List가 조상
        List<String> games = Arrays.asList(game);
        // 일반배열을 동적배열로 변환하려면
        // Arrays 클래스의 asList메서드를 사용함

        System.out.println(games);

        // games 동적배열에서 '스타크래프트;'를 찾아봄
        // 전체를 훑어가며 대상을 찾기 때문에 성능이 나쁨
        for (int i=0; i < games.size(); i++){  //동적배열의 크기는 .size메서드 이요해서 알 수있다.
            if (games.get(i).equals("배그")){
                System.out.println((i+1)+"번째에서 찾음");
                break;
            }
        }//위치기반

        //다른방법(foreach 향상된for문)
        for (String g : games){
            if (g.equals("배그")){
                System.out.println("데이터 찾음");
                break;
            }
        }// 값 기반 검색

        // 위치를 찾는게 중요하다면 일반적인 for문을
        // 데이터가 존재여부만을 찾기 원한다면 foreach문을

        //간단하게 if문사용해서 값기반 검색(.contains)
        if(games.contains("배그")){
            System.out.println("데이터 찾음 !!");
        }

        //간단하게 값이 어느위치에 있는지 알려주는 .indexOf() 위치 기반 검색
        System.out.println( games.indexOf("배그"));
        System.out.println("-----------------------------");


        // 게임정보에 대한 객체 생성을위해 클래스 생성후 객체 생성
        GameInfo g1 = new GameInfo("롤",0);
        GameInfo g2 = new GameInfo("배그",18000);
        GameInfo g3 = new GameInfo("GTA5",59000);

        // 생성한 객체들을 동적배열에 저장
//        ArrayList<GameInfo> games2 = new ArrayList<>(); 이렇게 진행해도 되지만 조상격인List를 활용해서
        //업캐스팅해서 작성이 더 용이하고 편리함
        List<GameInfo> games2 = new ArrayList<>();
        games2.add(g1);
        games2.add(g2);
        games2.add(g3);

        // '롤' 요소를 출력
        // ArrayList의 요소가 GameInfo의 객체이므로
        // GameInfo 객체의 주소가 저장됨
        System.out.println(games2.get(0)); //주소가 나옴

        // 따라서, GameInfo 객체의 실제값을 출력하려면
        // 대상.변수명 또는 대상.getter를 이용해야 함
        System.out.println(games2.get(1).name);
        System.out.println(games2.get(1).price);
        //GameInfo가 디폴트 멤버변수여서 이렇게 출력할 수 있지 private으로 감싸있으면
        //getter 사용해야함


        // 실습)
        // 특정 요소를 검색하는 코드를 4가지(for, foreach, contains, indexOf) 버젼으로 작성
        //위에서의 예제는 String을 받았지만 지금은 객체를 받기때문에 .name이 붙음
        for( int i=0; i < games.size(); i++ ){
            if(games2.get(i).name.equals("배그")){
                System.out.println("---------------for----------");
                System.out.println(i+1+"번째에서 데이터 찾음");
                System.out.println("게임이름:"+games2.get(i).name);
                System.out.println("게임가격:"+games2.get(i).price);

                break;
            }
        }
        for(GameInfo search : games2){
            if (search.name.equals("배그")){
                System.out.println("-------foreach--------");
                System.out.println("데이터 찾음!");
                break;
            }else{
                System.out.println("-------foreach--------");
                System.out.println("데이터 못 찾음!");
                break;
            }
        }
        for(GameInfo g: games2) {
            if (g.name.contains("GTA5")) {
                System.out.println("-------contains-------");
                System.out.println("데이터 값 찾음 !!!");
            } else {
                System.out.println("-------contains-------");
                System.out.println("데이터 값 못찾음 !!!");
            }
        }



        for(GameInfo g: games2){
            if( g.name.indexOf("GTA5")>=0){
                System.out.println("-----------indexOf---------");
                System.out.println("데이터 찾음!");
            }
        }


    }

}

// 게임정보에 대한 객체생성 을 위해 만든 클래스
class GameInfo {
    String name;
    int price;

    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }

}
