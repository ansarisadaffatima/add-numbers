package add.numbers;

public class Operation {
	
	public static void main(String args[]) {
		
	}

	public int Add(String input) {
		String[] in = input.split(",");
		
		if(in.length == 1) {
			if(in[0].length() == 0) {
				return 0;
			}
			else {
				return Integer.parseInt(in[0]);
			}
		}
		
		return (Integer.parseInt(in[0]) + Integer.parseInt(in[1]));
	}

}
