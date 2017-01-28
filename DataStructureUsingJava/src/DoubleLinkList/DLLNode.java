package DoubleLinkList;

public class DLLNode {
	int info;
	DLLNode prevNode;
	DLLNode nextNode;

	private DLLNode(int data) {
		this.info = data;
		this.prevNode = null;
		this.nextNode = null;
	}

	private DLLNode(int data, DLLNode prevNode, DLLNode nextNode) {
		this.info = data;
		this.prevNode = prevNode;
		this.nextNode = nextNode;
	}

}
