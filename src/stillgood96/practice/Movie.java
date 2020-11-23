package stillgood96.practice;

public class Movie {
    private String name;
    private String startingDate;
    private String []genre;
    private String []director;
    private String []actor;
    private String story;
    private String desc;


    //기본생성자
    public Movie(){

    }
    //매개변수 생성자
    public Movie(String name,String startingDate,String genre[],String director[],String actor[],String story,String desc){
        this.name=name;
        this.startingDate=startingDate;
        this.genre=genre;
        this.director=director;
        this.actor=actor;
        this.story=story;
        this.desc=desc;
    }

    //private으로 감겨진  멤버변수를 활용하려면 setter/getter 메서드를 이용해야한다.

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDate(String startingDate){
        this.startingDate=startingDate;
    }
    public String getDate(){
        return startingDate;
    }
    public void setGenre(String[] genre){
        this.genre=genre;
    }
    public String[] getGenre(){
        return genre;
    }
    public void setDirector(String []director){
        this.director=director;
    }
    public String []getDirector(){
        return director;
    }
    public void setActor(String []actor){
        this.actor=actor;
    }
    public String []getActor(){
        return actor;
    }
    public void setStory(String story){
        this.story=story;
    }
    public String getStory(){
        return story;
    }

    public void setDesc(String desc){
        this.desc=desc;
    }
    public String getDesc(){
        return desc;
    }
}
