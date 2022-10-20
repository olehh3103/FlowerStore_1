package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;


public class StoreTest {
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testSearch() {
        Flower flow1 = new Flower();
        FlowerColor color1 = FlowerColor.RED;
        flow1.setColor(color1);
        flow1.setPrice(123);
        flow1.setSepalLength(111);

        Flower flow2 = new Flower();
        FlowerColor color2 = FlowerColor.BLUE;
        flow1.setColor(color2);
        flow1.setPrice(123);
        flow1.setSepalLength(111);

        store.addFlow(flow1);
        Assertions.assertEquals(null, store.search(flow2));
        Assertions.assertEquals(flow1, store.search(flow1));

    }
}
