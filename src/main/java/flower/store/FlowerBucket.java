package flower.store;


import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> allFlow;
    private double price;

    public FlowerBucket() {
        allFlow = new ArrayList<FlowerPack>();
    }

    public void add(FlowerPack flow) {
        allFlow.add(flow);
        this.price += flow.getPrice();
    }

    public double getPrice() {
        return this.price;
    }
}
