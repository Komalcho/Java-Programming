class Calculator {
    Calculator() {
        System.out.println("Welcome to Calculator\n");
    }
    Calculator(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }
    void add() {
        System.out.println("Sum of default numbers 8 and 12 is: " + (8 + 12));
    }
    void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }
    void add(float a, float b, float c) {
        System.out.println("Sum of " + a + ", " + b + " and " + c + " is: " + (a + b + c));
    }
    public static void main(String[] args) {
        Calculator c1 = new Calculator(25, 35);
        Calculator c2 = new Calculator();
        c2.add();
        c2.add(40,50);
        c2.add(10.5f, 20.5f, 15.0f);
    }
}