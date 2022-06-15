package task22ndstrings;

public class StringRemove {
	 public void removeCharacters(String str1,String str2)
	    {
	        char temp;
	        String temp1 = str1,search,replace="";
	        for (int count1 =0;count1 < str1.length();count1++)
	        {
	            temp = str1.charAt(count1);
	            search = Character.toString(temp);
	            
	            for (int count2 = 0; count2 < str2.length();count2++)
	            {
	                if (temp == str2.charAt(count2))
	                {
	                    temp1 = temp1.replace(search,replace);
	                }
	            }
	            
	        }
	        System.out.println("After removing String2 in String1 :"+temp1);
	        
	    }
}
