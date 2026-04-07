public class LecturerData08 {
    Lecturer08[] lecturerData = new Lecturer08[10];
    int idx;

    public void add(Lecturer08 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    // Sort ASC (Bubble Sort)
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer08 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    // Sort DSC (Selection Sort)
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[max].age) {
                    max = j;
                }
            }
            Lecturer08 temp = lecturerData[max];
            lecturerData[max] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
}