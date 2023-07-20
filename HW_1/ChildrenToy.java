package HW_1;

public class ChildrenToy {
    int id;
    String name;
    int quantity;
    double frequency;

    public ChildrenToy(int id, String name, int quantity, double frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", quantity=" + quantity + ", frequency=" + frequency + "]";
    }
}
