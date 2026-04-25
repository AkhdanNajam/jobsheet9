public class StackSurat02 {
    private Surat02[] stack;
    private int top;
    private int size;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak dapat menerima surat baru.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 surat = stack[top];
            top--;
            return surat;
        }
        return null;
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    public boolean containsByNama(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}