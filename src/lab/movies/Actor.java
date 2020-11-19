package lab.movies;

public class Actor {
    //  멤버변수
    private String name;
    private String bitch;
    private String[] joinmovie;
    private String[] casting;

    public Actor() {
    }

    public Actor(String name, String bitch,
                 String[] joinmovie, String[] casting) {
        this.name = name;
        this.bitch = bitch;
        this.joinmovie = joinmovie;
        this.casting = casting;
    }

    public String getName() {
        return name;
    }

    public String getBitch() {
        return bitch;
    }

    public String[] getJoinmovie() {
        return joinmovie;
    }

    public String[] getCasting() {
        return casting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBitch(String bitch) {
        this.bitch = bitch;
    }

    public void setJoinmovie(String[] joinmovie) {
        this.joinmovie = joinmovie;
    }

    public void setCasting(String[] casting) {
        this.casting = casting;
    }
}
