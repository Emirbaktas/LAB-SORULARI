public class CustomStack {
    private ListNode top; // Stack'in en üstündeki elemanı (Linked List'in Head'i) tutar

    public CustomStack() {
        this.top = null;
    }

    // Stack'e eleman ekleme (Linked List'in EN BAŞINA ekleriz)
    public void push(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = top;
        top = newNode;
    }

    // Stack'ten eleman çıkarma (Linked List'in EN BAŞINDAKİ elemanı alıp sileriz)
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack boş, pop işlemi yapılamaz!");
        }
        int val = top.val;  // En üstteki değeri al
        top = top.next;     // Top işaretçisini bir sonrakine kaydır (ilk düğümü sil)
        return val;
    }

    // Stack boş mu kontrolü
    public boolean isEmpty() {
        return top == null;
    }
}