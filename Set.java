import java.util.*;

public class Set {

/*
 * Method that will return true if all the elements
 * contained in set1 are also contained in set2
 * will return false otherwise
 */
public static boolean isSameSet(int set1[], int set2[]) {
	    
	//Store first element of set1
	int s1 = set1[0];
	//Store first element of set2
	int s2 = set2[0];
	  
	/*
	 * Find the max element of set1 and set2
	 * and store it into s1 and s2 respectively
	 */
	for(int i = 1;i < set1.length;i++) {
		if(set1[i] > s1) 
			s1 = set1[i];
		if(set2[i] > s2) 
			s2 = set2[i];     
	}

	/* 
	 * If maximum value of set1 is not the same as set2 return false
	 * Because the sets have to contain same numbers this is an easy way 
	 * to find out if the sets don't match
	 */
	if(s1 != s2)
		return false;
	    
	//New array of size s1 + 1
	boolean arr[] = new boolean [s1 + 1];
	    
	//Put false in every element of the array
	for(int i = 0;i <= s1;i++)
		arr[i] = false;
	    
	//True for elements of the array which are equal to elements of set1
	for(int i = 0;i < set1.length;i++) {
		arr[set1[i]] = true;
	}

	//False for elements of the array which are equal to elements of set2
	for(int i = 0;i < set2.length;i++) {
		arr[set2[i]] = false;
	}
	    
	//If any element of the array are true return false
	for(int i = 0;i <= s1;i++) {
		if(arr[i]) 
			return false;
	}

	//True for elements of the array which are equal to elements of set2
	for(int i = 0;i < set2.length;i++) {
		arr[set2[i]] = true;
	}

	//False for elements of the array which are equal to elements of set1
	for(int i = 0;i < set1.length;i++) {
		arr[set1[i]] = false;
	}
	
	//If any elements of the array are true return false
	for(int i = 0;i <= s1;i++) {
		if(arr[i]) 
			return false;
	}
	    
	return true;

}
	   
public static void main(String args[]) {
	
//Adding numbers into sets
int set1[] = {1,1,3,3,2,2,4};
int set2[] = {1,2,1,3,4,2,3};

//Printing the arrays
System.out.println("Set1: " + Arrays.toString(set1));
System.out.println("Set2: " + Arrays.toString(set2));

/*
 * Using the boolean method to check
 * if the sets are the same
 */
if(isSameSet(set1, set2))
	System.out.println("Set1 and Set2 contain the same elements.");
else   
	System.out.println("Set1 and Set2 do not contain the same elements.");
	      		      	

	}
}