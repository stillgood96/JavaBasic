package lab;

public class Student {
    int stdNum;
    String name;
    String adr;
    String birth;
    String dept;
    String prof; //교수는 숫자인데 문자열로하는이유는 문자가 3개다 ex)504
                //504로 하면 3바이트 정수형으로하면 4바이트
                public Student(){
                    stdNum=201350050;
                    name="송혜교";
                    adr="서울 영등포구";
                    birth="1988.9.17";
                    dept="컴퓨터";
                    prof="301";
                }
                public Student(int stdNum,String name,String adr,String birth,String dept,String prof){
                    this.stdNum=stdNum; //this. 를 이용해서 클래스 내부에 있는 변수를 뜻하고 있다 알림
                    this.name=name;
                    this.adr=adr;
                    this.birth=birth;
                    this.dept=dept;
                    this.prof=prof;
                }
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
