import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ItestAppRunnerTest {

    @Test
    public void testAppRunner(){
        Integer i = new Integer(4);
        AppRunner appRunner = new AppRunner();
        Integer test = appRunner.doSmth(3);
        assertEquals(i, test);
    }
}
