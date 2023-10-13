public class loop {
    static int multiply(int start) {
        int answer = 1;
        if(start <= 10) {
                return answer *= multiply(start -1);
        }else {
            return 0;
        }
    };
    public static void main(String args[]) {
        int result = 1;
        for(int i = 5; i <= 10; i++) {
             result *= i; 
        }
        multiply(5);
        System.out.println(result);
    };
};