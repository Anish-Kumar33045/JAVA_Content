public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public  String toString() {
        return String.valueOf(data); // Returns the value of the node as a string
    }
    public static void main(String[] args) {
          ListNode obj = new ListNode(10);
        System.out.println(  obj.toString());
        System.out.println();
    }
}
