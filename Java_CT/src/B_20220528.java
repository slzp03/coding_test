import java.util.ArrayList;
import java.util.Scanner;

public class B_20220528 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	   
	    String line1 = sc.nextLine();
	    String line2 = sc.nextLine();
	    
	    int n = Integer.parseInt(line1);
	    String arr[] = line2.split(" ");
	    
	    int max = Integer.parseInt(arr[0]);
	    int min = Integer.parseInt(arr[0]);
	    
	    int temp = 0;
	    int result[] = new int[n];
	    for(int i=0; i<n; i++) {
	    	result[i] = Integer.parseInt(arr[i]);
	    	
	    	if(result[i] < min) {
	    		min = result[i];
	    	}
	    	if(result[i] > max) {
	    		max = result[i];
	    	}
	    }
	    
	    m_pivot_sort(result, 0, n - 1);
	    
	    System.out.println(min + " " +max);
    	for(int x:result)
    	System.out.printf("%d",x);
	  }

	private static void m_pivot_sort(int[] a, int lo, int hi) {
		
		if(lo >= hi) {
			return;
		}
		
		int pivot = partition(a, lo, hi);	
		
		m_pivot_sort(a, lo, pivot);
		m_pivot_sort(a, pivot + 1, hi);
	}
	
	private static int partition(int[] a, int left, int right) {
		
		int lo = left - 1;
		int hi = right + 1;
		int pivot = a[(left + right) / 2];		
		
 
		while(true) {
			
			do { 
				lo++; 
			} while(a[lo] < pivot);
 
			
			do {
				hi--;
			} while(a[hi] > pivot && lo <= hi);
			
			
			if(lo >= hi) {
				return hi;
			}
			
			swap(a, lo, hi);
		}
		
	}
	
	
	
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
