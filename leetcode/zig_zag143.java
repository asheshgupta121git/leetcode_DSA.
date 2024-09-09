package leetcode;

import java.util.*;

public class zig_zag143 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;
        }
        public static Node head;

        public void addFrist(int data){
            // create new node
            Node newNode = new Node(data);
            
             if (head == null) {
                head = newNode;
                return;
             }
            newNode.next = head;// linking
            head = newNode;
        }

        public  static void zigzag(){
            // find mid 
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            Node mid = slow;
            // reverse 2 half
            Node curr = mid.next;
            mid.next = null;

            Node prev = null;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node left = head;
            Node right = prev;

            Node nl,nr;
              // alt merge zigzag

            while (left != null && right != null) {
                nl = left.next;
                left.next = right;
                nr = right.next;
                right.next = nl;


                left = nl;
                right = nr;
            }


          
        }
        public static void main(String[] args) {
            zig_zag143 link= new zig_zag143();
 
            
            //5->4->3->2->1->null
            
            

        }
        
    }
    
}
