

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks);

        B obj1 = new B();
       System.out.println(obj1.marks); // This will print the default value of `int` (0).
    }
}
