package semiproject11_26.practice;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProfessorService extends ProfessorGenericClass {
    List<ProfessorVO> pfdata = new ArrayList<>();
    String fpath =  "c:/java/Prof.dat";
    private FileWriter fw = null;
    private BufferedWriter bw = null;
    private FileReader fr = null;
    private BufferedReader br = null;



    ProfessorVO pf = null;

    public ProfessorService()  {
        try {
            loadProf();
        } catch (IOException e) {
            System.out.println("파일 불러오기 실패");
            e.printStackTrace();
        }
    }

    public void display () {
        StringBuilder sb =new StringBuilder();
                  sb.append("--------교수관리-------\n")
                    .append("1.새로운 교수 추가\n")
                    .append("2.교수 읽기\n")
                    .append("3.교수 상세 읽기\n")
                    .append("0.프로그램종료\n")
                    .append("---------------------\n")
                    .append("작업하실 번호 입력:");
        System.out.println(sb);
    }

    @Override
    public void newProfessor() {
       int pfn;
       String name;
       String job;

        Scanner sc = new Scanner(System.in);
        System.out.print("교수번호 입력:");
        pfn = Integer.parseInt(sc.nextLine());
        System.out.print("교수이름 입력:");
        name = sc.nextLine();
        System.out.print("교수전공 입력:");
        job = sc.nextLine();

        ProfessorVO pfs = new ProfessorVO(pfn,name,job);

        pfdata.add(pfs);

        try {
            writeProfessor(pfs);
        } catch (IOException e) {
            System.out.println("파일쓰기 오류!");
            e.printStackTrace();
        }


    }

    @Override
    public void readProfessor() {
        String fmt = "%8s %8s %8s\n";

        String head = String.format(fmt,"profNum","name","master");
        System.out.println(head);
        Iterator<ProfessorVO> iter = pfdata.iterator();

        while(iter.hasNext()){
            ProfessorVO i = iter.next();
            System.out.printf(fmt,i.getpNum(),i.getName(),i.getJob());
        }
    }

    @Override
    public void readOneProfessor() {
      String fmt = "교수번호 :%s\n교수이름: %s\n교수전공: %s\n";
      ProfessorVO pfv = new ProfessorVO();

      Scanner sc = new Scanner(System.in);
        System.out.print("조회하실 교수 번호 :");
        pfv.setpNum( Integer.parseInt( sc.nextLine() ));

        for( ProfessorVO v : pfdata) {
            if ( v.getpNum() == pfv.getpNum()){
                pfv = v ;
            }
        }
        fmt = String.format(fmt,pfv.getpNum(),pfv.getName(),pfv.getJob());
        System.out.println(fmt);
    }

    public void writeProfessor (ProfessorVO pf) throws IOException {
        String fmt = "%d,%s,%s";
        FileWriter fw = new FileWriter(fpath,true);
        BufferedWriter bw = new BufferedWriter(fw);

        String data = String.format(fmt,pf.getpNum(),pf.getName(),pf.getJob());
        bw.write(data);
        bw.newLine();

        bw.close();
        fw.close();
    }
    public void loadProf() throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while(br.ready()){
            String  pf2[] = br.readLine().split(",");

           pf = new ProfessorVO(Integer.parseInt(pf2[0]),pf2[1],pf2[2]);

           pfdata.add(pf);



        }
        br.close();
        fr.close();


    }
}
