/*
*ListNode.java
*Holds an Object(value) and the next node in the chain.
*/

public class ListNode
{
	private Object value;
	private ListNode next;

	public ListNode(Object initValue, ListNode initNext)
	{
		value = initValue;
		next = initNext;
	} // return constructor

	public Object getValue()
	{
		return value;
	} // end getValue

	public ListNode getNext()
	{
		return next;
	} // end getNext

	public void setValue(Object theNewValue)
	{
		value = theNewValue;
	} // end setValue

	public void setNext(ListNode theNewNext)
	{
		next = theNewNext;
	} // end setNext

} // end class
