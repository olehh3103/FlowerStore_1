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
        int MAX_RANDOM_NUMBER = 100;
        int MAX_RANDOM_NUMBER_SECOND = 2324;
        flowF.setPrice(MAX_RANDOM_NUMBER);
        flowF.setSepalLength(MAX_RANDOM_NUMBER_SECOND);

        Flower flowS = new Flower();
        FlowerColor colorS = FlowerColor.BLUE;
        flowS.setColor(colorS);
        flowS.setPrice(MAX_RANDOM_NUMBER);
        flowS.setSepalLength(MAX_RANDOM_NUMBER_SECOND);

        store.addFlow(flowF);
        Assertions.assertNull(store.search(flowS));
        Assertions.assertEquals(flowF, store.search(flowF));

    }
}
