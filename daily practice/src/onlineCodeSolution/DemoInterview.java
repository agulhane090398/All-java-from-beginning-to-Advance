package onlineCodeSolution;

public class DemoInterview {

	public static void main(String[] args) {
		int[] a={1,3,5,35,20,35,20,35,20,2};
		int n=a.length;
		int max=a[0];
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(a[k]+" ");
		}
	
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(a[i]==a[j])
				{
					
					System.out.println(a[i]);
				}
				
			}
			
		}
		
		//parse int
		 String s = "25TA";
	        try{
	            Integer number = Integer.parseInt(s.replaceAll("[\\D]", ""));
	            System.out.println(number); 
	        }
	        catch (NumberFormatException ex){
	            ex.printStackTrace();
	        }
	        
	        
	        //rev
	        StringBuilder input = new StringBuilder(); 
	        input.append(s); 
	        input = input.reverse(); 
	        System.out.println(input);
	        
	        
	        //sort
	        
	        

		
	}
}
