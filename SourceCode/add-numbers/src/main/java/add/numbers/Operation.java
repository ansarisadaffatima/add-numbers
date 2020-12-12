package add.numbers;

import java.util.Scanner;

public class Operation {
	
	public static void main(String args[]) {
		
	}

	public int Add(String input) {
		Scanner sc = new Scanner(input);
		int sum = 0;
		String delimeter = ",";
		
		while(sc.hasNextLine()){
            String inputString = sc.next();  
            
            if(inputString.startsWith("//")) {
            	delimeter = inputString.substring(2);
            }
            else {
            	sum = sum + calculateSumOfArray(inputString.split(delimeter));
            }
            
        } 
		sc.close();	
		
		return sum;
	}

	int calculateSumOfArray(String input[]){
		int sum = 0;       
		for(int i = 0 ; i < input.length; i++) {
			sum = sum + Integer.parseInt(input[i]);
		}
		return sum;
	}

}
