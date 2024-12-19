public class DisplayPattern {
    public static void displayPattern(int b) {
        for (int a = 1; a <= b; a++) {
            
            for (int pattern = b - a; pattern > 0; pattern--) {
                System.out.print("  ");
            }
          
            for (int pat = 1; pat <= a; pat++) {
                System.out.print(pat + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        displayPattern(7);
    }
}
