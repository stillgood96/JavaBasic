package lab;

public class Student {
    int stdNum;
    String name;
    String adr;
    String birth;
    String dept;
    String prof; //교수는 숫자인데 문자열로하는이유는 문자가 3개다 ex)504
                //504로 하면 3바이트 정수형으로하면 4바이트
}
class Department{
    String dname;
    String phone;
    String office;
    String chief;
}
class Subject{
    String no;
    String subname;
    String desc;
    String prof;
}
class Professor{
    String no;
    String name;
    String mjfield;
}
