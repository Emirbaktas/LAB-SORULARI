public class Main {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// Listeyi dolduralım
		list.add(10); // Index 0
		list.add(20); // Index 1
		list.add(30); // Index 2
		list.add(40); // Index 3
		list.add(50); // Index 4
		list.add(60); // Index 5

		System.out.println("Orijinal Liste:");
		list.printList();

		System.out.println("\n--- INVERSION İŞLEMİ ---");
		System.out.println("Index 1 ile Index 4 arası tersine çevriliyor (20, 30, 40, 50)...");
		list.reverseBetweenIndices(1, 4);
		list.printList();

		System.out.println("\nIndex 0 ile Index 2 arası tersine çevriliyor (Head değişecek)...");
		list.reverseBetweenIndices(0, 2);
		list.printList();

		list.swapNodesAtIndices(0, 3);
		list.printList();

		// extractSublist fonksiyonu LinkedList objesi döndürdüğü için onu yeni bir
		// değişkene atıyoruz
		LinkedList subList = list.extractSublist(1, 4);

		System.out.print("Yeni Oluşturulan Liste: ");
		subList.printList();
		// Beklenen: 50 -> 60 -> 20 -> 40 -> null

		System.out.print("Orijinal Liste (Bozulmadı): ");
		list.printList();
		
		list.add(10);
		list.add(10);
		list.add(40);
		
		list.printList();
		
		list.eliminateDuplicates();
		
		list.printList();

	}
}