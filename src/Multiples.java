public class Multiples {
    public static void main(String[] args) {

        int numMultiples = 0;
        int numMultiples15 = 0;
        int first = 0;
        int second = 0;
        int third = 0;


        while(first + 3 < 1000 || second + 5 < 1000 || third + 15 < 1000){

            if (first + 3 < 1000) {

                first = first + 3;
                numMultiples++;

            }

            if (second + 5 < 1000) {

                second = second + 5;
                numMultiples++;

            }

            if (third + 15 < 1000) {

                third = third + 15;
                numMultiples15++;

            }
        }

        System.out.println(numMultiples - numMultiples15);

    }
}
