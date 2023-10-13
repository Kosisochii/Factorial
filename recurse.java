public class recurse {
	static int sum(int num) {
		if(num <= 10000) {
			return num + sum(num + 1);
		}else {
			return 0;
		}
	};
	public static void main(String args[]) {
		int result = sum(1);
		System.out.println(result);
	}
};