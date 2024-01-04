public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);

        int i = 0, j = 0;
        int steps = 0;

        System.out.println("(0, 0)");
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

            System.out.println("(" + i + ", " + j + ")");
            ++steps;
        }

        System.out.println("steps = " + steps);
    }
}
