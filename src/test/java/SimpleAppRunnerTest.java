import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SimpleAppRunnerTest {

    @Test
    public void testAppRunnerNegative(){
        Integer i = new Integer(0);
        AppRunner appRunner = new AppRunner();
        Integer test = appRunner.doSmth(-1);
        assertEquals(i, test);
    }
}
