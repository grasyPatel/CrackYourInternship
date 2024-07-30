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

public class removeDuplicatesfromSortedList {
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
        int[] arr1 = {1,1,2};
        ListNode head1 = createLinkedList(arr1);
        ListNode temp=deleteDuplicates(head1);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr;
            while(temp!=null&&temp.val==curr.val){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
        return head;
        
    }   

    
}
