public class Laptop {
    private int Ram;
    private String model;
    private int cost;

    public Laptop(int ram, String model, int cost) {
        Ram = ram;
        this.model = model;
        this.cost = cost;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Ram=" + Ram +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }



}
