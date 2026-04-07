public class TopStudent08 {
    Student08[] listStudent;
    int idx;

    public TopStudent08(int size) {
        listStudent = new Student08[size];
    }

    public void add(Student08 student) {
        if (idx < listStudent.length) {
            listStudent[idx] = student;
            idx++;
        } else {
            System.out.println("list is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudent[i].print();
        }
    }

    // Bubble Sort (descending)
    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listStudent[j].gpa < listStudent[j + 1].gpa) {
                    Student08 temp = listStudent[j];
                    listStudent[j] = listStudent[j + 1];
                    listStudent[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort (ascending)
    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudent[j].gpa < listStudent[minIndex].gpa) {
                    minIndex = j;
                }
            }
            Student08 temp = listStudent[minIndex];
            listStudent[minIndex] = listStudent[i];
            listStudent[i] = temp;
        }
    }
            public void insertionSort() {
            for (int i = 1; i < idx; i++) {
                Student08 temp = listStudent[i];
                int j = i - 1;

                while (j >= 0 && listStudent[j].gpa > temp.gpa) {
                    listStudent[j + 1] = listStudent[j];
                    j--;
                }
                listStudent[j + 1] = temp;
            }
        }
}