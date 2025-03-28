import java.util.Scanner;

public class withoutArray {

    private float std01, std02, std03, std04, std05;

    public withoutArray() {
        std01 = std02 = std03 = std04 = std05 = 0;
    }

    public void inputMarks() {
        System.out.print("Enter marks of te students :\n");
        Scanner s1 = new Scanner(System.in);
        std01 = s1.nextFloat();
        std02 = s1.nextFloat();
        std03 = s1.nextFloat();
        std04 = s1.nextFloat();
        std05 = s1.nextFloat();
    }

    public void printMarks() {
        System.out.println("Marks of the 1st student:- " + std01);
        System.out.println("Marks of the 2nd student:- " + std02);
        System.out.println("Marks of the 3rd student:- " + std03);
        System.out.println("Marks of the 4th student:- " + std04);
        System.out.println("Marks of the 5th student:- " + std05);
    }

    public float averageMarks() {
        return (std01 + std02 + std03 + std04 + std05) / 5;
    }

}
