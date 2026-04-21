// Hem sayılarımızı hem de Stack'imizi oluştururken kullanacağımız temel Düğüm sınıfı


// 1. ADIM: Kendi Stack Veri Yapımızı Linked List ile İnşa Ediyoruz


// 2. ADIM: Kendi Stack'imizi Kullanarak Problemi Çözüyoruz
public class Main {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Java'nın kendi Stack'i yerine YENİ YAZDIĞIMIZ CustomStack'i kullanıyoruz
        CustomStack stack1 = new CustomStack();
        CustomStack stack2 = new CustomStack();

        // 1. Liste elemanlarını Stack'e doldur
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        // 2. Liste elemanlarını Stack'e doldur
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null; 
        int carry = 0;        

        // Stack'lerden biri dolu olduğu sürece veya elde (carry) kaldığı sürece dön
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int sum = carry; 
            
            if (!stack1.isEmpty()) {
                sum += stack1.pop(); // Kendi yazdığımız pop() metodunu çağırıyoruz
            }
            
            if (!stack2.isEmpty()) {
                sum += stack2.pop();
            }
            
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;
            
            // Sonuç listesini sondan başa doğru (en başa ekleyerek) örüyoruz
            newNode.next = head;
            head = newNode;
        }

        return head;
    }

    // Listeyi okunaklı yazdırmak için yardımcı fonksiyon
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Liste 1: 7 -> 2 -> 4 -> 3 (7243)
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        // Liste 2: 5 -> 6 -> 4 (564)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.print("1. Sayı (Liste 1): ");
        printList(l1);
        
        System.out.print("2. Sayı (Liste 2): ");
        printList(l2);

        System.out.println("-------------------------");

        // Toplama işlemini yap
        ListNode result = addTwoNumbers(l1, l2);
        
        System.out.print("Toplam Sonucu:     ");
        printList(result);
        // Beklenen Çıktı: 7 -> 8 -> 0 -> 7
    }
}