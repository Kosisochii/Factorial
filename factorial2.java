class GFG {
	int fact(int n) {
		int result;

		if (n == 1)
			return 1;
		result = n * fact(n - 1);
		return result;
	};
};
class factorial2 {
	public static void main(String[] args) {
		GFG f = new GFG();
		System.out.println("Factorial of 3 is "
						+ f.fact(3));
		System.out.println("Factorial of 4 is "
						+ f.fact(4));
		System.out.println("Factorial of 5 is "
						+ f.fact(5));
	};
};