package TaskMenu;

import java.util.Scanner;

public class Writer {
    private final Scanner scanner;

    public Writer(Scanner scanner) {
        this.scanner = scanner;
    }
    public Task makeNewList1(){
        System.out.println("Добавьте заметку: \\n Введите тему\"");
        String sb = scanner.nextLine();
        System.out.println("Введите время выполнения");
        String endOfTask = scanner.nextLine();
        System.out.println("Введите Ф.И.О: ");
        String name = scanner.nextLine();
        System.out.println("\nУстановите приоритет: 1 - низкий, 2 - средний, 3 - высокий");
        String prior = scanner.nextLine();
        int priority = 0;
        if (prior.equals("1") | prior.equals("2") | prior.equals("3")) {
            priority = Integer.parseInt(prior);
        } else {
            System.out.println("Ошибка ввода, приоритет не установлен");
        }

        return new Task(sb, name, priority, endOfTask);
    }
}
