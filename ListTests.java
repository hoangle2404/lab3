import static org.junit.Assert.*;
import org.junit.*;

public class ListTest()
@Test
{
    public void testList()
    {
        List<String> ls = new List<String>();
        ls.add("abcd");
        ls.add("ideg");
        ls.add("scsdfwf");
        assertEquals(new ArrayList<>("abcd","ideg"),ListExamples.filter(ls));
    }

}