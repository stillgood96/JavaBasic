package lab;

public class CgvTest {
    public static void main(String[] args) {
        //기본생성자 값 출력
        Cgv good=new Cgv();
        System.out.println(good);
        System.out.println(good.mvName);
        System.out.println(good.open);
        System.out.println(good.rTime);
        System.out.println(good.story);
        System.out.println(good.acStory);

        //매개변수 사용자 값 출력
        Cgv good2=new Cgv("으악","2020-10-20",134,"코미디","억","윽");
        System.out.println(good2);
        System.out.println(good2.mvName);
        System.out.println(good2.open);
        System.out.println(good2.rTime);
        System.out.println(good2.story);
        System.out.println(good2.acStory);


    }


}
