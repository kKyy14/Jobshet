public class ExcuseLetterStack08 {
    ExcuseLetter08[] stack;
    int top, size;

    ExcuseLetterStack08(int size){
        this.size = size;
        top = -1;
        stack = new ExcuseLetter08[size];
    }

    boolean isFull(){
        return top == size - 1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    void push(ExcuseLetter08 data){
        if(!isFull()){
            top++;
            stack[top] = data;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    ExcuseLetter08 pop(){
        if(!isEmpty()){
            ExcuseLetter08 data = stack[top];
            top--;
            return data;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    ExcuseLetter08 peek(){
        if(!isEmpty()){
            return stack[top];
        } else {
            System.out.println("Tidak ada data.");
            return null;
        }
    }

    void search(String name){
        boolean ditemukan = false;

        for(int i = 0; i <= top; i++){
            if(stack[i].name.equalsIgnoreCase(name)){
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].id);
                System.out.println("Nama: " + stack[i].name);
                System.out.println("Kelas: " + stack[i].className);
                System.out.println("Jenis: " + stack[i].typeOfExcuse);
                System.out.println("Durasi: " + stack[i].duration + " hari");
                ditemukan = true;
                break;
            }
        }

        if(!ditemukan){
            System.out.println("Surat tidak ditemukan.");
        }
    }
}