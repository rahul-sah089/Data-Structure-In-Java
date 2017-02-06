package linkList1;

public class LinkListSimple {

	public static void main(String[] args) throws Exception {
		// create node
		// 1) Creating head node
		Node head = new Node();
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();

		// storing data in info field
		head.setInfo(1);
		node1.setInfo(2);
		node2.setInfo(3);
		node3.setInfo(4);
		node4.setInfo(5);

		// set the pointer head link to node1
		head.setLink(node1);
		// set the node1 link to node2
		node1.setLink(node2);
		// set the node2 link to node3
		node2.setLink(node3);
		// set the node3 link to node4
		node3.setLink(node4);
		System.out.println("Printing the list using method1");
		iterateList(head);
		System.out.println();
		System.out.println("Printing the list using method2");
		printData(head);
		System.out.println();
		System.out.println("Printing the list using method3");
		printReverse(head);
		// reversing the list
		// head = reverse(head);
		System.out.println();
		printData(head);
		printLastNth(2, head);

	}

	public static void printLastNth(int n, Node head) throws Exception {
		System.out.println();
		System.out.println("Printing the Nth last element from the list");
		Node currentNode = head;
		Node auxNode = head;

		for (int i = 0; i < n; i++) {
			currentNode = currentNode.getLink();
			if (currentNode == null) {
				throw new Exception();
			}
		}

		while (currentNode.getLink() != null) {
			currentNode = currentNode.getLink();
			auxNode = auxNode.getLink();
		}
		System.out.println("Node value==>" + auxNode.getInfo());
	}

	public static void iterateList(Node head) {
		Node temp = head;
		while (temp.getLink() != null) {
			System.out.print("-->" + temp.getInfo());
			// System.out.println("-->" + temp.getLink());
			temp = temp.getLink();
		}
		System.out.print("-->" + temp.getInfo());
	}

	// print the list using recursion
	public static void printData(Node head) {
		Node temp = head;
		if (head == null) {
			return;
		}
		System.out.print("-->" + temp.getInfo());
		printData(head.getLink());

	}

	public static void printReverse(Node head) {
		if (head == null) {
			return;
		}
		printReverse(head.getLink());
		System.out.print("-->" + head.getInfo());
	}

	public static Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.getLink();
			current.setLink(prev);
			prev = current;
			current = next;
		}
		head = prev;
		current = next;
		return head;
	}
}
