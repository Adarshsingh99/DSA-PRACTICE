//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverse(Node curr)
    {
        if(curr.next==null)
        {
            return curr;
        }
        Node temp=reverse(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return temp;
    }
    public Node addOne(Node head) {
        // code here.
        if(head==null)
        {
            return head;
        }
        int carry=1;
        head=reverse(head);
        Node temp=head;
       while(temp!=null)
       {
         int sum = carry+temp.data;
         temp.data=sum%10;
         carry=sum/10;
         temp=temp.next;
       }
       head=reverse(head);
       if(carry>0)
       {
           Node Carry= new Node (carry);
           Carry.next=head;
           return Carry;
       }
       
       else
       return head;
        
    }
}
