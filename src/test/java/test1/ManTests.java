package test1;

import com.rd.mv.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManTests {

    private Man man;

    @BeforeMethod
    public void createMan(){
        man = new Man("Marko", "K", 66, null);
    }

    @Test
    public void testIsRetired(){
        Assert.assertTrue(man.isRetired(), "Person is retired");

    }

    @Test(groups= "testGetMan")
    public void testLastN(){
        Man man = new Man("Marko", "K", 66, null);
        Assert.assertEquals(man.getLastName(), "K");
    }

    @Test(groups = "testGetMan")
    public void testFirstN(){
         Man man = new Man("Marko", "K", 66, null);
        Assert.assertEquals(man.getFirstName(), "Marko");
    }


    @Test(groups = "testGetMan")
    public void testAge(){
        Man man = new Man("Marko", "K", 66, null);
        Assert.assertEquals(man.getAge(), 66);

    }


}
