public class JavaRecursion {
    //Java recursion - making a function call itself.
    //provides away to break complicated problems down into simple problems which are easier to solve


        public static void main(String[] args) {
            int result = sum(10);
            System.out.println(result);
        }
        public static int sum(int k) {
            if (k > 0) {
                return k + sum(k - 1);
            } else {
                return 0;
            }
        }

}
