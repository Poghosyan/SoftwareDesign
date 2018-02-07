/*
 * SD2x Homework #8
 * This class represents the Logic Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

import java.util.ArrayList;
import java.util.List;

public class LogicTier {

	private DataTier dataTier;
	
	public LogicTier(DataTier dataTier) {
		this.dataTier = dataTier;
	}

    /**
     * for a given name, search through all of the books and return the titles of those books whose
     * author name includes the input name.
     * @param authorName
     * @return
     */
	public String[] findBookTitlesByAuthor(String authorName) {
	    if (authorName == null || authorName.isEmpty()) {
	        return null;
        }

		List<Book> booksByAuthor = new ArrayList<Book>();
	    List<Book> books = dataTier.getAllBooks();

	    for (Book curr : books) {
	        if (curr.author.contains(authorName)) {
	            booksByAuthor.add(curr);
            }
        }

        String[] result = new String[booksByAuthor.size()];

        for (int i = 0; i < result.length; ++i) {
	        result[i] = booksByAuthor.get(i).getTitle();
        }

		return result;
	}

    /**
     * for a given year, search through all of the books and return the number of books published in that year
     * @param year
     * @return
     */
	public int findNumberOfBooksInYear(int year) {
        List<Book> books = dataTier.getAllBooks();
        int count = 0;
        for (Book curr : books) {
            if (curr.getPublicationYear() == year) {
                count++;
            }
        }

		return count;
	}
}
