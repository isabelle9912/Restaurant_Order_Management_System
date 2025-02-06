package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {
    private Client client;
    private List<Dish> dishes;
    private String status;

    public Order(Client client) {
        setClient(client);
        setDishes(new ArrayList<>());
        setStatus("Open");
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return Objects.equals(client, order.client) && Objects.equals(dishes, order.dishes) && Objects.equals(status, order.status);
    }

    public void addDish(Dish dish) {
        if (!dishes.contains(dish)) dishes.add(dish);
    }

    public void updateStatus(String status) {
        if (!status.equals(this.status)) this.status = status;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Dish dish : dishes) {
            totalPrice += dish.getPrice();
        }
        return totalPrice;
    }

    public void showOrder() {
        System.out.println("Pedido do cliente: " + client.getName());
        System.out.println("Status: " + getStatus());
        System.out.println("Pratos:");
        for (Dish dish : dishes) {
            System.out.println("- " + dish.getName() + " | R$" + dish.getPrice());
        }
        System.out.println("Total: R$" + calculateTotalPrice());
    }
}
