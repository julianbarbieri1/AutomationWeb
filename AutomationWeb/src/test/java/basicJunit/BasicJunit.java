package basicJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BasicJunit {

    @BeforeEach
    public void setUp(){
        System.out.println("setup");
    }

    @AfterEach
    public void cleanUp(){
        System.out.println("cleanup");
    }
    @Test
    public void verifySomething(){
        System.out.println("Test 1");
    }
    @Test
    @Disabled
    public void verifySomething2(){
        System.out.println("Test 2");
    }
}
