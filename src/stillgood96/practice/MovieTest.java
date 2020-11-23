package stillgood96.practice;

public class MovieTest {
    public static void main(String[] args) {
        String [] genre={"스릴러"};
        String [] director={"봉준호"};
        String [] actor={"황정민","이정재","최민식"};

        Movie newWorld=new Movie("황정민","2020-2020",genre,director,actor,"윽..","억");


        System.out.println(newWorld.getName());

        System.out.println(newWorld.getDate());

        for(int i=0;i<genre.length;i++){
            System.out.println(newWorld.getGenre()[i]);
        }
        for(int i=0;i<director.length;i++){
            System.out.println(newWorld.getDirector()[i]);
        }


        for(int i=0;i<actor.length;i++){
            System.out.println(newWorld.getActor()[i]);
        }
        System.out.println(newWorld.getStory());
        System.out.println(newWorld.getDesc());



    }
}
