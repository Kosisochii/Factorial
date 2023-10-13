public class toAndFro {
    static void print(int num) {
        if(num <= 1) {
            return;
        }else{
            System.out.printf("%d ",num);
            print(num - 1);
            System.out.printf("%d ",num);
            return;
        }
    }
    public static void main(String args[]) {
        int num = 3;
        print(num);
    }
}