package lab;

public class Book {
    String bName;
    String wName;
    String pName;
    String pDate;
    int price;
    double dc;
    String bImg; //java.png

    //기본생성자

    public Book() {
    }

    //매개변수 생성자

    public Book(String bName, String wName,
                String pName, String pDate, int price, double dc,
                String bImg) {
        this.bName = bName;
        this.wName = wName;
        this.pName = pName;
        this.pDate = pDate;
        this.price = price;
        this.dc = dc;
        this.bImg = bImg;
    }
}
