package lab;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체 생성
        Student kim = new Student();
        Student song = new Student();
        Student jeon = new Student();
        Student suzy = new Student();
        Student iu = new Student();
        //학과 클래스를 이용해서 객체 생성
        Subject computer = new Subject();
        Subject clothes = new Subject();
        Subject foodValue = new Subject();
        Subject philosophy = new Subject();
        //과목 클래스를 이용해서 객체 생성
        lecture programming = new lecture();
        lecture dressCode = new lecture();
        lecture lifeOfOpinion = new lecture();
        lecture devil = new lecture();
        //교수 클래스를 이용해서 객체 생성
        professor lee = new professor();
        professor jung = new professor();
        professor kim2 = new professor();
        professor lee2 = new professor();

        //각 개체에 대해 변수 값 대입
        kim.name_number = 201350050;
        kim.name = "김태희";
        kim.address = "경기도 고양시";
        kim.birth = "1985.3.22";
        kim.subject = "컴퓨터";
        kim.teacher = 504;

        song.name_number = 201250006;
        song.name = "송혜교";
        song.address = "서울시 영등포구";
        song.birth = "1988.9.17";
        song.subject = "컴퓨터";
        song.teacher = 301;

        jeon.name_number = 201252110;
        jeon.name = "전지현";
        jeon.address = "경기도 의정부시";
        jeon.birth = "1988.9.17";
        jeon.subject = "의상디자인";
        jeon.teacher = 445;

        suzy.name_number = 201351010;
        suzy.name = "수지";
        suzy.address = "서울 성북구";
        suzy.birth = "1988.7.13";
        suzy.subject = "식품영양";
        suzy.teacher = 556;

        iu.name_number = 201353011;
        iu.name = "아이유";
        iu.address = "경기도 천안시";
        iu.birth = "1987.2.25";
        iu.subject = "철학";
        iu.teacher = 504;

        //#2
        computer.name="컴퓨터공학";
        computer.phone="123-4567-8901";
        computer.location="E동 2층";
        computer.master=504;

        //#3
        programming.number=0205;
        programming.name="자바프로그래밍";
        programming.master="301";

        //객체에 저장된 값 출력
        System.out.println(kim.name_number);
        System.out.println(kim.name);
        System.out.println(kim.address );
        System.out.println(kim.birth );
        System.out.println(kim.subject );
        System.out.println(kim.teacher );

        System.out.println(computer.name);
        System.out.println(computer.phone);
        System.out.println(computer.location);
        System.out.println(computer.master);

    }
}
