import java.util.ArrayList;

public class Season extends Show {

    int seasonNumber;
    Episode episode;
    ArrayList<Episode> allEpisodes;

    public Season(String seriesName, int seasonNumber) {
        super(seriesName);
        this.seasonNumber = seasonNumber;
    }


    public void addFullSeason(ArrayList<Episode> allEpisodes) {
        this.allEpisodes = allEpisodes;
    }

    public void addEpisode(Episode episode) {
        this.episode = episode;
    }

    public ArrayList<Episode> getFullSeason() {
        return allEpisodes;
    }



}
