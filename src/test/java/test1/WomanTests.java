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


    @Test(groups= "testGetWoman")
    public void testLastN(){
        Woman woman = new Woman("Anna", "M", 45, null);
        Assert.assertEquals(woman.getLastName(), "M");
    }

    @Test(groups = "testGetWoman")
    public void testFirstN(){
        Woman woman = new Woman("Anna", "M", 45, null);
        Assert.assertEquals(woman.getFirstName(), "Anna");
    }

    @Test(groups = "testGetWoman")
    public void testAge(){
        Woman woman = new Woman("Anna", "M", 45, null);
        Assert.assertEquals(woman.getAge(), 45);

    }


}
