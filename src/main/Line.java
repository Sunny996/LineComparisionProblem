package main;

public class Line {
    public double lengthOfLine(double x1, double y1, double x2, double y2){
        return Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
    }
   
    public void compareLines(Double length3, Double length4){
        if (length3.compareTo(length4)==0)
            System.out.println("lines are equal");
        else if(length3.compareTo(length4)>0)
            System.out.println("First line is larger than Second");
        else if (length3.compareTo(length4)<0)
            System.out.println("First line is smaller than Second");
    }
}
