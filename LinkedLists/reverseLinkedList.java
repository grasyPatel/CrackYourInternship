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

public class reverseLinkedList {

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
        int[] arr1 = {1,2,3,4,5,6,7,8};
        ListNode head1 = createLinkedList(arr1);
        ListNode head2=reverseList(head1);
        while(head2!=null){
            System.out.print(head2.val+"->");
            head2=head2.next;
        }
        System.out.print("null");
    }
    public  static ListNode reverseList(ListNode head) {
        ListNode cur=head;
       ListNode pre=null;
       ListNode nc=null;
       while(cur!=null){
           nc=cur.next;
           cur.next=pre;
           pre=cur;
           cur=nc;

       }
       head=pre;
       return head;
       
   }
          
    
}
