package lab.movies;

public class Movie {
    //멤버변수
    private String title;
    private String year;
    private int min;
    private String pd;
    private String[] genre;
    private String[] director;
    private String[] actor;
    private String summary;
    private String desc;

    //생성자

    public Movie() {
    }

    public Movie(String title, String year, int min, String pd, String[] genre, String[] director, String[] actor, String summary, String desc) {
        this.title = title;
        this.year = year;
        this.min = min;
        this.pd = pd;
        this.genre = genre;
        this.director = director;
        this.actor = actor;
        this.summary = summary;
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    public String[] getGenre() {
        return genre;
    }

    public void setGenre(String[] genre) {
        this.genre = genre;
    }

    public String[] getDirector() {
        return director;
    }

    public void setDirector(String[] director) {
        this.director = director;
    }

    public String[] getActor() {
        return actor;
    }

    public void setActor(String[] actor) {
        this.actor = actor;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
