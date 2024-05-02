import java.util.ArrayList;

public class Main {
    //NO DUPLICATION

    public static void main(String[] args) {
        int n = 6; //number of elements in the set
        int k = 3; //possible characters

        int result = combinations(n, k);
        System.out.println(result);
    }

    public static int combinations(int n, int k) {

        int factN = factorial(n);

        int factK = factorial(k);

        int minus = n - k;
        int factM = factorial(minus);

        return factN / (factK * factM);

    }
    public static int factorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static ArrayList<Integer> allCombinations(int[] array) {
        return null;
    }
}