public class Practice {
    public static void main(String[] args) {

//        int stake = Integer.parseInt(args[0]);
//        int goal = Integer.parseInt(args[1]);
//        int trials = Integer.parseInt(args[2]);
//
//        int wins = 0;
//
//        for(int t = 0; t < trials; ++t){
//            int cash = stake;
//
//            while(cash > 0 && cash < goal){
//                if(Math.random() < 0.5)
//                    ++cash;
//                else
//                    --cash;
//            }
//            if(cash == goal)
//                ++wins;
//        }
//
//        System.out.println(wins + " wins of " + trials);


        /*
         * A Cryptography problem (Factor a large integer n)
         * */
        long n = Long.parseLong(args[0]);
        for (int i = 2; i < n; i++) {

            //We keep trying the same number till the condition fails
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        //After ending the loop we print the last standing number
        if (n > 1) System.out.println(n);
        else System.out.println();
    }
}
