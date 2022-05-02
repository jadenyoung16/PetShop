import java.util.Objects;

public class Bunnies extends PetShop {
    private final String color;

    public Bunnies(String name, int age, String color){
        super (name, age, color);
        this.color = color;
    }

    public Bunnies(String[] tokens) {
        super(3);
        color = null;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bunnies)) return false;
        Bunnies bunnies = (Bunnies) o;
        return Objects.equals(color, bunnies.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return super.toString() + "Bunnies {" + "color ='" + color + '\'' + '}';
    }
}
