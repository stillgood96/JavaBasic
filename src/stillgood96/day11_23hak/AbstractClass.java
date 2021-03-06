package stillgood96.day11_23hak;
// 추상 클래스
// 추상 메서드를 포함하는 클래스
// 추상메서드 : 메서드의 선언부만 있고, 몸체가 없는 메서드
// 메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함
// 부모클래스를 상속하기 싫을때 (상속하더라도 오버라이딩해서 다시써야할때)

// 따라서, 추상클래스는 불완전 클래스이므로
// 객체화할 수 없음
// 추상메서드나 추상클래스는 abstract라는 키워드 사용

public class AbstractClass {
    public static void main(String[] args) {
        //Animal1 a1=new Animal2(); 위에서의 객체화가안됨
        Cat2 c2=new Cat2();
        System.out.println(c2.cry());
        Dog2 d2=new Dog2();
        System.out.println(d2.cry());
    }
}

abstract class Animal2 {
    protected int weight;
    protected abstract String cry(); //추상메서드
}
class Cat2 extends Animal2{
    @Override
    protected String cry() {
        return "야옹~야옹~";
    }
}
class Dog2 extends Animal2{
    @Override
    protected String cry() {
        return "멍~멍~";
    }
}
