package homework15.tast2;

public abstract class Fruit {
   protected float weight;

  public float getWeight() {
    return weight;
  }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}

