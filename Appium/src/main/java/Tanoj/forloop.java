package Tanoj;

import java.util.ArrayList;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[]  arr2 = {1,2,3,4,5,6,8,8,9,10,120};
		int i =0;
		int k =0;
		
			
		for ( i=0; i< arr2.length;  i++)
		{
			if (arr2[i]%2 ==0)
			{
				System.out.println(arr2[i]);
			
			}
			
			else
			{
				k=k+1;
			}
		}
		System.out.println("There are around " + k + " which are not mulitple of 2");
		
		
		ArrayList <String> a = new ArrayList<String>();
		
		//Create object of class - object.method
		
		a.add("Tanoj");
		a.add("Rama");
		a.add("Krishna");          
	}

}
