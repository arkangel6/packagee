

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
		Contestant holder;
		
		boolean swap = true;
		//boolean swap2 = false;
//		while(swap) {
//			//System.out.println(arr.length);
//		swap = false;
//		for (int i = 0; i < arr.length - 1; i++) {
//		
//			if (arr[i].getScore() > arr[i+1].getScore()) {
//				newArray[i] = arr[i + 1];
//				newArray[i + 1] = arr[i];
//				
//				swap = true;
//			}
//			else {
//				newArray[i] = arr[i];
//			}
//			
//		}
//		//newArray[5] = arr[5];
//		//arr = newArray;
//		
//		}
//		for(Contestant x : newArray) {
//			System.out.println(x.getScore());
//		}
		
		while(swap) {
			swap = false;
			for(int j = 0; j< arr.length - 1; j++) {
				
				if(arr[j].getScore()>arr[j+1].getScore()) {
					holder = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = holder;
					swap = true;
				}
				
				
				
			}
		}
		
		
		
	}

	/**
	 * Sorts each row of contestants into increasing order by score. Postcondition:
	 * Contestant with highest score in row[k] is in the rightmost column of row[k],
	 * 0 <= k < NUM_ROWS
	 */
	public void sortAllRows(Contestant[][] contestants) {
		
		for(Contestant[] x: contestants) {
			
			sort(x);
			
		}
		

	}

	/**
	 * Returns name of contestant with highest score Precondition: - Contestants
	 * have not been sorted by score. - Top score is unique - Only one contestant
	 * has the highest score.
	 * 
	 * @return name of contestant with highest score.
	 */
	int winner = 0;
	public String findWinnerName(Contestant[][] contestants) {
		
		sortAllRows(contestants);
		
		for(int i = 0; i < contestants.length-1; i++) {
			
		if(contestants[i][contestants[i].length-1].getScore() > contestants[i+1][contestants[i].length-1].getScore()) {
			winner = contestants[i][contestants[i].length-1].getScore();
			
		}
		else {
			winner = contestants[i+1][contestants[i].length-1].getScore();
		}
		}
		
		String win = Integer.toString(winner);

		return win;
	}
}
