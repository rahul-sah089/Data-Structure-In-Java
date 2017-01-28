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
		System.out.println("Final Length-->>" + length());

		System.out.println("End of linked list example");
	}
}
