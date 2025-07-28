import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class DemoTest {

    @Test
    @DisplayName("Simple Test")
    public void sometest()
    {
       //expected vs actual
        String x = "Hello!!";
        assertEquals("Hello!!",x);

    }

    @Test
    @DisplayName("Array Test")
    public void testArray(){
       int[] xnos = {10,20,30,40};
       int[] ynos = {10,20,30,40};
       assertArrayEquals(xnos,ynos);

    }
    @Test
    public void testCollections(){
        List<String> citiesx = Arrays.asList("Pune","Mumbai");
        List<String> citiesy = Arrays.asList("Pune","Mumbai");
        assertIterableEquals(citiesx,citiesy);
    }

    @Test
    public  void testSame(){
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3=s2;
        assertSame(s2,s3);
    }

    @Test
    public void testTimeout()
    {
        assertTimeout(Duration.ofMillis(2000),()->{
            Thread.sleep(3000);
            System.out.println("Hello....");

        });

    }

}
