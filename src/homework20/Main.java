package homework20;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {
        try {
            TestRunner.start(MyTestClass.class);
        } catch (NonUniqueMethodException e) {
            e.printStackTrace();
        }

        try {
            TestRunner.start(MyTestClassDoBefore.class);
        } catch (NonUniqueMethodException e) {
            e.printStackTrace();
        }

        try {
            TestRunner.start(MyTestClassDoAfter.class);
        } catch (NonUniqueMethodException e) {
            e.printStackTrace();
        }
    }
}
