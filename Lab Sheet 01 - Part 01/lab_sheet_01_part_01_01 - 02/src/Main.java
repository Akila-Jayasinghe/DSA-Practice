//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        withoutArray noArray = new withoutArray();
        noArray.inputMarks();
        noArray.printMarks();
        System.out.println("Average marks:- " + noArray.averageMarks());

        System.out.println("\n");

        withArray Array = new withArray();
        Array.inputMarks();
        Array.printMarks();
        System.out.println("Average marks:- " + Array.averageMarks());

    }
}