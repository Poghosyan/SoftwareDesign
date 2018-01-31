/*
 * SD2x Homework #8
 * This class represents the Logic Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

public class LogicTier {

	/*
	findBookTitlesByAuthor: for a given name, search through all of the books and return the titles of those books whose
	author name includes the input name.

	findNumberOfBooksInYear: for a given year, search through all of the books and return the number of books published
	in that year
	 */

	private DataTier dataTier; // link to the Data Tier
	
	public LogicTier(DataTier dataTier) {
		this.dataTier = dataTier;
	}
	

}
