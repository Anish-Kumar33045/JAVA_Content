import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<>();

        people.add("anish");
        people.add("amruth");
        people.add("raj");
        people.add("kumar");

        System.out.println("ArrayList: " + people);

        people.remove("raj");
        people.remove(2);

        if (people.contains("kumar")) {
            System.out.println("Kumar is present");
        }

        System.out.println("ArrayList: " + people);

        // Printing elements one by one
        for (int i = 0; i < people.size(); i++)
            System.out.print(people.get(i) + " ");
        System.out.println();

        // =================================================================================================        

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        System.out.println(list.equals(people));
        System.out.println(list);

        // Printing elements one by one
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");

        // =================================================================================================  

        // Declaring the Vector
        Vector<Integer> v = new Vector<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the Vector
        // after deletion
        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");

        // =================================================================================================

        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        /*
         * The iterator starts before the first element.
                When you call next(), it:
                Moves to the next element
                Returns that element
                So, calling itr.next() for the first time gives you the first element.
         */

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }

}