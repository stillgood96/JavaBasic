package stillgood96;

// 메서드 다중정의
// 객체지향 3대 중요개념 중 하나인 다형성에 해당
// 같은 이름의 메서드를 중복해서 정의하는 것을 의미
// 한 클래스에 같은 이름의 메서드가 2개 이상 존재할 수 있음
// 이때 메서드의 서명만 다르게 작성한다면 정의 가능함

public class Overloading {
    public static void main(String[] args) {
        NonOverLoading nol=new NonOverLoading();
        ApplyOverLoading aol=new ApplyOverLoading();
        System.out.println(nol.add(10,10));
        System.out.println(nol.addInt3(10,10,10));
        System.out.println(nol.addDouble(10.0,10.0));

        System.out.println(aol.add(10,10));
        System.out.println(aol.add(10,10,10));
        System.out.println(aol.add(10.0,10.0));


    }
}

class NonOverLoading {
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 프로그램
    public int add(int num1,int num2){
        int sum=0;
        sum=num1+num2;
        return sum;
    }
    public int addnt(int a,int b){
        return a+b;
    }
    // 2. 실수2개를 더하는 프로그램
    public double addDouble(double c,double d){
        return c+d;
    }

    // 3. 정수3개를 더하는 프로그램
    public int addTriple(int num1,int num2,int num3){
        int sum2=0;
        sum2=num1+num2+num3;
        return sum2;
    }
    public int addInt3(int a,int b,int c){
        return a+b+c;
    }

    // 메서드 오버로딩이 구현되지 않은 경우
    // 생성한 메서드마다 이름을 제각각으로 정해야하므로
    // 개발자가 일일히 기억해서 사용해야 하는 불편 초래
}

class ApplyOverLoading{
    // 간단한 덧셈 프로그램
    // 1. 정수2개를 더하는 프로그램
    public int add(int a,int b){
        return a+b;
    }

    // 2. 실수2개를 더하는 프로그램
    public double add(double c,double d){
        return c+d;
    }


    // 3. 정수3개를 더하는 프로그램
    public int add(int a,int b,int c){
        return a+b+c;
    }
    // 메서드 다중정의를 적용하면
    // 메서드의 이름을 하나로 통일해서 작성 가능
    // 개발자가 외울 메서드의 이름이 줄어듬
    // 단, 메서드를 어떻게 호출할지만 알고 있으면 된다.
    // ex)정수를 몇개더하는지 실수를 몇개더할건지


    //메서드명이 같아도 자료형이라던지 받는 매개변수의 개수가 다르면 중복적용이 된다.
    //1,3 번은 매개변수이름은 같지만 개수가 달라서 적용됨
    //이를 다중적용이라 함.
}