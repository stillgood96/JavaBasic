package stillgood96.day11_24hak;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // customer 클래스로 생성한 customer를 상위 인터페이스 Buy buyer 변수에 대입하여 형변환시킨후
                                //Buy 인터페이스의 참조변수(?)buyer 도 하위 클래스인 Customer의 재정의한 메서드를 사용할 수 있다..?
        buyer.buy();
        buyer.order();
        System.out.println("-----------------");

        Sell seller = customer;
        seller.sell();
        seller.order();
        System.out.println("-----------------");

        if(seller instanceof Customer){
            Customer customer2 = (Customer)seller;
            customer.buy();
            customer2.sell();
            System.out.println("-----------------");
        }
            Customer cs = new Customer();
            cs.order();

    }
}


interface Buy{
    void buy();
    void order();
}
interface Sell{
    void sell();
    void order();
}

class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    @Override
    public void order() {
        System.out.println("고객판매 주문");
    }
}