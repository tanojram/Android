package Tanoj;

public class corejavaexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mynum =5;
		String website="Tanoj";
	     int i= 0;
		char r= 'r';
		double dec = 5.34;
		boolean t = true;
		System.out.println(mynum + " is the value stored" );
		System.out.println(t);
	
		
		//Array
	
		
		int[] arr = new int[5]; // new is for assign memeory to array
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		
		int[] arr_2 = {1,2,3,4,5,5,8,9,87,88,90};//  2nd way to declare array 
		
		System.out.println(arr_2[2]);
		
		//for loop
		
		 for (i =0; i< arr_2.length; i++)
		 {
			 System.out.println(arr_2[i]);
			 
		 }
		
		String[] name = {"Tanoj", "Rama","Krishna","Kumar"};
		
		 for (i =0; i< name.length; i++)
		 {
			 System.out.println(name[i]);
			 
		 }
		 
		 //enhanced  for loop
		 
		 for(String  s:name)
		 {
			 System.out.println(s);
		 }
		 
	}

}