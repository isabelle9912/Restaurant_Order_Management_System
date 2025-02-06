package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Restaurant {
    private final List<Order> orders;

    public Restaurant() {
        this.orders = new ArrayList<>();
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Restaurant that)) return false;
        return Objects.equals(orders, that.orders);
    }

    public void addOrder(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }

    public void listPendingOrders() {
        System.out.println("Lista de pedidos pendentes:");
        boolean found = false;
        for (Order order : orders) {
            if (Objects.equals(order.getStatus(), "Open")) {
                order.showOrder();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nenhum pedido pendente.");
        }
    }
}
