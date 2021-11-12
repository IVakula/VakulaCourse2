package homework12.coffe.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Петров");
        coffeeOrderBoard.add("Иванов");
        coffeeOrderBoard.add("Сидоров");
        coffeeOrderBoard.add("Васильев");
        coffeeOrderBoard.add("Димов");
        coffeeOrderBoard.add("Чернов");

        coffeeOrderBoard.draw();

        doDelivery(coffeeOrderBoard);
        coffeeOrderBoard.draw();

        coffeeOrderBoard.add("Савельев");
        coffeeOrderBoard.draw();

        doDelivery(coffeeOrderBoard, 5);
        coffeeOrderBoard.draw();

        coffeeOrderBoard.add("Иващук");
        coffeeOrderBoard.draw();

        doDelivery(coffeeOrderBoard, 1);
        doDelivery(coffeeOrderBoard, 4);
        coffeeOrderBoard.draw();
    }

    public static void doDelivery(CoffeeOrderBoard coffeeOrderBoard) {
        Order deliveryOrder = coffeeOrderBoard.deliver();
        System.out.println("Выполнен заказ №" + deliveryOrder.getNumber() + " (" + deliveryOrder.getName() + ")");
    }

    public static void doDelivery(CoffeeOrderBoard coffeeOrderBoard, int number) {
        Order deliveryOrder = coffeeOrderBoard.deliver(number);
        if (deliveryOrder != null) {
            System.out.println("Выполнен заказ №" + deliveryOrder.getNumber() + " (" + deliveryOrder.getName() + ")");
        } else {
            System.out.println("Заказ № " + number + " отсутсвует в очереде заказов.");
        }

    }
}
