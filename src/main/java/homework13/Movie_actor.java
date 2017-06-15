package homework13;

public class Movie_actor {

    private Integer actorId;
    private Integer filmId;
    private String lastUpdate;

    public Integer getActorId() {
        return actorId;
    }

    public void setActorId(Integer actorId) {
        this.actorId = actorId;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Movie_actor{" +
                "actorId=" + actorId +
                ", filmId=" + filmId +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
//