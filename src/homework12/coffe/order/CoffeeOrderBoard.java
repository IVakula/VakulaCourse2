package homework12.coffe.order;

import java.util.LinkedList;

public class CoffeeOrderBoard {
    private final LinkedList<Order> orders;
    private int currentOrderNumber = 0;

    public CoffeeOrderBoard() {
        this.orders = new LinkedList<>();
    }

    public void add(String name) {
        orders.add(new Order(++currentOrderNumber, name));
    }

    public Order deliver() {
        return orders.pollFirst();
    }

    public Order deliver(int number) {
        for (Order orderCurrency : orders) {
            if (orderCurrency.getNumber() == number) {
                orders.remove(orderCurrency);
                return orderCurrency;
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("===============");
        System.out.printf("%-6S | %-10S%n", "Number", "Name");
        System.out.println("---------------");

        for (Order order : orders) {
            System.out.printf("%-6d | %-10s", order.getNumber(), order.getName());
            System.out.println();
        }
        System.out.println("===============");
    }
}

