package lab.movies;

public class MovieMain {
    public static void main(String[] args) {
        String [] genre={"범죄"};
        String [] director={"몰라"};
        String [] actor= {"황정민","이정재"};
        String summary="드루와";
        String desc="중구가 시키드나";
        Movie newWorld=new Movie("신세계","2013",134,"(주)NEW",genre,director,actor,summary,desc);


        System.out.println(newWorld.getTitle());
        System.out.println(newWorld.getYear());
        System.out.println(newWorld.getMin());
        System.out.println(newWorld.getPd());
//        System.out.println(newWorld.getGenre()[0]);

        //참조형 변수이므로 배열의 내용 대신
        //내용이 저장된 위치가 출력 : 반복문으로 이용해서 처리
        for(int i=0;i<genre.length;i++) {
            System.out.println(newWorld.getGenre()[i]); //배열변수의 첨자 값을 안넣으면 값이 제대로안나오고 저장위치가 나옴
        }
        for(int i=0;i<director.length;i++){
            System.out.println(newWorld.getDirector()[i]);
        }
        for(int i=0;i<director.length;i++){
            System.out.println(newWorld.getDirector()[i]);
        }
    }
}
