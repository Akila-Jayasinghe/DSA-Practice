package task_03_by_Queue;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main obj = new Main();
        QueueArray qa = new QueueArray(obj.inputInt("maximum queue size"));

        int choice;
        do {
            choice = obj.giveMenu();
            switch (choice) {
                case 1:
                    if (qa.isFull()) {
                        System.out.println("No more customers can be added.");
                    } else {
                        qa.insertCustomer(obj.inputString("new user name"));
                    }
                    break;
                case 2:
                    if (qa.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        System.out.println("Next customer is " + (qa.peek().substring(0, 1).toUpperCase()+qa.peek().substring(1).toLowerCase()));
                    }
                    break;
                case 3:
                    if (qa.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        System.out.print("Customer queue: ");
                        qa.printCustomerQueue();
                    }
                    break;
                case 4:
                    if (qa.isEmpty()) {
                        System.out.println("No customers to serve.");
                    } else {
                        String tempName = qa.removeCustomer();
                        System.out.println((tempName.substring(0, 1).toUpperCase() + tempName.substring(1).toLowerCase()) + " is served.");
                    }
                    break;
                default:
                    System.out.println("Eliminating the program...");
            }
        } while (choice != 5);


    }

    public int giveMenu() {
        System.out.println();
        System.out.println("Railway station - Ticket counter");
        System.out.println("[01] Add customer to queue.");
        System.out.println("[02] Show next customer have to be served.");
        System.out.println("[03] Display customer queue.");
        System.out.println("[04] Serve customer.");
        System.out.println("[05] Exit.");

        int choice;
        do {
            choice = inputInt("your choice");
            if (!((choice >= 1) && (choice <= 5))) {
                System.out.println("\nInvalid input detected!!!");
            }
        } while (!((choice >= 1) && (choice <= 5)));
        System.out.println();
        return choice;
    }

    public int inputInt(String tag) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            System.out.print("Enter " + tag.toLowerCase() + ": ");
            choice = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("\nInvalid input detected!!!");
            inputInt(tag);
        }
        return choice;
    }

    public String inputString(String tag) {
        Scanner sc = new Scanner(System.in);
        String tempInput = sc.nextLine();
        for (int i = 0; i < tempInput.length(); i++) {
            if (!(tempInput.toLowerCase().charAt(i)>='a' && tempInput.toLowerCase().charAt(i)<='z')) {
                System.out.println("\nInvalid input detected!!!");
                inputString(tag);
            }
        }
        return tempInput;
    }

}