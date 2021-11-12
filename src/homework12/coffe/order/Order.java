package homework12.coffe.order;

public class Order {
    private final Integer number;
    private final String name;

    public Order(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
