import java.util.Arrays;

public class OOPS6dComparing implements Comparable<OOPS6dComparing> {

    int rollno;
    float marks;

    // Constructor to initialize rollno and marks
    public OOPS6dComparing(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    // Implementing compareTo method from Comparable interface
    @Override
    public int compareTo(OOPS6dComparing o) {
        System.out.println("In compareTo method");
        return Float.compare(this.marks, o.marks); // Correct float comparison
    }

    // Overriding toString for better display of object data
    @Override
    public String toString() {
        return "Student{" + "rollno=" + rollno + ", marks=" + marks + '}';
    }

    public static void main(String[] args) {
        // Creating student objects
        OOPS6dComparing anish = new OOPS6dComparing(24, 99.0f);
        OOPS6dComparing darshath = new OOPS6dComparing(34, 98.0f);
        OOPS6dComparing akshay = new OOPS6dComparing(14, 91.0f);
        OOPS6dComparing amruth = new OOPS6dComparing(4, 95.0f);

        // Array of students
        OOPS6dComparing[] list = {anish, darshath, akshay, amruth};

        // Displaying the array before sorting
        System.out.println("Before sorting: " + Arrays.toString(list));

        // Sorting using a custom Comparator
        // Arrays.sort(list, new Comparator<OOPS6dComparing>() {
        //     @Override
        //     public int compare(OOPS6dComparing o1, OOPS6dComparing o2) {
        //         return Float.compare(o1.marks, o2.marks); // Proper float comparison
        //     }
        // });
     
        //replacing with lambda functions
        // Arrays.sort(list, (o1,o2) ->Float.compare(o1.marks, o2.marks)); // Proper float comparison
        
        // Displaying the array after sorting
        System.out.println("After sorting: " + Arrays.toString(list));

        // Comparing two objects using compareTo
        if (anish.compareTo(amruth) > 0) {
            System.out.println(anish.compareTo(amruth));
            System.out.println("Anish has more marks");
        }
    }
}
