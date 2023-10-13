import java.io.*;
class fibonacci {
	static int Fib(int N) {
		if (N == 0 || N == 1)
			return N;

		return Fib(N - 1) + Fib(N - 2);
	};

	public static void main(String[] args) {
		System.out.println("Factorial of " + 3 + " " + Fib(91));
		System.out.println("Factorial of " + 4 + " " + Fib(4));
		System.out.println("Factorial of " + 5 + " " + Fib(5));
	}
};