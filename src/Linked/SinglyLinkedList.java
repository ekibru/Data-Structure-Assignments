package Linked;

import practice.SingleLinkedList;

/**Ephrem Kidane          ID#: 112580
 * Data structure Lab Assignment 4 & 5
 */
public class SinglyLinkedList {
   private Node head =null;
   private int size=0;
   private class Node{
      private int data;
      private Node next;

      public Node (int item){
         this.data=item;
         this.next=null;
      }

      public Node (int item, Node point){
         this.data=item;
         this.next=point;
      }
   }
   public void add(int item){
      head= new Node(item,head);
      size++;
   }
   public int size(){
      return size;
   }
   public Node getNode(int index){
      Node node = head;
      for (int i=0; i<index && node != null; i++) {
         node = node.next; }
      return node;
   }
   public boolean find(int item){
      Node node = head;
      if(item==node.data)
         return true;
      return false;
   }
   public int max(){
       if(head==null)
           return 0;
       int max = head.data;
       Node node = head;

       while (node.next!=null){
           if (node.next.data>max)
               max=node.next.data;
           node=node.next;
       }
       return max;
   }



    public int min() {

        if (head == null)
            return 0;
        int min = head.data;

        Node node = head;

        while (node.next != null) {
            if (node.next.data < min)
                min = node.next.data;
            node = node.next;
        }
        return min;
    }
    public String toString() {
        Node current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.data);
            if (current.next != null) {
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SinglyLinkedList num = new SinglyLinkedList();
        num.add(10);
        num.add(90);
        num.add(20);
        num.add(30);
        System.out.println(num);
        
        System.out.println(num);
    }
}
