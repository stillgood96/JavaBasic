package lab;
//실습문제 81번
public class CarSell {
    String name;
    String id;
    String birth;
    String nameNum;
    String adr;
    String idRank;
    String sellList;
    String comNum;

    public CarSell(){
        name="김빵빵";
        id="boorrrr";
        birth="1990-9-1";
        nameNum="961231-1232312";
        adr="서울";
        idRank="1등급";
        sellList="없음";
        comNum="02-123-1234";
    }

    public CarSell(String name, String id, String birth,
                   String nameNum, String adr, String idRank,
                   String sellList, String comNum) {
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.nameNum = nameNum;
        this.adr = adr;
        this.idRank = idRank;
        this.sellList = sellList;
        this.comNum = comNum;
    }
}
class Buyer{
    String name;
    String id;
    String birth;
    String idNum;
    String adr;
    String phone;
    String phone2;

    public Buyer(){
        name="이선우";
        id="sunwoo";
        birth="1996-05-06";
        idNum="961212-1212121";
        adr="서울";
        phone="010-1234-1234";
        phone2="02-123-1234";
    }

    public Buyer(String name, String id, String birth,
                 String idNum, String adr, String phone, String phone2) {
        this.name = name;
        this.id = id;
        this.birth = birth;
        this.idNum = idNum;
        this.adr = adr;
        this.phone = phone;
        this.phone2 = phone2;
    }
    class Car{
        String num;
        String factory;
        String name;
        String rank;
        String age;
        String auto;
        String color;
        String km;
        String price;


        public Car(){
            num="23마1221";
            factory="현대";
            name="음음";
            rank="승합차";
            age="10";
            auto="auto";
            color="black";
            km="15만";
            price="1500만원";
        }

        public Car(String num, String factory, String name,
                   String rank, String age, String auto, String color,
                   String km, String price) {
            this.num = num;
            this.factory = factory;
            this.name = name;
            this.rank = rank;
            this.age = age;
            this.auto = auto;
            this.color = color;
            this.km = km;
            this.price = price;
        }
    }
}
