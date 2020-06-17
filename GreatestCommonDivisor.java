package java_masterclass;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int commonDivisor = 0;
        int min = Math.min(first, second);
        int i = 1;
        while (i <= min) {
            if (first % i == 0 && second % i == 0) {
                commonDivisor = i;
            }
            i++;
        }
        return commonDivisor;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(42, 28));
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

}
