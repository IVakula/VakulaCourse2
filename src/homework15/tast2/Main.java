package homework15.tast2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Apple> appleBox3 = new Box<>();

        Box<Orange> orangeBox1 = new Box<>();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();


        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        System.out.println("***** Add one *****");
        appleBox1.addOne(apple4);
        appleBox1.print();
        appleBox2.addOne(apple5);
        appleBox2.print();
        orangeBox1.addOne(orange1);
        orangeBox1.addOne(orange2);
        orangeBox1.print();
        System.out.println();

        System.out.println("***** Add all *****");
        appleBox1.addAll(apples);
        appleBox1.print();
        System.out.println();

        System.out.println("***** Get weight *****");
        orangeBox1.print();
        System.out.println(orangeBox1.getWeight());
        appleBox1.print();
        System.out.println(appleBox1.getWeight());
        appleBox3.print();
        System.out.println(appleBox3.getWeight());
        System.out.println();

        System.out.println("***** Compare *****");
        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(orangeBox1.compare(appleBox2));
        System.out.println();

        System.out.println("***** Merge *****");
        appleBox1.print();
        appleBox2.print();
        System.out.println(appleBox1.merge(appleBox2));
        appleBox1.print();
        appleBox2.print();
        System.out.println(appleBox1.merge(appleBox1));
        System.out.println(appleBox2.merge(appleBox1));
        appleBox1.print();
        appleBox2.print();
    }
}
