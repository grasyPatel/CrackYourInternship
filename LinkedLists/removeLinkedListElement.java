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

public class removeLinkedListElement {
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
        int[] arr1 = {1,2,6,3,4,5,6};
        ListNode head1 = createLinkedList(arr1);
        ListNode temp=(removeElements(head1,6));
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }



    } 
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode ll=new ListNode();
        ll.next=head;
        ListNode cur=ll;
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next=cur.next.next;
            }
            else{
                cur=cur.next;
            }
        }
        return ll.next;
       
        
    }
    
    
}
