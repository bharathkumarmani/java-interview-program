package Programs;

public class Runlengthencoding {
	
	 public static void runlengthencoding(String value){
		
		
		 for (int i=0; i<value.length(); i++)
		 {
			 int count = 1; 
			 while(i<value.length()-1 && value.charAt(i)==value.charAt(i+1) )
			 {
				 count++;
				 i++;
			 }
			 System.out.print(value.charAt(i)+""+count);
			 //System.out.print(count);
			 
			 
		 }
		
	}
	
	
	public static void main(String[] arg)
	{
		System.out.println("Run length encoding for following pattern --- aaaabbbbcccc");
		String name = "aaaabbbbcccc";
		runlengthencoding(name);
		
	}

}
