class MaximumChain {

    static void printChain (int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        // If we wanted to take in command line arguments instead of doing this
        // sorry excuse for hardcoded testing I have below, implement the below in replace of array x...
        /*
        if (args.length < 1) {
           System.out.println("Kindly provide some integer arguments");
           return;
        }
        int n = args.length;
        int[] x = int[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(args[i]);
        }
         */

        int[] x = {5,15,-30,10,-5,40,10}; // expect this to have maxSum 55 from 10,-5,4-,10.
        System.out.print("chain x = ");
        printChain(x);
        int[] max = new int[x.length]; // max[i] contains the largest sum of a subsequence of consec. elements ending with x[i]
        int[] start = new int[x.length]; // start[i] contains the element that starts the subsequence producind max[i];
        for (int i = 1; i < x.length; i++) {
            if (max[i-1] < 0) {
                max[i] = x[i];
                start[i] = i;
            } else {
                max[i] = x[i] + max[i-1];
                start[i] = start[i-1];
            }
        }
        int maxSum = 0;
        int end = -1;
        for (int i = 1; i < x.length; i++) {
            if (maxSum < max[i]) {
                maxSum = max[i];
                end = i; // identifying the last element of the max chain subsequence
            }
        }
        System.out.println("Maximum sum of consequetive integers in x is " + maxSum);
        System.out.print("The corresponding subsequence is ");
        if (end != -1) { // ie. chain is non-empty
            for (int i = start[end]; i <= end; i++) {
                System.out.print(x[i] + " ");
            }
        }
        System.out.println();
    }
}