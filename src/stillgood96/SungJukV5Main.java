package stillgood96;


// SungJukV5Main -> SungJukVO -> SungJukService
public class SungJukV5Main {
    public static void main(String[] args) {
        SungJukService sjsrv=new SungJukService();
        SungJukV0 hl=new SungJukV0();
        hl= sjsrv.readSungJuk();

//        System.out.println(sw.getName());

        //변수의 유효범위(scope)
        //변수가 생성된 위치와 사용하는 위치가 다른경우
        //그 결과가 예상과 다를 수 있음
        //변수의 유효범위는 블록이라 하고 { } 로 표현하는데
        //기본자료형 변수 : call by value
        //참조자료형 변수 : call by reference

        sjsrv.computeSungJuk(hl);
        sjsrv.printSungJuk(hl);










    }
}
