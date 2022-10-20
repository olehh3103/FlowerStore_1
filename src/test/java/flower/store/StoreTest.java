package flower.store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;


public class StoreTest {
    private Store store;
    static final int MAX_SCORE = 100;
    static final int MAX_SCORE_TWO = 123;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testSearch() {
        Flower flowF = new Flower();
        FlowerColor color1 = FlowerColor.RED;
        flowF.setColor(color1);

        flowF.setPrice(MAX_SCORE);
        flowF.setSepalLength(MAX_SCORE_TWO);

        Flower flowS = new Flower();
        FlowerColor color2 = FlowerColor.BLUE;
        flowS.setColor(color2);
        flowS.setPrice(MAX_SCORE);
        flowS.setSepalLength(MAX_SCORE_TWO);

        store.addFlow(flowF);
        Assertions.assertEquals(null, store.search(flowS));
        Assertions.assertEquals(flowF, store.search(flowF));

    }
}
