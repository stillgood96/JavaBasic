package stillgood96.day11_23hak;

// 인터페이스
// 추상메서드와 상수만으로 구성된 특수한 클래스
// 어떤 클래스를 만들때 추상메서드를 통해
// 기본이 되는 틀을 제공하여 규칙에 맞춰 코드를 짤수 있게 해줌
// =>접근제한자는 언제나 public으로 고정이다.
// 클래스 와는 달리 다중상속을 지원함

// 인터페이스 작성시 interface 를 사용
// 인터페이스를 구현할때는 iplements를 사용
public class Interface {
    public static void main(String[] args) {
        Cat3 ct3=new Cat3();
        System.out.println(ct3.cry());
        Dog3 dg3=new Dog3();
        System.out.println(dg3.cry());
    }

}

class Animal3 {
    protected int weight;
    protected int height;
}

interface Animal3Action {
    //public static String COLOR="brown"; //상수
    //static String COLOR = "brown";
    String COLOR = "brown";

    //public abstract String cry();
    //abstract String cry();
    String cry();

    //protected를 사용할 수 없다. 그이유로는
    //인터페이스는 기본이 되는 틀을 제공하여 규칙에 맞춰 코드를 짤수 있게 해줘
    //야 해서 접근제한자가 public 고정이다 .
}

class Cat3 extends Animal3 implements Animal3Action{
    @Override
    public String cry() {
        return "야아아아아아앙아오오오오오오옹";
    }
}

class Dog3 extends Animal3 implements Animal3Action{
    @Override
    public String cry() {
        return "머어어엉머어어엉머어어엉";
    }
}

class Murloc extends Animal3
            implements Animal3Action {

    @Override
    public String cry() { return "아훓훓훓~"; }
}
