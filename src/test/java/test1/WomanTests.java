package test1;


import com.rd.mv.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTests {
    @Test
    public void testIsRetired(){
        Woman woman = new Woman("Anna", "M", 45, null);
        Assert.assertFalse(woman.isRetired(), "Person is not retired");

    }


    @Test(groups= "testGetSetWoman1")
    public void testLastN(){
        Woman woman = new Woman("Anna", "M", 45, null);
        Assert.assertEquals(woman.getLastName(), "M");
    }

    @Test(groups = "testGetSetWoman1")
    public void testFirstN(){
        Woman woman = new Woman("Anna", "M", 45, null);
        Assert.assertEquals(woman.getFirstName(), "Anna");
    }

    @Test(groups = "testGetSetWoman1")
    public void testAge(){
        Woman woman = new Woman("Anna", "M", 45, null);
        Assert.assertEquals(woman.getAge(), 45);

    }

    @Test(groups = "testGetSetWoman1")
    public void testSetFirstName(){
        Woman woman = new Woman("Anna", "M", 45, null);
        woman.setFirstName("Anna");
        Assert.assertEquals(woman.getFirstName(), "anna");

    }

    @Test(groups = "testGetSetWoman1")
    public void testSetLastName(){
        Woman woman = new Woman("Anna", "M", 45, null);
        woman.setLastName("M");
        Assert.assertEquals(woman.getLastName(), "M");

    }



}
