
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeWorkTask6 {
	
private ListNode head;
	
	private static class ListNode{
		
	private String name;
	private String gender;
	private ListNode next;
	public ListNode(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	}
	public static void main(String[] args) {
	ListNode head = new ListNode("Anna", "female");
	ListNode second = new ListNode ("Masha", "female");
	ListNode third = new ListNode ("Mark", "male");
	ListNode fourth = new ListNode ("Katya", "female");
	ListNode fifth = new ListNode ("Kostya", "male");
	ListNode sixth = new ListNode ("Olya", "female");
	ListNode seventh = new ListNode ("David", "male");
	ListNode eighth = new ListNode ("Sam", "male");
	ListNode nineth = new ListNode ("Victor", "male");
	ListNode tenth = new ListNode ("Vika", "female");
	ListNode eleventh = new ListNode ("Diana", "female");
	ListNode twelfth = new ListNode ("Tom", "male");
	
	List<ListNode> list = new LinkedList<>();
	
	list.add(0, head);
	list.add(1, second);
	list.add(2, third);
	list.add(3, fourth);
	list.add(4, fifth);
	list.add(5, sixth);
	list.add(6, seventh);
	list.add(7, eighth);
	list.add(8, nineth);
	list.add(9, tenth);
	list.add(10, eleventh);
	list.add(11, twelfth);
	
	for(int i = 0; i <list.size(); i++){
		
		 System.out.println(list.get(i).name + " " + list.get(i).gender );
	 }
	
	Iterator<ListNode> iter = list.iterator();
	 
	 while (iter.hasNext()){
		 ListNode ln = iter.next();
		 String s = ln.gender;
		 if(s =="male"){
			 iter.remove();
		 }
	 }
	 System.out.println("List without boys: ");
	 for(int i = 0; i <list.size(); i++){
			 System.out.println(list.get(i).name);
		 }
	System.out.println(); 
	System.out.println("Sorted list of girls: "); 
	for(int i = 0; i <list.size(); i=i+2){
		 System.out.println(list.get(i).name + ", " + list.get(i).gender);
	 }
	}
	
	
	

	}


