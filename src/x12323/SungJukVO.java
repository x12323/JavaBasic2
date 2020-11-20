package x12323;

/**
 * 파일명 : Sungjukv2
 * 작성일 : 2020.11.17
 * 프로그램설명 : 성적처리프로그램 v2
 * 이름, 국어, 영어, 수학 점수를 키보드로 입력받아
 * 총점, 평균,학점을 계산하고 결과 출력
 * (단, 평균은 소수점 첫째자리까지 출력)
 * 학점 기준은 수우미양가로 하되 Switch문으로 계산하도록 함.
 * 단, 성적처리 결과 출력시 출력문을 하나만 사용
 * 그리고 Math.round(값)을 이용해서
 * 평균은 소수점 둘째자리까지 끊어서 출력함
 * <p>
 * 변수 : name, kor, eng, mat, sum, mean, grd
 */
//메인메서드 겟셋

public class SungJukVO {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private double mean;
    private char grd;

    public SungJukVO() {

    }

    public SungJukVO(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return math;
    }

    public void setMat(int math) {
        this.math = math;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }
}




