package homework11.taskA1.task5;

public class Enrty {
    private final String name;
    private final int occurrence;

    public Enrty(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public String getName() {
        return name;
    }

    public int getOccurrence() {
        return occurrence;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                "}";
    }
}

