package lab;
//실습문제 79번
public class Cgv {
    String mvName;
    String open;
    int rTime;
    String category;
    String story;
    String acStory;
    //기본생성자
    public Cgv(){
        mvName="신세계";
        open="2013.02.21";
        rTime=134;
        category="범죄";
        story="드루와";
        acStory="중구가 시키드나";
    }
    //매개변수 생성자
    public Cgv(String mvName, String open, int rTime, String category, String story, String acStory) {
        this.mvName = mvName;
        this.open = open;
        this.rTime = rTime;
        this.category = category;
        this.story = story;
        this.acStory = acStory;
    }
}

class Actor{
    String name;
    String birth;
    String filmo;
    String role;


    //기본생성자
    public Actor() {
        name="황정민";
        birth="1970년 9월1일";
        filmo="신세계";
        role="정청";
    }

    //매개변수 생성자

    public Actor(String name, String birth, String filmo, String role) {
        this.name = name;
        this.birth = birth;
        this.filmo = filmo;
        this.role = role;
    }
}

class MovieDirector{
    String name;
    String birth;
    String filmo;


    //기본생성자
    public MovieDirector() {
        name="박훈정";
        birth="1975";
        filmo="신세계";
    }
    //매개변수생성자
    public MovieDirector(String name, String birth, String filmo) {
        this.name = name;
        this.birth = birth;
        this.filmo = filmo;
    }

}
class Production{
    String name;
    String adr;
    String filmo;

    //기본생성자
    public Production() {
        name="몰라용";
        name="서울어딘가";
        filmo="신세계";
    }
    //매개변수 생성자
    public Production(String name, String adr, String filmo) {
        this.name = name;
        this.adr = adr;
        this.filmo = filmo;
    }
}
