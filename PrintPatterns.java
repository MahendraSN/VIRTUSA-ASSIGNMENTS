class Patterns {
    public static void main(String[] args) {

        int n = 5;

        // 1. Square
        System.out.println("Square:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 2. Rectangle
        System.out.println("\nRectangle:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 3. Parallelogram
        System.out.println("\nParallelogram:");
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) System.out.print(" ");
            for (int j = 0; j < n; j++) System.out.print("* ");
            System.out.println();
        }

        // 4. Mirrored Parallelogram
        System.out.println("\nMirrored Parallelogram:");
        for (int i = 0; i < n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 0; j < n; j++) System.out.print("* ");
            System.out.println();
        }

        // 5. Right Triangle
        System.out.println("\nRight Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        // 6. Mirrored Right Triangle
        System.out.println("\nMirrored Right Triangle:");
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }

        // 7. Isosceles Triangle (Pyramid)
        System.out.println("\nPyramid:");
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        // 8. Inverted Pyramid
        System.out.println("\nInverted Pyramid:");
        for (int i = n; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        // 9. Diamond
        System.out.println("\nDiamond:");
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = n - i; s > 0; s--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        // 10. Heart Pattern
        System.out.println("\nHeart:");
        for (int i = n/2; i <= n; i+=2) {
            for (int j = 1; j < n - i; j+=2) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (i * 2 - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}
