

public class meth {
	public static int i = 1;
	//Prints all the numbers to the power of 2
	public static void powerOfTwo(int i) {
		for (i = 2; i < 1025; i = i*2) {
			System.out.println(i);
		}
	}
	//Prints Alarm 10 times
	public static void alarm(int num) {
		for (i = 1; i <= num; i++) {
			System.out.println("Alarm!" + i);
		}
	}
	//Prints the sum of all numbers from 1 to 100
	public static void sum100(int j, int k){

	    int result = i;
		for(int i = 0 ; i < 101; i++) {
	    result += i;
	    } 
	    System.out.println(result);
	}
	

	
	public static void main(String[] args) {
		powerOfTwo(i);
		alarm(10);
		sum100(0, 100);
	}
}
