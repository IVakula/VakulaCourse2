package homework15.tast2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box<T extends Fruit> {
    private final List<T> fruits = new ArrayList<>();

    public List<T> getFruits() {
        return fruits;
    }

    public void addOne(T element) {
        fruits.add(element);
    }

    public void addAll(List<T> elements) {
        fruits.addAll(elements);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    public <S extends Fruit> boolean compare(Box<S> boxCompare) {
        return this.getWeight() == boxCompare.getWeight();
    }

    public boolean merge(Box<T> boxEmptying) {
        if (this != boxEmptying && !boxEmptying.fruits.isEmpty()) {
            this.fruits.addAll(boxEmptying.fruits);
            boxEmptying.fruits.clear();
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println(fruits.stream()
                .map(Fruit::toString)
                .collect(Collectors.joining(",","[","]")));
    }
}
