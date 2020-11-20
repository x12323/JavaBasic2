package cooperation;

public class Student {
    private String name;
    private String stdyear;
    private int mymoney;
    private String busnum;
    private String pasg;
    private int income;
    private int rtn;
    private String nop;
    private int mony;

    public Student(){
    }

    public Student(String name, String stdyaer, int mymoney){
        this.name = name;
        this.stdyear = stdyaer;
        this.mymoney = mymoney;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String getStdyear() {
        return stdyear;
    }

    public void setStdyear(String stdyear) {
        this.stdyear = stdyear;
    }

    public int getMymoney() {
        return mymoney;
    }

    public void setMymoney(int mymoney) {
        this.mymoney = mymoney;
    }

    public String getBusnum() {
        return busnum;
    }

    public void setBusnum(String busnum) {
        this.busnum = busnum;
    }

    public String getPasg() {
        return pasg;
    }

    public void setPasg(String pasg) {
        this.pasg = pasg;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public int getRtn() {
        return rtn;
    }

    public void setRtn(int rtn) {
        this.rtn = rtn;
    }

    public String getNop() {
        return nop;
    }

    public void setNop(String nop) {
        this.nop = nop;
    }

    public int getMony() {
        return mony;
    }

    public void setMony(int mony) {
        this.mony = mony;
    }
}
