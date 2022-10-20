package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class StoreTest {
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testSearch() {
        Flower flowF = new Flower();
        FlowerColor colorF = FlowerColor.RED;
        flowF.setColor(colorF);

        Flower flowS = new Flower();
        FlowerColor colorS = FlowerColor.BLUE;
        flowS.setColor(colorS);

        store.addFlow(flowF);
        Assertions.assertNull(store.search(flowS));
        Assertions.assertEquals(flowF, store.search(flowF));

    }
}
