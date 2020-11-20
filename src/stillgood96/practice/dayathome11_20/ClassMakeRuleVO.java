package stillgood96.practice.dayathome11_20;

public  class ClassMakeRuleVO {
    private int salary=0;
    private int isMarried=0;

    public ClassMakeRuleVO() {
    }

    public ClassMakeRuleVO(int salary, int isMarried) {
        this.salary = salary;
        this.isMarried = isMarried;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(int isMarried) {
        this.isMarried = isMarried;
    }

    public double manageTax(){
        double tax=0.0;

        if(isMarried==0){
            if(salary>3000){
                tax=salary*0.15;
            }else tax=salary*0.10;
        }else{
            if(salary>6000){
                tax=salary*0.25;
            }else{
                tax=salary*0.10;
            }
        }
        return tax;
    }
}
