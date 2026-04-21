
public class List {
	Node head=null;
	public void addNode(Node n) {
		if(head==null) {
			head=n;
		}else {
			Node t=head;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=n;
		}
	}
	public void traverseList() {
		// TODO Auto-generated method stub
		Node t=head;
		while(t!=null) {
			System.out.println(t.id + " " + t.name);
			t=t.next;
		}
	}
}
