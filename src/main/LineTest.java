package main;

public class LineTest {
    public static void main(String[] args) {
        Line line1 = new Line(1, 2, 10, 11);
        Line line2 = new Line(3, 4, 12, 14);
        line1.compareLines(line2);
    }
}