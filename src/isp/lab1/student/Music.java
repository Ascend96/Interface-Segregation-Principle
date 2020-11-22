package isp.lab1.student;

import java.time.Duration;
import java.time.LocalDate;

public interface Music {
    public String getArtist();

    public double getCost();

    public String getFormattedPlayingTime();

    public String getFormattedReleaseDate();

    public Duration getPlayingTime();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getTitle();

    public void order(int quantity);

}
