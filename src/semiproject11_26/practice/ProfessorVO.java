package semiproject11_26.practice;

public class ProfessorVO {
    private int pNum;
    private String name;
    private String job;

    public ProfessorVO() {
    }

    public ProfessorVO(int pNum, String name, String job) {
        this.pNum = pNum;
        this.name = name;
        this.job = job;
    }

    public int getpNum() {
        return pNum;
    }

    public void setpNum(int pNum) {
        this.pNum = pNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
