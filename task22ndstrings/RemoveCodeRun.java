package task22ndstrings;
import java.util.Scanner;  
public class RemoveCodeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String1 :");
        str1 = scan.nextLine();
        System.out.print("Enter the String2 :");
        str2 = scan.nextLine();
        scan.close();        
        StringRemove r1 = new StringRemove();
        r1.removeCharacters(str1,str2);
        //RemovalOfCharacters oRemovalOfCharacters = new RemovalOfCharacters();
        //oRemovalOfCharacters.removeCharacters(str1, str2);
	}

}
