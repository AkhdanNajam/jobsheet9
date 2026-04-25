public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top;
    int size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa02 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak dapat menambah tugas lagi.");
        }
    }

    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 mhs = stack[top];
            top--;
            return mhs;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa02 bottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int count() {
        return top + 1;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        if (nilai == 0) {
            return "0";
        }
        StackKonversi02 stack = new StackKonversi02();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}