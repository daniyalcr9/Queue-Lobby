package dsafriday;

import javax.swing.JOptionPane;

public class LinkedQueue1 implements dsafriday.Queue {
    private static class Node{
        Object object;
        Node prev=this,next=this;
        Node(Object obj){
            this.object=obj;
        }
        Node(Object obj, Node prev, Node next){
            this.object=obj;
            this.prev=prev;
            this.next=next;
        }
    }
    private int size;
    private Node head=new Node(null);
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return(size==0);
    }
    public Object First(){
        if(size==0){
            JOptionPane.showMessageDialog(null, "Queue is Empty!");

            return null;
        }
        return head.next.object;
    }
    public void add(Object obj){
        head.prev=head.prev.next=new Node(obj,head.prev,head);
        size++;
    }
    public Object remove(){
        if(size==0){
            JOptionPane.showMessageDialog(null, "Can not perform remove method! because size is empty");
            return null;
        }else{
            Object obj=head.next.object;
            head.next=head.next.next;
            head.next.prev=head;
            --size;
            JOptionPane.showMessageDialog(null, "Removed ("+obj+") from list!");
            return obj;

        }

    }
    public void showall(){
        int counts=size;
        if(size==0){
            JOptionPane.showMessageDialog(null, "Queue is Empty!");
        }else{
            StringBuilder ab=new StringBuilder();

            for(Node q=head;counts!=0;q=q.next){
                if(counts==1){
                    ab.append(q.next.object);
                }else{
                    ab.append(q.next.object+",");
                }
                counts--;
            }
            JOptionPane.showMessageDialog(null,"Elements are: "+ab);
        }
    }
}