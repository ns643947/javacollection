package array;

public class Bottle {
    private int length;
    private String name;
    private int width;
    private double capacity;

    void Bottle() {

    }

    void Bottle(int length, String name, int width, double capacity) {
        this.length = length;
        this.name = name;
        this.width = width;
        this.capacity = capacity;
    }

    void createBottle(int length, String name, int width, double capacity) {
        this.length = length;
        this.name = name;
        this.width = width;
        this.capacity = capacity;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bottle [length=" + length + ", name=" + name + ", width=" + width + ", capacity=" + capacity + "]";
    }
    

}
