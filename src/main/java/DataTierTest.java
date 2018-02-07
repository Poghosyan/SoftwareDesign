import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class DataTierTest {

    DataTier dataTier;
    @Before
    public void setUp() throws Exception {
        dataTier = new DataTier("books.txt");
    }

    @Test
    public void getAllBooksTest() {
        List<Book> result = dataTier.getAllBooks();
        assertFalse(result == null);
    }
}