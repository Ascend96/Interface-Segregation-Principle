package isp.lab1.student;

import java.time.LocalDate;

public interface Book {
    public String getAuthor();

    public double getCost();

    public LocalDate getReleaseDate();

    public String getISBN();

    public int getPages();

    public int getQuantityOnHand();

    public String getTitle();

    public void order(int quantity);

    public String getFormattedReleaseDate();


}
