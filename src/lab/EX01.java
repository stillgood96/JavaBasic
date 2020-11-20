package lab;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체 생성
        Student kim=new Student();
        //학과 클래스를 이용해서 객체 생성
        Department dept=new Department();
        //과목 클래스를 이용해서 객체 생성
        Subject subj=new Subject();
        //교수 클래스를 이용해서 객체 생성
        Professor prof=new Professor();
        //각 개체에 대해 변수 값 대입

        //기본생성자로 만든 객체내용 값 출력
        System.out.println(kim.stdNum);
        System.out.println(dept.dname);
        System.out.println(subj.no);
        System.out.println(prof.no);

        //매개변수를 사용하는 생성자 값넣고 전지현 출력해보기
        Student jeon=new Student(201252110,"전지현","경기도 의정부시","1986.4.30","의상디자인","445");
        System.out.println(jeon.stdNum);
        System.out.println(jeon.name);
        System.out.println(jeon.adr);
        System.out.println(jeon.birth);
        System.out.println(jeon.dept);
        System.out.println(jeon.prof);


        //학생
        /*
        kim.stdNum=201350050;
        kim.name="김태희";
        kim.adr="경기도 고양시";
        kim.birth="1985.3.22";
        kim.dept="컴퓨터";
        kim.prof="504";
        //학과
        dept.dname="컴퓨터공학";
        dept.phone="123-4567-8901";
        dept.office="E동 2층";
        dept.chief="504";
        //과목
        subj.no="0205";
        subj.subname="프로그래밍";
        subj.desc="자바프로그래밍";
        subj.prof="301";
        //교수
        prof.no="301";
        prof.name="이순신";
        prof.mjfield="프로그래밍";
        */
        //매개변수를 사용하는 생성자로 객체 생성
        Student lee=new Student(201252110,
                "전지현","경기도 의정부시",
                "1986.05.06",
                "의상디자인","445");





        /*
        //객체에 저장된 값 출력
        //학생
        System.out.println(kim.stdNum);
        System.out.println(kim.name);
        System.out.println(kim.adr);
        System.out.println(kim.birth);
        System.out.println(kim.dept);
        System.out.println(kim.prof);
        //학과
        System.out.println(dept.dname);
        System.out.println(dept.phone);
        System.out.println(dept.office);
        System.out.println(dept.chief);
        //과목
        System.out.println(subj.no);
        System.out.println(subj.subname);
        System.out.println(subj.desc);
        System.out.println(subj.prof);
        //교수
        System.out.println(prof.no);
        System.out.println(prof.name);
        System.out.println(prof.mjfield);
        */
    }
}
