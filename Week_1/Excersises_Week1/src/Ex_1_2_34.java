public class Ex_1_2_34 {
    public static void main(String[] args) {
        System.out.println("Second exercise");

        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        int x3 = Integer.parseInt(args[2]);

        int min = Math.min(x1, Math.min(x2, x3));
        int max = Math.max(x1, Math.max(x2, x3));
        int median = x1 + x2 + x3 - min - max;

        System.out.println(min);
        System.out.println(median);
        System.out.println(max);

        System.out.println("bc" + 2 + 3);


    }
}
