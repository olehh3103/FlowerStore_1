package flower.store;


import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> all_flow;
    private double price;

    public FlowerBucket(){
        all_flow = new ArrayList<FlowerPack>();
    }

    public void add(FlowerPack flow){
        all_flow.add(flow);
        this.price += flow.getPrice();
    }

    public double getPrice(){
        return this.price;
    }
}
