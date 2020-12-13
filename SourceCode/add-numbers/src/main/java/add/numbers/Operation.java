package add.numbers;

import java.util.Scanner;

public class Operation {
	
	public static void main(String args[]) {
		
	}

	public int Add(String input) throws java.lang.Exception {
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
		
		checkIfExceptionAny(exMessage);
		
		return sum;
	}
	
	private void checkIfExceptionAny(String exMessage2) throws java.lang.Exception {
		if(! exMessage.equals("")) {
			throw new Exception(Exception +"(" +exMessage.replaceFirst(",", "") + ")");
		}
	}

	String exMessage = "";
	String Exception = "negatives not allowed";

	int calculateSumOfArray(String input[]){
		int sum = 0;       
		for(int i = 0 ; i < input.length; i++) {
			int data = Integer.parseInt(input[i]);
			if(data < 0) {
				exMessage = exMessage + "," + data;
			}
			
			if(data<1000) {
				sum = sum + data;
			}
		}
		return sum;
	}

}
