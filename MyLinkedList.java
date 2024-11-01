//Kieran Keiller, pd.3, 11/1/24
//This code defines a class that can do different thing like add, remove, and get values for a link list.

public class MyLinkedList
{
    private ListNode head;
    private int size;

    //creates an empty LinkedList
    public MyLinkedList(){
        head = null;
        size = 0;
    }//end MyLinkedList

    //returns the current # of ListNode elements in the LinkedList
    public int size(){
        return size;
    }//end size

    //returns true if there are no ListNode elements in the LinkedList
    public boolean isEmpty(){
        if(size == 0|| head == null){
            return true;
        } else{
            return false;
        }//end if/else
    }//end isEmpty

    //adds a ListNode element to the end of the LinkedList, always returns true.
    public boolean add(Object obj){
        // if statement for checking if it is empty
        // add the special way to add to empty
        if (isEmpty() == true){
            head = new ListNode(obj, null);
        } else {
            ListNode temp = head;
            while (temp.getNext() != null){
                temp = temp.getNext();
            }//end while
            temp.setNext(new ListNode(obj, null));
        }//end else
        size++;
        return true;
    }//end add

    //adds a ListNode element to the beginning of the LinkedList
    public boolean addFirst(Object obj){
        head = new ListNode(obj, head);
        size++;

        return true;
    }//end addFirst

    //adds a ListNode element to the end of the LinkedList
    public boolean addLast(Object obj){
        // if statement for checking if it is empty
        // add the special way to add to empty
        add(obj);
        return true;
    }//end addLast

    //changes the information stored as the value of the ListNode element at the given position
    public Object set(int i, Object obj){
        ListNode temp = head;
        if (i < 0 || i >= size()){
            throw new IndexOutOfBoundsException();
        } else {
        for (int j = 0; j < i; j++)
            temp = temp.getNext();
        }//end else
        Object setVal = temp.getValue();
        temp.setValue(obj);
        return setVal;
    }//end set

    //returns the information stored as the value of the ListNode element at a given position
    public Object get(int i){
        ListNode temp = head;
        if (i < 0 || i >= size()){
            throw new IndexOutOfBoundsException();
        } else {
        for (int j = 0; j < i; j++)
            temp = temp.getNext();
        }//end else
        return temp.getValue();
    }//end get

    //removes the ListNode element at the given position leaving the rest of the LinkedList intact
    public Object remove(int i){
        ListNode temp = head;
        if (i < 0 || i >= size()){
            throw new IndexOutOfBoundsException();
        } else {
        for (int j = 0; j < i-1; j++)
            temp = temp.getNext();
        }//end else
        Object setVal = temp.getValue();
        ListNode removeMe = temp.getNext();
        temp.setNext(removeMe.getNext());
        removeMe.setNext(null);
        size--;
        return setVal;
    }//end remove

    //removes the ListNode element at the beginning of the LinkedList and returns the value of the node
    public Object removeFirst(){
        ListNode temp = head;
        Object setVal = temp.getValue();
        ListNode removeMe = head;
        temp.setValue(removeMe.getNext());
        head = head.getNext();
        removeMe.setNext(null);
        size--;
        return setVal;
    }//end remove first

    //removes the ListNode element at the end of the LinkedList and returns the value of the node
    public Object removeLast(){
        ListNode temp = head;
        while (temp.getNext().getNext()!=null)
            temp = temp.getNext();
        Object setVal = temp.getValue();
        ListNode removeMe = temp.getNext();
        temp.setNext(removeMe.getNext());
        removeMe.setNext(null);
        size--;
        return setVal;
    }//end remove last

    //returns a String representation of the LinkedList in the following format:
    public String toString(){
        ListNode temp = head;
        int place = 1;
        String str = "";
        while (temp!=null){
            str += place + ": " + temp.getValue() + "\n";
            temp = temp.getNext();
            place++;
        }//end while
        return str;
    }//end toString
}//end class