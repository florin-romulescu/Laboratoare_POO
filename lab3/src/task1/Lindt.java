package task1;

public class Lindt extends CandyBox{
    private float length;
    private float width;
    private float height;

    public Lindt() {
        super();
        this.length = this.width = this.height = 0;
    }

    public Lindt(String flavor, String origin, float length, float width, float height) {
        super(flavor, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Lindt(float length, float width, float height) {
        super();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getVolume() {
        return this.length * this.height * this.width;
    }

    @Override
    public String toString() {
        return "Lindt: " + super.toString() + " has volume " + this.getVolume();
    }

    public void printLindtDim() {
        System.out.println("Lindt: " + this.length + " " + this.width + " " + this.height);
    }

    @Override
    public void printDim() {
        System.out.println("Lindt: " + this.length + " " + this.width + " " + this.height);
    }

}
