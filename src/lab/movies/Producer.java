package lab.movies;

public class Producer {
    private String name;
    private String adr;
    private String[] movie;

    public Producer() {
    }

    public Producer(String name, String adr, String[] movie) {
        this.name = name;
        this.adr = adr;
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public String getAdr() {
        return adr;
    }

    public String[] getMovie() {
        return movie;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public void setMovie(String[] movie) {
        this.movie = movie;
    }
}
