public class DoubleLinkedLists {
    Node head;
    Node tail;

    DoubleLinkedLists(){
            head = null;
            tail = null;
        }
        boolean isEmpty(){
                return head==null;
            }
        void addFirst(Student data){
                Node newNode = new Node(data);  
                if(isEmpty()){
                    head = tail = newNode;
                }else{
        newNode.next = head;
                    head.prev = newNode;
                    head = newNode;
                }
            }
        void addLast(Student data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            }
        }
        void insertAfter(String key, Student data){
            Node newNode = new Node(data);
            Node temp = head;
            boolean found = false;
                while(temp!=null){
                    if(temp.data.nim.equalsIgnoreCase(key)){
                        found = true;
                    if(temp == tail){
                            addLast(data);
                    }else{
                            newNode.next = temp.next;
                            newNode.prev = temp;
                            temp.next.prev = newNode;
                            temp.next = newNode;
                    }
                    break;
                    }
                    temp = temp.next;
                }
                if(!found){
                System.out.println("Insertion failed. Data ("+key+") not found!!");
                }
            }
        void print(){
            if(!isEmpty()){
                Node temp = head;
                while(temp!=null){
                    temp.data.print();
                    temp = temp.next;
                }
                System.out.println("");
            }else{
                System.out.println("Double linked list is currently empty!!");
            }
        }
        void removeFirst(){
            if(isEmpty()){
                System.out.println("Double linked list is currently empty!!");
            }else if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
        }
        void removeLast(){
        if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
        }else if(head == tail){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }
        void remove(int index){
            if(isEmpty()){
                System.out.println("Double linked list is currently empty!!");
                }else if(index < 0){
                System.out.println("Index cannot be negative!");
            }else if(index == 0){
                removeFirst();
            }else{
                Node temp = head;
                int count = 0;
                while(temp != null && count < index){
                temp = temp.next;
                count++;
                }if(temp == null){
                System.out.println("Index exceeds linked list size!");
                }else if(temp == tail){
                    removeLast();
                }else{
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
        }
    }   
        void add(int index, Student data){
        if(index < 0){
            System.out.println("Index cannot be negative!");
        }else if(index == 0){
            addFirst(data);
        }else{
            Node temp = head;
            int count = 0;

            while(temp != null && count < index - 1){
                temp = temp.next;
                count++;
            }

            if(temp == null){
                System.out.println("Index exceeds linked list size!");
            }else if(temp == tail){
                addLast(data);
            }else{
                Node newNode = new Node(data);

                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }
    }
        void removeAfter(String key){
        Node temp = head;

        while(temp != null){
            if(temp.data.nim.equalsIgnoreCase(key)){
                if(temp.next == null){
                    System.out.println("There is no node after this key!");
                }else if(temp.next == tail){
                    removeLast();
                }else{
                    temp.next = temp.next.next;
                    temp.next.prev = temp;
                }
                return;
            }

            temp = temp.next;
        }

        System.out.println("Key not found!");
    }
        Student getFirst(){
        return head.data;
    }
        Student getLast(){
        return tail.data;
    }
        Student getIndex(int index){
        Node temp = head;

        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp.data;
    }
        int getSize(){
        int size = 0;
        Node temp = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }
        int indexOf(String key){
        Node temp = head;
        int index = 0;

        while(temp != null){
            if(temp.data.nim.equalsIgnoreCase(key)){
                return index;
            }

            temp = temp.next;
            index++;
        }

        return -1;
    }
}