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

        //학생
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

    }
}
