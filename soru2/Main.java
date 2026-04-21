
public class Main {
	public static void main(String[] args) {
		System.out.println("DATA NODE EXAMPLE");
		
		List list = new List();
		
		Node n = new Node(1,"STRING1");
		list.addNode(n);
		
		n = new Node(2,"STRING2");
		list.addNode(n);
		
		list.traverseList();
	}
}
