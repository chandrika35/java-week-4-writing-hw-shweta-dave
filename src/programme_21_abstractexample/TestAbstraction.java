package programme_21_abstractexample;

/**
 * 4. Create the fourth class name TestAbstraction and inside create main methos as below.
 * In real scenario, method is called by programmer or user
 */

public class TestAbstraction {
    public static void main(String[] args) {
        //in real scenario, object is provided through method, e.g., getShape() method
        Shape s = new Circle();
        s.draw();
    }
}
