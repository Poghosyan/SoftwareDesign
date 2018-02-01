/*
 * SD2x Homework #8
 * This class represents the Logic Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

public class LogicTier {

	private DataTier dataTier;
	
	public LogicTier(DataTier dataTier) {
		this.dataTier = dataTier;
	}

    /**
     * for a given name, search through all of the books and return the titles of those books whose
     * author name includes the input name.
     * @param bookName
     * @return
     */
	public String[] findBookByAuthor(String bookName) {
		return null;
	}

    /**
     * for a given name, search through all of the books and return the titles of those books whose
     * author name includes the input name.
     * @param year
     * @return
     */
	public int findNumberOfBooksInYear(int year) {
		return 0;
	}
}
