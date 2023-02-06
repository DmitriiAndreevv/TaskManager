package TaskMenu;

import java.util.Scanner;

public class WorkPanel {
    public static void run(){
        Task t1 = new Task("Покормить собаку", "Дмитрий", 3, "07.02");
        Task t2 = new Task();
        Task t3 = new Task("Купить воды", "Дмитрий", 3, "07.02");
        Task t4 = new Task("Купить продукты", "Дмитрий", 1, "07.02");
        Task t5 = new Task("Заправить автомобиль", "Дмитрий", 2, "07.02");
        Planner myP = new Planner();
        myP.add(t1);
        myP.add(t2);
        myP.add(t3);
        myP.add(t4);
        myP.add(t5);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        Writer writer = new Writer(scanner);
        UserInterface userInterface = new UserInterface(scanner, menu, myP, writer);
        userInterface.start();
    }
}
