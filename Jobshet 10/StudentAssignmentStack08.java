public class StudentAssignmentStack08 {
    Student08[] stack;
    int top, size;

    StudentAssignmentStack08(int size){
        this.size = size;
        top = -1;
        stack = new Student08[size];
    }

    boolean isFull(){
        if(top==size-1){
            return true;
        }else{
            return false;

    }
}

    boolean isEmpty(){
        if(top==-1){
            return true;
        }else{
            return false;

    }
}

    void push(Student08 std){
        if(!isFull()){
            top++;
            stack[top] = std;
        }else{
            System.out.println("Stack is already full!!");

        }
    }

    Student08 pop(){
        if(!isEmpty()){
            Student08 std = stack[top];
            top--;
            return std;
        }else{
            System.out.println("There is no data in Stack!!");
            return null;

        }
    }

    Student08 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("There is no data in Stack!!");
            return null;

        }
    }

    String convertToBinary(int grade){
        ConversionStack08 stack = new ConversionStack08();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }


    void print(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"
            +stack[i].className);
        }
        System.out.println("");

    }
}