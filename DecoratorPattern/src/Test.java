// Decorator Pattern
// Multiple descriptions can be wrapped in a decorator
// You can customize the object by adding wrappers without modifying the code
// for specific circumstances
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer = new Disk(computer);
        computer = new Monitor(computer);
        computer = new CD(computer);
        computer = new CD(computer);
        System.out.println("You are getting a: " + computer.description());
    }
}
