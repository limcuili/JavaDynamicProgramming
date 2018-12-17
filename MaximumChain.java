class MaximumChain {

    static void printChain (int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int[] x = {5,15,-30,10,-5,40,10}; // expect this to have maxSum 55 from 10,-5,4-,10.
        System.out.print("chain x = ");
        printChain(x);
        System.out.println("Maximum subsequence in x is " + maxSum); // NT define maxSum.
        // NT print subsequence that produces tha maximum chain.
    }

    // NT create method that finds the max subsequence.
}