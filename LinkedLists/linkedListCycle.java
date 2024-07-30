package LinkedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val = val; 
    }
    ListNode(int val, ListNode next){ 
        this.val = val;
        this.next = next;
    }
}    

public class linkedListCycle {
    public static ListNode createLinkedList(int[] arr) {
        ListNode head = null;
        ListNode tail = null;
        for (int val : arr) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        return head;
    }

    public static void createCycle(ListNode head, int pos) {
        if (pos < 0) return;
        ListNode cycleNode = null;
        ListNode tail = head;
        int index = 0;

        while (tail.next != null) {
            if (index == pos) {
                cycleNode = tail;
            }
            tail = tail.next;
            index++;
        }

        // Create the cycle
        if (cycleNode != null) {
            tail.next = cycleNode;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        ListNode head1 = createLinkedList(arr1);
        createCycle(head1, 0);
        System.out.println(hasCycle(head1)); 
        
        int[] arr2 = {3,2,0, -4};
        ListNode head2 = createLinkedList(arr2);
        createCycle(head1, 1); 
        System.out.println(hasCycle(head2)); 
    } 

    public static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;        
    }   
}
