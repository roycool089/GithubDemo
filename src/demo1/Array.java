package demo1;

public class Array {

	public static void main(String[] args) {
      int[]arr= {1,5,96,78,98,86,12};
      int max=arr[0];
      for(int i=0;i<arr.length;i++)
      {
    	  if(arr[i]>max)
    	  {
    		  max=arr[i];
    	  }
    	  
      }
      System.out.println(max);
      
	}

}
