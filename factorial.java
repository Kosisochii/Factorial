// import java.util.Scanner; 

public class factorial {
    static int multiply(int num) {
        if(num == 1) {
            return 1;
        }else {
            return num = num * multiply(num - 1);
        }
    };
        public static void main(String[] args) {
            // Scanner scan = new Scanner(System.in);
            // int result = 
            int result = multiply(10);
            System.out.printf("The factorial is: %d",result);
        };
};