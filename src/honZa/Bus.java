package honZa;
//기사님, 요금, 시간, 속도, 좌석
public class Bus {

    private String article;
    private int seat;
    private int charge;
    private String time;
    private String speed;


    public Bus(){
    }

    public Bus(String article,int charge, int seat,
               String time, String speed){
        this.article = article;
        this.charge = charge;
        this.seat = seat;
        this.time = time;
        this.speed = speed;
    }

    public void setArticle(String article){
        this.article = article;
    }
    public String getArticle(){
        return article;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}