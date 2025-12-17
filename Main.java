//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class EvenOddCount {
    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;

        // Loop through all command line arguments
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of Even numbers: " + evenCount);
        System.out.println("Number of Odd numbers: " + oddCount);
    }
}
