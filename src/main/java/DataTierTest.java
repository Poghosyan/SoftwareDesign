import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataTierTest {

    DataTier dataTier;
    @Before
    public void setUp() throws Exception {
        dataTier = new DataTier("books.txt");
    }

    @Test
    public void getAllBooks() {
        dataTier.getAllBooks();
    }
}