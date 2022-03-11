package main;

public class LineTest {
    public static void main(String[] args) {
        Line line = new Line();
        double lineLength1=line.lengthOfLine(1,2,10,11);
        double lineLength2=line.lengthOfLine(3,4,12,13);
        line.equalLines(lineLength1,lineLength2);
    }
}
