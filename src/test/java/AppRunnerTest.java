import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AppRunnerTest {

    @Test
    public void testAppRunner(){
        String s1 = "maven task 1 started";
        String s2 = AppRunner.test;
        assertEquals(s1, s2);
    }
}
