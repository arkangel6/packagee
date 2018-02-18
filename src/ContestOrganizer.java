

public class ContestOrganizer {
	/** the number of rows of contestant */
	public static final int NUM_ROWS = 10;

	/** the number of columns of contestant */
	public static final int CONTESTANTS_PER_ROW = 10;

	/** the two-dimensional array of contestant */
	private Contestant[][] contestants;

	/**
	 * Sorts arr in increasing order by score Postcondition: - arr sorted in
	 * increasing order by score. - Location of each contestant correctly updated
	 * such that column number matches contestant's position in arr.
	 * 
	 * @param arr
	 *            the array to be sorted.
	 */
	public void sort(Contestant[] arr) {

		Contestant[] newArray = new Contestant[arr.length];
		
		boolean swap = true;
		boolean swap2 = false;
		while(swap) {
			System.out.println(arr.length);
		
		for (int i = 0; i < arr.length - 1; i++) {
		
			if (arr[4].getScore() > arr[5].getScore()) {
				newArray[i] = arr[i + 1];
				newArray[i + 1] = arr[i];
				if(swap2) {
				swap = false;
				}
				else {
				swap2 = true;
				}
			}
			else {
				newArray[i] = arr[i];
			}
		}
		arr = newArray;
		
		}
			
		
	}

	/**
	 * Sorts each row of contestants into increasing order by score. Postcondition:
	 * Contestant with highest score in row[k] is in the rightmost column of row[k],
	 * 0 <= k < NUM_ROWS
	 */
	public void sortAllRows() {
		
		
		

	}

	/**
	 * Returns name of contestant with highest score Precondition: - Contestants
	 * have not been sorted by score. - Top score is unique - Only one contestant
	 * has the highest score.
	 * 
	 * @return name of contestant with highest score.
	 */
	public String findWinnerName() {
		/* code goes here */

		return "";
	}
}
