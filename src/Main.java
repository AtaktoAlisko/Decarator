import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ToppingDecorator> toppings = new ArrayList<>();

        Item burger = new Burger("Basic Burger", 2.0);


        while (true) {
            System.out.println("Выберите начинку для бургера:");
            System.out.println("1. Сыр");
            System.out.println("2. Салат");
            System.out.println("3. Завершить");

            System.out.println("Ваш выбор:");
            int choice = scanner.nextInt();


            if (choice == 1) {
                burger = new Cheese(burger);
                toppings.add(new Cheese(burger));
            } else if (choice == 2) {
                burger = new Lettuce(burger);
                toppings.add(new Lettuce(burger));
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }

        System.out.println("Бургер: " + burger.getName());
        System.out.println("Итоговая стоимость: $" + burger.getPrice());
    }
}
