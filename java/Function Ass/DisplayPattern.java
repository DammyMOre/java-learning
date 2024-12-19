public class DisplayPattern {
    public static void displayPattern(int number) {
        for (int count = 1;count <= number; count++) {
            
            for (int pattern = number - count; pattern >0; pattern--) {
                System.out.print("  ");
            }
          
            for (int pat = 1; pat <= count; pat++) {
                System.out.print(pat + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern(7);
    }
}
