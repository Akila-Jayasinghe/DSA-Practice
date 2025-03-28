import java.util.Scanner;

public class withArray {

    private final float[] marksArray = new float[5];

    public withArray() {
        for (int i = 0; i < marksArray.length; i++) {
            marksArray[i] = 0;
        }
    }

    public void inputMarks() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 5 Marks: ");
        for (int i = 0; i < marksArray.length; i++) {
            marksArray[i] = s1.nextFloat();
        }
    }

    public void printMarks() {
        int j = 1;
        for (float x : marksArray) {
            System.out.println("std." + (j++) + "marks :- " + x);
        }
    }

    public float averageMarks() {
        float sum = 0;
        for (float x : marksArray) { sum += x; }
        return sum/marksArray.length;
    }

}
