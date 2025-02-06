package models;

import java.util.Objects;

public class Client {
    private String name;
    private String phone;

    public Client(String name, String phone){
        setName(name);
        setPhone(phone);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Client client)) return false;
        return Objects.equals(name, client.name) && Objects.equals(phone, client.phone);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + name + '\'' +
                ", telefone='" + phone + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println("Cliente: " + getName() + " | Telefone: " + getPhone());
    }
}
