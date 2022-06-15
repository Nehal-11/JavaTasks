package task26arrays;

public class SampleExe {

}
/*
public class Datastorage {
	private int lengthOfTheArray;
	private int unsortedArray[],arraySortedInAscendingOrder[],arraySortedInDescendingOrder[];
	public int getLengthOfTheArray() {
		return lengthOfTheArray;
	}
	public void setLengthOfTheArray(int lengthOfTheArray) {
		this.lengthOfTheArray = lengthOfTheArray;
	}
	public int[] getUnsortedArray() {
		return unsortedArray;
	}
	public void setUnsortedArray(int[] unsortedArray) {
		this.unsortedArray = unsortedArray;
	}
	public int[] getArraySortedInAscendingOrder() {
		return arraySortedInAscendingOrder;
	}
	public void setArraySortedInAscendingOrder(int[] arraySortedInAscendingOrder) {
		this.arraySortedInAscendingOrder = arraySortedInAscendingOrder;
	}
	public int[] getArraySortedInDescendingOrder() {
		return arraySortedInDescendingOrder;
	}
	public void setArraySortedInDescendingOrder(int[] arraySortedInDescendingOrder) {
		this.arraySortedInDescendingOrder = arraySortedInDescendingOrder;
	}
	
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Arraysorter {
	int[] temp;
	Datastorage object = new Datastorage();
	Scanner scan = new Scanner(System.in);
	void getTheArrayElements() {
		
		
		System.out.println("Enter the length of the array");
		try
		{
			object.setLengthOfTheArray(scan.nextInt());
			
		} catch (InputMismatchException ex) {   System.err.println("Enter the integer Input");System.exit(0);}
			
			
			System.out.println("Ener the elements of unsorted Array");
			
			int[] temp =  new int[object.getLengthOfTheArray()] ;
			try {
			for(int index = 0;index<temp.length;index++) {
				
				temp[index] = scan.nextInt();
				
			}
			
		} catch (InputMismatchException ex) {   System.err.println("Enter the integer Input");
		System.exit(0);}
		object.setUnsortedArray(temp);
		scan.close();		
	}
	
	void sortTheArrayInAscendingOrder() {
		
		temp=object.getUnsortedArray();
		 for (int i = 0; i < temp.length; i++) {  
			 
			 int tempStore;
	            for (int j = i+1; j < temp.length; j++) {     
	               if(temp[i] > temp[j]) {    
	            	   tempStore = temp[i];    
	            	   temp[i] = temp[j];    
	            	   temp[j] = tempStore;    
	               } 
	             
	            }
	            }
	      object.setArraySortedInAscendingOrder(temp);    
}
	
	void displayTheArraySortedInAscendingOrder() {
		
		System.out.print("Sorted array AscendingOrder  : ");
		temp=object.getArraySortedInAscendingOrder();
		for (int index = 0 ;index<temp.length;index++ ) {
			
			System.out.print(temp[index] + " ");
		}
		
	}
	
	
	void sortTheArrayInDescendingOrder() {
		
		temp=object.getUnsortedArray();
		 for (int i = 0; i < temp.length; i++) {  
			 
			 int tempStore;
	            for (int j = i+1; j < temp.length; j++) {     
	               if(temp[i] < temp[j]) {    
	            	   tempStore = temp[i];    
	            	   temp[i] = temp[j];    
	            	   temp[j] = tempStore;    
	               } 
	             
	            }
	            }
	      object.setArraySortedInDescendingOrder(temp);    
}
	
	void displayTheArraySortedInDescendingOrder() {
		System.out.println();
		System.out.print("Sorted array DescendingOrder  : ");
		temp=object.getArraySortedInDescendingOrder();
		for (int index = 0 ;index<temp.length;index++ ) {
			
			System.out.print(temp[index] + " ");
		}
		
	}
	}
public class Runner {
	public static void main(String[] args) {
		Arraysorter oArraysorter = new Arraysorter();
		oArraysorter.getTheArrayElements();
		oArraysorter.sortTheArrayInAscendingOrder();
		oArraysorter.displayTheArraySortedInAscendingOrder();
		oArraysorter.sortTheArrayInDescendingOrder();
		oArraysorter.displayTheArraySortedInDescendingOrder();
	}

}

 */