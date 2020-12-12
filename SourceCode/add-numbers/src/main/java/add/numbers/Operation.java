package add.numbers;

import java.util.Scanner;

public class Operation {
	
	public static void main(String args[]) {
		
	}

	public int Add(String input) {
		Scanner sc = new Scanner(input);
		String[] in = null ;
		int sum = 0;
		String delimeter = ",";
		
		while(sc.hasNextLine()){
            String inputString = sc.next();  
            
            if(inputString.startsWith("//")) {
            	delimeter = inputString.substring(2);
            	in = sc.next().split(delimeter);
            }
            else {
            	in = inputString.split(delimeter);
            }
            
        } 
		sc.close();
		
		if(in == null) {
			return 0;
		}
		
		if(in.length == 1) {
			return Integer.parseInt(in[0]);
		}
		
		for(int i = 0 ; i < in.length; i++) {
			sum = sum + Integer.parseInt(in[i]);
		}
		
		return sum;
	}

}
