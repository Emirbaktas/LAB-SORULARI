public class LinkedList {
	Node head;

	// Listeye yeni eleman ekleme
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	// Listeyi yazdırma
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	// --- 1. FONKSİYON: İki Index'i Takas Etme ---
	public void swapNodesAtIndices(int index1, int index2) {
		if (index1 == index2)
			return;

		Node prev1 = null, curr1 = head;
		Node prev2 = null, curr2 = head;

		for (int i = 0; curr1 != null && i < index1; i++) {
			prev1 = curr1;
			curr1 = curr1.next;
		}

		for (int i = 0; curr2 != null && i < index2; i++) {
			prev2 = curr2;
			curr2 = curr2.next;
		}

		if (curr1 == null || curr2 == null)
			return;

		if (prev1 != null)
			prev1.next = curr2;
		else
			head = curr2;

		if (prev2 != null)
			prev2.next = curr1;
		else
			head = curr1;

		Node temp = curr1.next;
		curr1.next = curr2.next;
		curr2.next = temp;
	}

	// --- 2. FONKSİYON: Belirli İki Index Arasında Inversion (Tersine Çevirme) ---
	public void reverseBetweenIndices(int startIndex, int endIndex) {
		if (startIndex >= endIndex || head == null)
			return;

		Node dummy = new Node(0);
		dummy.next = head;
		Node prevStart = dummy;

		for (int i = 0; i < startIndex; i++) {
			if (prevStart.next == null)
				return;
			prevStart = prevStart.next;
		}

		Node sublistTail = prevStart.next;
		if (sublistTail == null)
			return;

		Node current = sublistTail;
		Node prev = null;

		for (int i = 0; i <= (endIndex - startIndex); i++) {
			if (current == null)
				break;

			Node nextTemp = current.next;
			current.next = prev;
			prev = current;
			current = nextTemp;
		}

		prevStart.next = prev;
		sublistTail.next = current;
		head = dummy.next;
	}
	
	public void eliminateDuplicates() {
        if (head == null || head.next == null) return;

        Node current = head; 

        while (current != null) {
            Node runner = current; 

            while (runner.next != null) {
                // Eğer ilerideki düğüm, current ile aynı değere sahipse
                if (runner.next.data == current.data) {
                    // Sadece aradan çıkarıyoruz. Tail olmadığı için ekstra kontrol yok!
                    runner.next = runner.next.next;
                } else {
                    // Değerler aynı değilse normal şekilde ilerle
                    runner = runner.next;
                }
            }
            // Mevcut düğümün tüm kopyaları silindi, sıradaki asıl düğüme geç
            current = current.next;
        }
    }

	// --- 3. YENİ FONKSİYON: Belirli İki Index Arasından Yeni Liste Oluşturma ---
	public LinkedList extractSublist(int startIndex, int endIndex) {
		LinkedList newList = new LinkedList();

		// Mantıksız index girişlerini veya boş listeyi kontrol et
		if (startIndex > endIndex || startIndex < 0 || head == null) {
			System.out.println("Hatalı index aralığı!");
			return newList; // Boş liste döner
		}

		Node current = head;
		int currentIndex = 0;

		// 1. Adım: startIndex'e kadar ilerle
		while (current != null && currentIndex < startIndex) {
			current = current.next;
			currentIndex++;
		}

		// 2. Adım: startIndex ile endIndex arasındaki düğümleri yeni listeye ekle
		while (current != null && currentIndex <= endIndex) {
			newList.add(current.data); // Yeni listeye ekleme yapılıyor (yeni node oluşturulur)
			current = current.next;
			currentIndex++;
		}

		return newList;
	}
}