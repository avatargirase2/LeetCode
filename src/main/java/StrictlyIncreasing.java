
public class StrictlyIncreasing {
	
	
    public static int arrayChange(int[] inputArray) {

        int moveCounter = 0;
        int moves;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] >= inputArray[i + 1]) {
                moves = inputArray[i] - inputArray[i + 1] + 1;
                moveCounter += moves;
                inputArray[i + 1] = inputArray[i + 1] + moves;
            }
        }
        
        System.out.println(new StringBuffer("Avatar").toString().equals("Avatar"));
        return moveCounter;

    }
    
    
    public static void main(String[] args) {
		
    	arrayChange(new int[] {1,1,1});
    	
	}
    

}
