class hello {
    static void testmethod(String name) {
        System.out.println("Hello, " + name + " !");
    }

    public static void main(String[] args) {
        String[] name = {"Alice", "Bob", "Carol"};
        System.out.println(name.length);
        for (int i = 0; i < name.length; i++) {
            testmethod(name[i]);
        }
    }
}