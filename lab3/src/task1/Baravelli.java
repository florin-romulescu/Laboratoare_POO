package task1;

public class Baravelli extends CandyBox{
    private float radius, height;

    public Baravelli() {
        super();
        this.radius = this.height = 0;
    }

    public Baravelli(String flavor, String origin, float radius, float height) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return this.radius * this.radius * (float) Math.PI * this.height;
    }

    @Override
    public String toString() {
        return "Baravelli: " + super.toString() + " has volume " + this.getVolume();
    }

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void printBaravelliDim() {
        System.out.println("Baravelli: " + this.radius + " " + this.height);
    }

    @Override
    public void printDim() {
        System.out.println("Baravelli: " + this.radius + " " + this.height);
    }
}
