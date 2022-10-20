package flower.store;

import java.util.LinkedList;

public class Store {
    private LinkedList<Flower> allFlow;

    public Store() {
        this.allFlow = new LinkedList<Flower>();
    }

    public void addFlow(Flower flow) {
        this.allFlow.add(flow);
    }

    public Flower search(Flower flow) {
        for (Flower flowToCheck : this.allFlow) {
            if (flowToCheck.getFlowerType() == flow.getFlowerType()) {
                if (flowToCheck.getPrice() == flow.getPrice()) {
                    if (flowToCheck.getSepalLength() == flow.getSepalLength()) {
                        String colorToCheck = flowToCheck.getColor();
                        if ((colorToCheck != null) && (!colorToCheck.equals(""))
                                && (!colorToCheck.equals(flow.getColor()))) {
                            continue;
                        } else { return flow; }
                    } else { continue; }
                } else { continue; }
            } else { continue; }
        }
        return null;
        }
    }

