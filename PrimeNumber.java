class PrimeNumber {
    public static void main(String[] args) {
        int n = 6;
        int i = 2;
        if (n <= 1) {
            System.out.println("It is not a Prime Number");
        } else if (n == 2) {
            System.out.println("Yes, It is a Prime Number");
        } else if (n % i == 0 && n != i) {
            System.out.println("It is not a Prime Number");
        } else {
            System.out.println("Yes, It is a Prime Number");
        }
    }
}
