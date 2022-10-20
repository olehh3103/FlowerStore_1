package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class StoreTest {
    private Store store;
//    static final int MAX_SCORE = 100;
//    static final int MAX_SCORE_TWO = 123;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testSearch() {
        Flower flowF = new Flower();
        FlowerColor colorF = FlowerColor.RED;
        flowF.setColor(colorF);

        flowF.setPrice(126);
        flowF.setSepalLength(2324);

        Flower flowS = new Flower();
        FlowerColor colorS = FlowerColor.BLUE;
        flowS.setColor(colorS);
        flowS.setPrice(126);
        flowS.setSepalLength(2324);

        store.addFlow(flowF);
        Assertions.assertEquals(null, store.search(flowS));
        Assertions.assertEquals(flowF, store.search(flowF));

    }
}
