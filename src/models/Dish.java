package models;

import java.util.Objects;

public class Dish {
    private String name;
    private double price;
    private String category;

    public Dish(String name, double price, String category) {
        setName(name);
        setPrice(price);
        setCategory(category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Dish dish)) return false;
        return Double.compare(price, dish.price) == 0 && Objects.equals(name, dish.name) && Objects.equals(category, dish.category);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nome='" + getName() + '\'' +
                ", preço=" + getPrice() +
                ", categoria='" + getCategory() + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println("Nome: " + getName() + "| Preço " + getPrice() + "| Categoria: " + getCategory());
    }
}
