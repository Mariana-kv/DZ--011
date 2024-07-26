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

    @Test(groups= "testGetSetMan")
    public void testLastN(){
        Man man = new Man("Marko", "K", 66, null);
        Assert.assertEquals(man.getLastName(), "K");
    }

    @Test(groups = "testGetSetMan")
    public void testFirstN(){
         Man man = new Man("Marko", "K", 66, null);
        Assert.assertEquals(man.getFirstName(), "Marko");
    }


    @Test(groups = "testGetSetMan")
    public void testAge(){
        Man man = new Man("Marko", "K", 66, null);
        Assert.assertEquals(man.getAge(), 66);

    }

    @Test(groups = "testGetSetMan")
    public void testSetFirstName(){
        Man man = new Man("Marko", "K", 66, null);
        man.setFirstName("Marko");
        Assert.assertEquals(man.getFirstName(), "maRko");

    }

    @Test(groups = "testGetSetMan")
    public void testSetLastName(){
        Man man = new Man("Marko", "K", 66, null);
        man.setLastName("M");
        Assert.assertEquals(man.getLastName(), "T");

    }



}
