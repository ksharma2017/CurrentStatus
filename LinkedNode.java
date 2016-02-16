/**
 *@author Kartikeya Sharma
 *@course Advanced Topics Computer Science
 *@project Vector
 *@date 11.12.15
 *@version 1.0
 */

public class LinkedNode<E>{
    
    private E value;
    private ListNode<E> next;
    
    public ListNode(E item){
        value = item;
    }
    
    public ListNode(E item, ListNode<E> n){
        this(item);
        next = n;
    }
    
    public E getValue(){
        return value;
    }
    
    public ListNode<E> getNext(){
        return next;
    }
    
    public boolean setValue(E item){
        value = item;
        return true;
    }
    
    public boolean setNext(ListNode<E> node){
        this.next=next;
    }
    
    public String toString(){
        return value.toString();
    }
    
}