package stillgood96;

import java.io.*;

// 2차원 표 형태의 데이터를 파일에 저장하기
public class FileReaderWriter2 {
    public static void main(String[] args) throws IOException {
        // 학번,이름,주소,생년월일,학과명,교수등으로
        // 구성된 2차원 표형태의 데이터를 student.dat에
        // 저장

        // 어떤 학생의 기본정보
        int hakbun = 201350050;
        String name = "김태희";
        String addr = "경기도 고양시";
        String birth = "1985.3.22";
        String dname = "컴퓨터";
        int prof = 504;

        // 학생 기본정보를 저장할 파일 지정
        String fpath = "c:/Java/student.dat";
        FileWriter fw = new FileWriter(fpath);

        // 기본정보를 저장할 형식 저장
        // 각 항목들은 , 로 구분
        String fmt = "%s,%s,%s,%s,%s,%s";
        String data = String.format(fmt,hakbun,name,addr,birth,dname,prof);

        fw.write(data);
        fw.close();

        // 버퍼기능을 지원하는 Writer 사용
        fw = new FileWriter(fpath);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(data);

        bw.close();
        fw.close();



        // 실습)
        // 과목번호, 과목명, 과목개요, 담당교수등으로
        // 구성된 2차원 표형태의 데이터를 subject.dat에
        // 저장

        //선생님ver
        String sjno = "0205";
        String sjname = "프로그래밍";
        String sjdesc = "자바 프로그래밍";
        int sjprof = 301;

        fpath = "c:/Java/subjectTeacher.dat";
        fmt = "%s,%s,%s,%s";
        fw = new FileWriter(fpath);
        bw = new BufferedWriter(fw);

        data=String.format(fmt,sjno,sjname,sjdesc,sjprof);
        bw.write(data);

        bw.close();
        fw.close();


        //내 ver
        int snum = 0205;
        String subject = "프로그래밍";
        String sjex = "자바 프로그래밍";
        int prof2 = 301;


        // 파일위치 지정
        fpath = "c:/Java/Subject.dat";
        fw = new FileWriter(fpath);

        String fmt2 = "%s,%s,%s,%s";
        String data2 = String.format(fmt2,snum,subject,sjex,prof2);

        fw.write(data2);
        fw.close();

        //버퍼사용
        fw = new FileWriter(fpath);
        bw = new BufferedWriter(fw);

        bw.write(data2);
        bw.close();
        fw.close();






        // 과목 기본정보가 저장된 파일을 읽어서
        // 출력하기
        // 과목번호 : ~~
        // 과목이름 : ~~
        // ...
        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);
        fmt = "과목번호 : %s\n과목명 : %s\n과목개요 : %s\n담당교수 : %s\n";


        while(br.ready()){

            String line = br.readLine();
//            System.out.println( line );
            // 읽어온 데이터를 , 단위로 분리해서
            // 배열변수에 저장    .split() 메서드사용
            String[] items = line.split(",");
            String result = String.format(fmt,
                    items[0],items[1],items[2],items[3]);
            System.out.println(result);
        }
        br.close();
        fr.close();
    }
}
