package task1;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> candies;

    public CandyBag() {
        this.candies = new ArrayList<>();
        this.candies.add(
                new Lindt(
                        "cherry",
                        "Austria",
                        20,
                        (float)5.4,
                        (float)19.2
                )
        );

        this.candies.add(
                new Lindt(
                        "apricot",
                        "Austria",
                        20,
                        (float)5.4,
                        (float)19.2
                )
        );

        this.candies.add(
                new Lindt(
                        "strawberry",
                        "Austria",
                        20,
                        (float)5.4,
                        (float)19.2
                )
        );

        this.candies.add(
                new Baravelli(
                        "grape",
                        "Italy",
                        (float)6.7,
                        (float)8.7
                )
        );

        this.candies.add(
                new ChocAmor(
                        "coffee",
                        "France",
                        (float)5.5
                )
        );

        this.candies.add(
                new ChocAmor(
                        "vanilla",
                        "France",
                        (float)5.5
                )
        );
    }

    public ArrayList<CandyBox> getCandies() {
        return candies;
    }
}
