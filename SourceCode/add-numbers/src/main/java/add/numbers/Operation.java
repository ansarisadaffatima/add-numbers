package add.numbers;

public class Operation {
	
	public static void main(String args[]) {
		
	}

	public int Add(String input) {
		String[] in = input.split(",");
		int sum = 0;
		
		if(in.length == 1) {
			if(in[0].length() == 0) {
				return 0;
			}
			else {
				return Integer.parseInt(in[0]);
			}
		}
		
		for(int i = 0 ; i < in.length; i++) {
			sum = sum + Integer.parseInt(in[i]);
		}
		return sum;
	}

}
