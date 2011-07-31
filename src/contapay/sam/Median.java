package contapay.sam;

import java.util.Arrays;

public class Median {

	/**
	 * Sort the array by using bubble sort. Compare 2 elements in the array and swap it out.
	 * 
	 * @param unsorted Array to sort
	 * @return The sorted array int[]
	 */
	private int[] bubbleSort( int[] unsorted )
	{
		boolean swapped = true;
		
		while ( swapped )
		{
			swapped = false;
			for ( int x = 0; x < unsorted.length; ++x )
			{
				// Iterate and swap
				int storage = 0;
				if ( x != unsorted.length - 1 )
				{
					if ( unsorted[x] > unsorted[x+1] )
					{
						// We need to swap
						storage = unsorted[x];
						unsorted[x] = unsorted[x+1];
						unsorted[x+1] = storage;
						swapped = true;
					}
				} // end of out of bounds check
			} // end of for loop
		} // end of while loop
		
		return unsorted;
	}
	
	/**
	 * Get the median of a sorted array
	 * 
	 * @param sortedArray A sorted array
	 * @return The median of a sorted array
	 */
	private double getMedian( int[] sortedArray )
	{
		double result = 0;
		double element = Math.ceil( sortedArray.length/2 );
		
		if ( sortedArray.length % 2 == 0 ) // This is an even number
		{
			result = ( (double)sortedArray[(int)element]+(double)sortedArray[(int)element-1] )/2;
		}
		else // The array is odd
			result = sortedArray[(int)element];
	
		return result;
	}
	
	public static void main(String[] args) {
		Median median = new Median();
		int[] array1 = new int[] { 4,1,5,3,2};
		System.out.println("Unsorted array: " + Arrays.toString( array1 ));
		int[] sortedArray1 = median.bubbleSort( array1 );
		System.out.println("Bubble sort: " + Arrays.toString( sortedArray1 ) );
		System.out.println("The median of the array is: " + median.getMedian( sortedArray1 ) );
		// Now let's do this with an array with an even set of elements
		array1 = new int[] { 6,3,7,4,2,5};
		System.out.println("Unsorted array: " + Arrays.toString( array1 ));
		sortedArray1 = median.bubbleSort( array1 );
		System.out.println("Bubble sort: " + Arrays.toString( sortedArray1 ) );
		System.out.println("The median of the array is: " + median.getMedian( sortedArray1 ) );
	}
}
