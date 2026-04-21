
public class Main {
	public static void main(String[] args) {
		System.out.println("DATA NODE EXAMPLE");
		
		List list = new List();
		
		Data d = new Data(1,"STRING1");
		Node n = new Node(d);
		list.addNode(n);
		
		d = new Data(2,"STRING2");
		n = new Node(d);
		list.addNode(n);
		
		list.traverseList();
	}
}
