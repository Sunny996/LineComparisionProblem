package main;

public class Line {
    public double lengthOfLine(double x1, double y1, double x2, double y2){
        return Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
    }

    public void equalLines(Double length1,Double length2) {
        boolean equality = length1.equals(length2);

        if (equality)
            System.out.println("Both lines are equal");
        else
            System.out.println("Lines are not equal");
    }
}
