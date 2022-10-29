package task1;

import java.util.Objects;

public class CandyBox {
    private String flavor;
    private String origin;

    public CandyBox() {
        this.flavor = "sugar-free";
        this.origin = "Switzerland";
    }

    public CandyBox(String flavor, String origin) {
        this.flavor = flavor;
        this.origin = origin;
    }

    float getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "The " + this.origin + " " +
                this.flavor + " chocolate";
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getFlavor() {
        return flavor;
    }

    public String getOrigin() {
        return origin;
    }

    public boolean equals(CandyBox o) {
        return this.flavor.equals(o.getFlavor()) &&
                this.origin.equals(o.getOrigin());
    }

    public void printDim() {
        System.out.println("" + 0.0);
    }
}
