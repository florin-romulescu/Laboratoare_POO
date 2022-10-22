package lab2.task3;

import java.util.ArrayList;

public class Polygon {
    private int n;
    private ArrayList<Point> points;

    public Polygon(int n) {
        this.n = n;
        this.points = new ArrayList<Point>(n);
    }

    public Polygon(float[] points) {
        this.n = points.length / 2;
        this.points = new ArrayList<Point>(this.n);

        for (int i = 0; i < points.length; i += 2) {
            Point point = new Point(points[i], points[i+1]);
            this.points.add((point));
        }
    }

    public void showPolygon() {
        for (int i = 0; i < this.n; ++i) {
            System.out.println(this.points.get(i));
        }
    }
}
