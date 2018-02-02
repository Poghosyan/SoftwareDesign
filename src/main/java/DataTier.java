/*
 * SD2x Homework #8
 * This class represents the Data Tier in the three-tier architecture.
 * Implement the appropriate methods for this tier below.
 */

import java.io.*;
import java.util.List;

public class DataTier {

	private String fileName;

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
		FileReader reader = null;
		BufferedReader bufferedReader = null;
		String line;
		try {
			reader = new FileReader(fileName);
			bufferedReader = new BufferedReader(reader);

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
