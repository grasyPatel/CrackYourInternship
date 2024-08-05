package LinkedLists;

import java.util.Stack;

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

public class palindrimeLinkedList {
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
        System.out.println(isPalindrome(head1));
        
    }
    public static boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode head1=head;
        while(head1 !=null){
            s.push(head1.val);
            head1=head1.next;
        }
       
        while(head!=null){
            if(head.val!=(int)s.pop()){
                return false;
            }
            head=head.next;
        }
        return true;
        
        
    }

    
}