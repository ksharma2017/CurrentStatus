/**
 *@author Kartikeya Sharma
 *@course Advanced Topics Computer Science
 *@project Vector
 *@date 11.12.15
 *@version 1.0
 */

public class LinkedList{
    private ListNode<E> head;
    private ListNode<E> tail;
    private int size;
    
    public LinkedList(){
        head=null;
        tail=null;
        size=0;
    }
    
    /*
    public int size(){
        int count = 0;
        for (ListNode<E> curr == head; curr!=null; curr=curr.getNext()){
            count++;
        }
        return count;
        //return size;
        // size = 0 doesn't work
        // size = 1... curr.getNext() will never leave
    }
    */
    
    public LinkedList(<ListNode<E> h){
        head = h;
    }
    
    public void add(E o){
        boolean stop = false;
        while (stop==false){
            
        }
    }
    
    public Linkedlist(LinkedList<E> other){
        head = other.head;
        tail = other.tail;
        size = other.size;
    }
    
    public int size(){
        return size(head);
    }
    
    private int size(ListNode<E> node){
        if (node==null){
            return 0;
        }
        else{
            return 1+size(node.getNext());
        }
    }
    
    public boolean add(E item){
        ListNode<E>
    }
    
    //Notes 11.23
    
    // E thin = list.get(i);
    // if (list.removeFirst()==item)
    
    // private ListNode<E> curr;
    // public LinkedListIterator (Listnode<E> head)
    // curr = head
    
    // public boolean hasNext(){
    // return curr!=null;}
    
    // public Iterator iterator(){
    // return new LinkedListIterator(head);
    
    // public E next(){
    // hasNext ?
    // get the item in curr
    // incriment curr
    // return item}
    // Try to do this for testing: Stack<E> s = new LinkedList<E>(1);
}

/* Implemention

public class Set<E> extends LinkedList<E>

public boolean add (E item){
    if (contains(item)){
        return false;
    }
    else{
        return super.add(item);
    }
}


 public interface Stack<E>
 {
    void push(E item);
    E pop();
    E peek();
    boolean isEmpty();
 
    Stack<Character> calculator = new LinkedList<Character>();
 }
 
 public interface Queue<E>{
    void offer(E item);
    E poll();
    E peek();
    boolean isEmpty();
 }
 
 FIFO - first in first out
 LIFO - last in first out
*/
    
