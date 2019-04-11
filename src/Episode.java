
public class Episode {

    int time;
    String episodeName;

    public Episode(int lengthSeconds, String episodeTitle) {
        this.time = lengthSeconds;
        this.episodeName = episodeTitle;
    }


    public String getName() {
        return episodeName;
    }

}
