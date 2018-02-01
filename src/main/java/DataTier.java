/*
 * SD2x Homework #8
 * This class represents the Data Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

import java.util.List;

public class DataTier {

	private String fileName; // the name of the file to read
	
	public DataTier(String inputSource) {
		fileName = inputSource;
	}

	/**
	 * getAllBooks: read the data file containing information about the books, create Book objects for each, and then
	 * return the Book objects.
	 *
	 * it is okay for getAllBooks to assume that the input file exists and is well-formatted.
	 * @return
	 */
	public List<Book> getAllBooks() {
		return null;
	}
}
