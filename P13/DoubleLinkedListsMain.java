public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I", 3.4));
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();
        dll.remove(-1);
        dll.remove(10);

        //Assigment
        
        dll.add(1, new Student("117", "Dicky", "TI-1I", 3.5));
        dll.print();
        dll.removeAfter("111");
        dll.print();
        System.out.println("Data pertama:");
        dll.getFirst().print();
        System.out.println("Data terakhir:");
        dll.getLast().print();
        System.out.println("Data index 1:");
        dll.getIndex(1).print();
        System.out.println("Jumlah data: " + dll.getSize());
        System.out.println("Index dari NIM 112: " + dll.indexOf("112"));
    }
}
