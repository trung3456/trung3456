class hello {
    public static void main(String[] args) {
        int a = dequy(5);
        System.out.println(a);
    }

    static int dequy(int number) {
        if (number == 1) {
            return 1;
        }
        return number * dequy(number - 1);
    }
}