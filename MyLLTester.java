//Kieran Keiller, pd.3, 11/1/24
//This code test the linked list class by creating a list and adding, removing, and getting values from it and printing the results
public class MyLLTester
{
  public static void main(String [] args)
  {
    
    //create list
    MyLinkedList myList = new MyLinkedList();

    //add all values
    myList.add("0");
    myList.addFirst("1");
    myList.addLast("2");
    myList.addFirst("3");
    myList.add("4");
    myList.addFirst("5");
    myList.addFirst("6");
    myList.addFirst("7");
    myList.addLast("8");
    myList.add("9");
    System.out.println("Initial List: ");
    System.out.println(myList.toString());

    //set value
    myList.set(0, "0");
    System.out.println("List after set: ");
    System.out.println(myList.toString());

    //get value
    System.out.println("Value 10 in the list = " + myList.get(9) + "\n");

    //remove values
    myList.remove(1);
    System.out.println("List after second element removed: ");
    System.out.println(myList.toString());
    myList.removeFirst();
    System.out.println("List after first element removed: ");
    System.out.println(myList.toString());
    myList.removeLast();
    System.out.println("List after last element removed: ");
    System.out.println(myList.toString());

    // check for empty list and get list size
    System.out.println("Empty List = " + myList.isEmpty() + "\n");
    System.out.println("List Size = " + myList.size() + "\n");
  } // end main
  
} // end class
