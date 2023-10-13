public class recurse2 {
	public static void main(String args[]) {
		int total = 0;
		for(int num = 1;num<=10000; num++) {
			total += num;
		};
		System.out.printf("The total sum of numbers between 5 and 10 is: %d",total);
	};
};