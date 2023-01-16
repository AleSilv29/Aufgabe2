package View;

import Controller.Controller;
import Model.Food;
import Model.Ingredients;

import java.util.Scanner;

public class View {
    Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void menu() {
        System.out.println("0) Exit\n1) Filter by quantity!\n2) Food has ingredient!\n3) All quantity\n");
        Integer option;
        do {
            System.out.println();
            System.out.print("Choose an option: ");
            System.out.println();
            Scanner in = new Scanner(System.in);
            option = in.nextInt();
            if (option==1){
                System.out.print("Quantity: ");
                Scanner myObj = new Scanner(System.in);
                int scanQuant = Integer.parseInt(myObj.nextLine());
                controller.filterQuantity(scanQuant);

            }
            if (option == 0) {
                break;
            }
            if (option == 2) {
                break;
            }
            if (option == 3) {
                break;
            }

        } while (option != 0);
    }
}
