package homework20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestRunner {
    public static void start(Class<?> clazz) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, NonUniqueMethodException {
        Method[] declaredMethods = clazz.getDeclaredMethods();
        var instance = clazz.getDeclaredConstructor().newInstance();

        boolean beforeExist = false;
        boolean afterExist = false;
        for (Method m : declaredMethods) {
            if (m.getAnnotation(BeforeSuite.class) != null) {
                if (beforeExist) {
                    throw new NonUniqueMethodException(m.getName());
                }
                beforeExist = true;
            }
            if (m.getAnnotation(AfterSuite.class) != null) {
                if (afterExist) {
                    throw new NonUniqueMethodException(m.getName());
                }
                afterExist = true;
            }
        }

        for (Method m : declaredMethods) {
            if (m.getAnnotation(BeforeSuite.class) != null) {
                print(m);
                m.invoke(instance);
            }
        }

        List<Method> methodArray = new ArrayList<>();
        for (Method m : declaredMethods) {
            if (m.getAnnotation(Test.class) != null) {
                methodArray.add(m);
            }
        }
        methodArray.sort(Comparator.comparingInt(o -> o.getAnnotation(Test.class).priority()));
        for (Method m : methodArray) {
            printPriority(m);
            m.invoke(instance);
        }

        for (Method m : declaredMethods) {
            if (m.getAnnotation(AfterSuite.class) != null) {
                print(m);
                m.invoke(instance);
            }
        }
    }

    static void print(Method m) {
        System.out.println("**********************");
        System.out.println("Invoke method " + m.getName());
        System.out.println("Method output:");
    }

    static void printPriority(Method m) {
        System.out.println("**********************");
        System.out.println("Invoke method " + m.getName() + " priority " + m.getAnnotation(Test.class).priority());
    }
}
