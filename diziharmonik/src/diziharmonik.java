public class diziharmonik {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5,6,7};
            double sum = 0.0;
            double reversenumber=0.0 ;
            for (int i = 0; i < numbers.length; i++) {
                reversenumber=1.0/numbers[i];
                sum += reversenumber;
                System.out.println(sum );
            }


        }
}
