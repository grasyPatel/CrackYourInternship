package LinkedLists;
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val){
//         this.val = val; 
//     }
//     ListNode(int val, ListNode next){ 
//         this.val = val;
//         this.next = next;
//     }
// }    


public class intersectionofTwoLinkedLists {
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
        int[] arr1 = {5,6,1,8,4,5};
        int [] arr2={4,1,8,4,5};
        ListNode headA = createLinkedList(arr1);
        ListNode headB = createLinkedList(arr2);
        ListNode currentB = headB;
        while (currentB.next != null) {
            currentB = currentB.next;
        }
        currentB.next = headA.next.next;
        ListNode a=getIntersectionNode(headA, headB);
        while(a!=null){
            System.out.print(a.val+"->");
            a=a.next;
        }
    } 
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        while( a != b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;    
        }
        return a.next;
        
    }  
    
}
