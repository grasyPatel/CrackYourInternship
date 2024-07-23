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

public class mergeTwoSortedList {


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
        int[] arr1 = {1,2,4};
        int [] arr2={1,3,4};
        ListNode head1 = createLinkedList(arr1);
        ListNode head2 = createLinkedList(arr2);
        ListNode temp=mergeTwoLists(head1,head2);
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }



    } 
    public  static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
       if(list1.val<list2.val){
           list1.next=mergeTwoLists(list1.next,list2);
           return list1;
           }
           else{
               list2.next=mergeTwoLists(list1,list2.next);
               return list2;
       }
       }
       if(list1==null)
           return list2;
       return list1;
   }   
    
}
