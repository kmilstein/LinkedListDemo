package LinkedListPresentation;

public class ComparisonDemo {
	public static void main(String[] args) {
		long startTime;
		long endTime;
		long resultTime;

		System.out.println("Starting tests\n");

		// test Singly Linked List
		startTime = System.nanoTime();
		System.out.println("Create an empty list.");
		ListInterface<String> singly = new SinglyLinkedList<>();
		System.out.println("List should be empty; isEmpty returns " + singly.isEmpty() + ".");
		System.out.println("\nTesting add to end:");
		singly.add("15");
		singly.add("25");
		singly.add("35");
		singly.add("45");
		endTime = System.nanoTime();
		resultTime = endTime - startTime;
		System.out.println("List should contain 15 25 35 45.");
		displayList(singly);
		System.out.println("\ttime: " + resultTime);
		System.out.println("");

		// test Doubly Linked List
		startTime = System.nanoTime();
		System.out.println("Create an empty list.");
		ListInterface<String> doubly = new SinglyLinkedList<>();
		System.out.println("List should be empty; isEmpty returns " + singly.isEmpty() + ".");
		System.out.println("\nTesting add to end:");
		doubly.add("15");
		doubly.add("25");
		doubly.add("35");
		doubly.add("45");
		endTime = System.nanoTime();
		resultTime = endTime - startTime;
		System.out.println("List should contain 15 25 35 45.");
		displayList(doubly);
		System.out.println("\ttime: " + resultTime);
		System.out.println("");

	}

	public static void displayList(ListInterface<String> list) {
		System.out.println("The list contains " + list.getLength() + " entries, as follows:");
		Object[] listArray = list.toArray();
		for (int index = 0; index < listArray.length; index++) {
			System.out.print(listArray[index] + " ");
		}
		System.out.println();
	}

}
