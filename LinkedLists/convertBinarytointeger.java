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

public class convertBinarytointeger {

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

    public static void main(String[] args) {
        int[] arr1 = {1,0,1};
        ListNode head1 = createLinkedList(arr1);
        System.out.println(getDecimalValue(head1));

    }
    public  static int getDecimalValue(ListNode head) {
        int n=0;
        while(head!=null){
            n*=2;
            n+=head.val;
            head=head.next;
        }
        return n;
        
    }
}
