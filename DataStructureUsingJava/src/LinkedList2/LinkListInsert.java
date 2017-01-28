package LinkedList2;

public class LinkListInsert {
	static Node head = null;

	public static Node getHead() {
		return head;
	}

	public static void insertAtBeginning(int value) {
		Node node = new Node();
		node.setInfo(value);
		if (head == null) {
			head = node;
			return;
		}
		node.setLink(head);
		head = node;
	}

	public static void insertAtEnd(int value) {
		Node node = new Node();
		node.setInfo(value);
		Node temp = head;
		if (temp == null) {
			head = node;
			return;
		}
		// traverse till end
		while (temp.getLink() != null) {
			temp = temp.getLink();
		}
		temp.setLink(node);
	}

	public static void insertAtIndex(int index, int value) {
		Node temp = head;
		Node insertedNode = new Node();
		insertedNode.setInfo(value);
		int tempIndex = 2;
		while (temp.getLink() != null && tempIndex != index) {
			System.out.println("Called");
			System.out.println("Index value-->" + index + " andd tempIndex-->"
					+ tempIndex);
			if (temp.getLink() == null) {
				System.out.println("Index not found");
				return;
			}
			tempIndex++;
			temp = temp.getLink();
		}
		// got into the index position
		insertedNode.setLink(temp.getLink());
		temp.setLink(insertedNode);
	}

	public static void traverse() {
		Node temp = head;
		System.out.println();
		if (head == null) {
			return;
		}
		while (temp.getLink() != null) {
			System.out.print("-->" + temp.getInfo());
			temp = temp.getLink();
		}
		System.out.print("-->" + temp.getInfo());
		System.out.println();
	}

	public static int length() {
		int length = 0;
		Node temp = head;
		if (temp == null) {
			return 0;
		}

		while (temp.getLink() != null) {
			length++;
			temp = temp.getLink();
		}
		length++;
		return length;
	}

	// remove from the head from the list
	public synchronized static void removeFromHead() {
		Node temp = head;
		if (head == null) {
			System.out.println("No element to delete");
			return;
		} else if (head != null) {
			head = temp.getLink();
			temp.setLink(null);
		}
	}

	public synchronized static void removeFromEnd() {
		Node temp = head;
		Node prev = new Node();
		while (temp.getLink() != null) {
			prev = temp;
			temp = temp.getLink();
		}
		prev.setLink(null);
	}

	public synchronized static void removeFromPosition(int index) {
		if (index < 0) {
			index = 0;
		}
		if (index >= length()) {
			index = length() - 1;
		}

		if (head == null) {
			return;
		}

		if (index == 0) {
			head = head.getLink();
		}

		else {
			Node temp = head;
			for (int i = 0; i < index; i++) {
				temp = temp.getLink();
			}
			temp.setLink(temp.getLink().getLink());
		}
	}

	public static void main(String[] args) {
		System.out.println("Start of linked list example");
		System.out.println("Initial Length-->>" + length());

		insertAtBeginning(1);
		insertAtBeginning(2);
		insertAtBeginning(3);
		insertAtBeginning(4);
		insertAtBeginning(5);
		traverse();
		System.out.println("Modified Length-->>" + length());

		insertAtIndex(2, 10);
		traverse();

		insertAtEnd(1);
		insertAtEnd(2);
		insertAtEnd(3);
		insertAtEnd(4);
		insertAtEnd(5);
		traverse();
		// remove from end
		System.out.println("Removed from the head");
		removeFromHead();
		traverse();
		System.out.println("Removed from the beginning");
		removeFromEnd();
		traverse();
		System.out.println("Remove from position 3");
		removeFromPosition(3);
		traverse();

		System.out.println("End of linked list example");
	}
}
