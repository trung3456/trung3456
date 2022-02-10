class hello {
    public static void main(String[] args) {
        System.out.println(sum_recursion(5, 10));
    }

    static int sum_recursion(int number_star, int number_end) {
        if (number_end > number_star) {
            return number_end + sum_recursion(number_star, number_end - 1);
        }
        return number_end;
    }
}