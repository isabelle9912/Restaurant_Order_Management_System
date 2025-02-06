import models.Client;
import models.Dish;
import models.Order;
import models.Restaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Instantiates a restaurant
        Restaurant restaurant = new Restaurant();

        Dish dish1 = new Dish("Carbonara", 23.99, "Massa");
        Dish dish2 = new Dish("Cuscuz", 17.99, "Não sei");
        Dish dish3 = new Dish("Strogonoff", 23.99, "Arroz com molho");

        // Instantiates clients
        Client client1 = new Client("Isa", "18249053982");
        Client client2 = new Client("Mike", "18249053982");
        Client client3 = new Client("Jack", "18249053982");

        // Instantiates orders and dishes and displays information about them
        Order order1 = new Order(client1);
        restaurant.addOrder(order1);

        order1.addDish(dish1);
        order1.addDish(dish2);

        order1.showOrder();

        Order order2 = new Order(client2);
        restaurant.addOrder(order2);

        order2.addDish(dish3);
        order2.addDish(dish3);

        order2.showOrder();


        Order order3 = new Order(client3);
        restaurant.addOrder(order3);

        order3.addDish(dish1);
        order3.addDish(dish2);

        order3.showOrder();

        // List pending orders
        restaurant.listPendingOrders();

        // Mark orders as completed

        order1.setStatus("Completed");
        order2.setStatus("Completed");

        // List pending orders again
        restaurant.listPendingOrders();

    }
}