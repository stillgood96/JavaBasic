package semiproject11_26;


import java.io.*;

public class EmployeeV2Service extends EmployeeV1Service {
    private String fpath = "c:/java/Employee.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;


    public EmployeeV2Service() {

        try {
            loadEmployee();
        } catch (IOException e) {
            System.out.println("읽어오기 오류뜸!");
            e.printStackTrace();
        }
    }

    public void displayMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("인사정보 처리프로그램 v2\n")
                .append("-------------------\n")
                .append("1. 인사 정보 입력\n")
                .append("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? [1,2,3,4,5,0] ");
        System.out.print(sb);
    }

    @Override
    public void newEmployee() {
        super.newEmployee();

        try {
            writeEmployee(ep);
        } catch (IOException e) {
            System.out.println(" 파일쓰기중 오류 !");
            e.printStackTrace();
        }
    }

    protected void writeEmployee (EmployeeVO ep) throws IOException {
        String fmt ="%d,%s,%s,%s,%s,%s,%s,%d,%f,%d,%d";


        fw = new FileWriter(fpath,true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt,ep.getEmpno(),ep.getFname(),ep.getLname(),
                ep.getEmail(),ep.getPhone(),ep.getHdatd(),ep.getJobid(),ep.getSal(),ep.getComm(),
                ep.getMgrid(),ep.getDeptid());

        bw.write(data);
        bw.newLine();

        bw.close();
        fw.close();


    }

    protected void loadEmployee() throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while(br.ready()){
            String ep1 [] = br.readLine().split(",");

            ep = new EmployeeVO(Integer.parseInt(ep1[0]),ep1[1],ep1[2],ep1[3],ep1[4],ep1[5],ep1[6],Integer.parseInt(ep1[7]),
                    Double.parseDouble(ep1[8]),Integer.parseInt(ep1[9]),Integer.parseInt(ep1[10]));
            empdata.add(ep);


        }
        br.close();
        fr.close();
    }








}
