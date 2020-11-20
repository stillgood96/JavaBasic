package lab;

public class Student {
    int stdNum;
    String name;
    String adr;
    String birth;
    String dept;
    String prof; //교수는 숫자인데 문자열로하는이유는 문자가 3개다 ex)504
                //504로 하면 3바이트 정수형으로하면 4바이트

                //기본생성자
                public Student(){
                    stdNum=201350050;
                    name="송혜교";
                    adr="서울 영등포구";
                    birth="1988.9.17";
                    dept="컴퓨터";
                    prof="301";
                }
                //매개변수생성자
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

    //기본생성자
    public Department(){
        dname="의상디자인";
        phone="234-5678-9012";
        office="A동 1층";
        chief="301";
    }


    public Department(String dname,String phone,String office,String chief){
        this.dname=dname;
        this.phone=phone;
        this.office=office;
        this.chief=chief;
    }

}
class Subject{
    String no;
    String subname;
    String desc;
    String prof;
    //기본생성자
    public Subject(){
         no="0211";
         subname="드레스 코드";
         desc="옷 입기 기초";
         prof="4455";

    }
}
class Professor{
    String no;
    String name;
    String mjfield;
    //기본생성자
    public Professor(){
         no="301";
         name="정약용";
         mjfield="의상디자인";
    }
}
