package task14thApril;

import java.util.Scanner;

public class ArmstrongNum {
	void showArmstrongnumber(int number) {
		int temp = number ,answer = 0,lastDigit;
		
		while(number!=0) {
			
			lastDigit=number%10;
			answer=answer+(lastDigit*lastDigit*lastDigit);
			number=number/10;
			
		}
		if(temp == answer)
			System.out.print(temp + " ");
		
		}
}
