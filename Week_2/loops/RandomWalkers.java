public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        double sum = 0;

        for(int t = 0; t < trials; ++t){
            int i = 0, j = 0;
            int steps = 0;
            while(Math.abs(i) + Math.abs(j) != r){
                double prob = Math.random();
                if(prob < 0.25)
                    ++i;
                else if(prob < 0.5)
                    --i;
                else if(prob < 0.75)
                    ++j;
                else
                    --j;

                ++steps;
            }
            sum += steps;
        }

        double average = sum / (double)trials;
        System.out.println("average number of steps = " + average);
    }
}
