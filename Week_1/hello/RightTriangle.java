public class RightTriangle {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        int a = Math.min(x, Math.min(y, z));
        int c = Math.max(x, Math.max(y, z));
        int b = x + y + z - a - c;

        int squareSum = a * a + b * b - c * c;

        boolean isRightTriangle = (squareSum == 0 && (c > 0 && a > 0 && b > 0));

        System.out.println(isRightTriangle);




    }
}
