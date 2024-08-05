package LinkedLists;

public class addTwoNumbers {
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
        int[] arr1 = {2,4,3};
        ListNode head1 = createLinkedList(arr1);
        int []arr2={5,6,4};
        ListNode head2=createLinkedList(arr2);
        ListNode temp=AddTwoNumbers(head1, head2);
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("Null");
        
    }

    public static ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
       ListNode head=l3;
       int carry=0;
       while(l1!=null || l2!=null){
           int sum=0+carry;
           if(l1!=null){
               sum+=l1.val;
               l1=l1.next;
           }
           if(l2!=null){
               sum+=l2.val;
               l2=l2.next;
           }
           carry=sum/10;
           sum=sum%10;
           head.next= new ListNode(sum);
           head=head.next;

       }
       if(carry ==1){
           head.next=new ListNode(1);
       }
       return l3.next;

       
   }
}
    

