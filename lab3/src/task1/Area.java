package task1;

public class Area {
    private CandyBag present;
    private int number;
    private String street;
    private String message;

    public Area() {
        present = new CandyBag();
        number = 0;
        street = "nowhere";
        message = "nowhere";
    }

    public Area(int number, String sweet, String message, CandyBag present) {
        this.present = present;
        this.number = number;
        this.street = sweet;
        this.message = message;
    }

    public void getBirthdayCard() {
        System.out.println("Street " + street + ", " + "number " + number);
        System.out.println();
        System.out.println(message);
        System.out.println();

        for (int i = 0; i < present.getCandies().size(); ++i) {
            CandyBox candy = present.getCandies().get(i);

            if (candy instanceof Lindt) {
                ((Lindt) candy).printLindtDim();
            } else if (candy instanceof Baravelli) {
                ((Baravelli) candy).printBaravelliDim();
            } else if (candy instanceof ChocAmor) {
                ((ChocAmor) candy).printChocAmorDim();
            }
        }
    }

    public void getBirthdayCardv2() {
        System.out.println("Street " + street + ", " + "number " + number);
        System.out.println();
        System.out.println(message);
        System.out.println();

        for (int i = 0; i < present.getCandies().size(); ++i) {
            present.getCandies().get(i).printDim();
        }
    }
}
