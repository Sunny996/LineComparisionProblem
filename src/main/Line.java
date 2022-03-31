package main;

public class Line {
    public double xCoordinate1;
    public double yCoordinate1;
    public double xCoordinate2;
    public double yCoordinate2;

    public Line(double xCoordinate1, double yCoordinate1, double xCoordinate2, double yCoordinate2) {
        this.xCoordinate1 = xCoordinate1;
        this.yCoordinate1 = yCoordinate1;
        this.xCoordinate2 = xCoordinate2;
        this.yCoordinate2 = yCoordinate2;
    }

    public double lengthOfLine() {
        return Math.pow(Math.pow(this.xCoordinate2 - this.xCoordinate1, 2) + Math.pow(this.yCoordinate2 - this.yCoordinate1, 2), 0.5);
    }

    public void compareLines(Line length) {
        int equality=((Double) this.lengthOfLine()).compareTo(length.lengthOfLine());
        if (equality == 0)
            System.out.println("lines are equal");
        else if (equality > 0)
            System.out.println("First line is larger than Second");
        else if (equality < 0)
            System.out.println("First line is smaller than Second");
    }
}