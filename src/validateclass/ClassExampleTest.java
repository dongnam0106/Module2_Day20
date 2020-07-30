package validateclass;

public class ClassExampleTest {
    private static ClassExample classExample;

    public static final String[] validClass = new String[] {"C0318G"};
    public static final String[] invalidClass = new String[] {"M0318G","P0323A"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String className : validClass) {
            boolean isvalid = classExample.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }

        for (String className : invalidClass) {
            boolean isvalid = classExample.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isvalid);
        }
    }
}
