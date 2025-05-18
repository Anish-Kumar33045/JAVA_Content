

public class Loops {
 
     private  ListNode head;

     // Detect a loop
     //detect a loop in LinkedList
    //  head --> 1 --> 2 --> 3 --> 4    //loop
    //                       |     |    
    //                       6 <-- 5

    public boolean containsLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) 
            return true;
        }
        return false;
    }

     //removes loop 
     static void removeLoop(ListNode head) {

        // If list is empty or has only one node  without loop 
      

        ListNode slow = head, fast = head;

        // Move slow and fast 1 and 2 steps
        // ahead respectively.
        slow = slow.next;
        fast = fast.next.next;

        // Search for loop using slow and fast pointers
        while (fast != null && fast.next != null) {
            if (slow == fast)
                break;

            slow = slow.next;
            fast = fast.next.next;
        }

        // If loop exists 
        if (slow == fast) {
            slow = head;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
              
                // since fast->next is the looping point remove loop 
              	fast.next = null; 
            }
              // This case is added if fast and slow pointer meet at first position. 
            else {
                while(fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
    }

    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head= first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    public static void main(String[] args) {
        Loops obj = new Loops();
        obj.createALoopInLinkedList();

        System.out.println("loop exists ?? : "+obj.containsLoop());

        obj.removeLoop();
        System.out.println("loop exists ?? : "+obj.containsLoop());
    }
}
