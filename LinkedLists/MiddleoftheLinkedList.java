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
public class MiddleoftheLinkedList {
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
        int[] arr1 = {5, 4, 7, 1, 2, 3,9};
        ListNode head1 = createLinkedList(arr1);
        ListNode temp=middleNode(head1);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }



    } 
    public static ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int n=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        n=n/2;
        while(n>0){
            head=head.next;
            n--;
        }
        return head;

        
    }  
        
    
}
