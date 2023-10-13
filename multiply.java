public class multiply {
    static int times(int num) {
        if(num <= 10) {
            return num *= times(num + 1);
        }else{
            return 1;
        }
        
    };
        public static void main(String args[]) {
            int result = times(5);
            System.out.println(result);
        }
};