package task1;

public class ChocAmor extends CandyBox{
    private float length;

    public ChocAmor() {
        this.length = 0;
    }

    public ChocAmor(String flavor, String origin, float length) {
        super(flavor, origin);
        this.length = length;
    }

    @Override
    public float getVolume() {
        return this.length * this.length * this.length;
    }

    @Override
    public String toString() {
        return "ChocAmor: " + super.toString() + " has volume " + this.getVolume();
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void printChocAmorDim() {
        System.out.println("ChocAmor: " + this.length);
    }

    @Override
    public void printDim() {
        System.out.println("ChocAmor: " + this.length);
    }
}
