package calculations;

public class ArrayFrequency {
    public static void main(String[] args) {

    int[] responses = {1,2,5,20,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2};
            int [] frequency = new int[6];
            int total = 0;
        for (int answer =0; answer < responses.length; answer++) {
           // total += frequency[answer];
            try {
                ++frequency[responses[answer]];
            }
            catch (ArrayIndexOutOfBoundsException e) {
                //System.out.println(e);
                System.out.printf("responses[%d] = %d%n", answer, responses[answer]);
            }
        }
        System.out.printf("%s%8s%n","frequency","answer");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%d%15d%n",rating,frequency[rating]);
            total += frequency[rating];
        }

        System.out.println("Total = " + total);
    }
}
