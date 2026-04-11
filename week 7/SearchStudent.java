public class SearchStudent {

    Students[] listStd;
    int idx = 0;

    SearchStudent(int jumlah) {
        listStd = new Students[jumlah];
    }

    void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    void display() {
        System.out.println("\nEntire Student Data");

        for (int i = 0; i < idx; i++) {
            System.out.println("NIM = " + listStd[i].nim);
            System.out.println("Name = " + listStd[i].name);
            System.out.println("Age = " + listStd[i].age);
            System.out.println("GPA = " + listStd[i].gpa);
            System.out.println("-------------------------");
        }
    }

    int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < idx; i++) {
            if (listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (cari == listStd[mid].nim) {
                return mid;
            } else if (listStd[mid].nim < cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index-" + pos);
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM      : " + listStd[pos].nim);
            System.out.println("Name     : " + listStd[pos].name);
            System.out.println("Age      : " + listStd[pos].age);
            System.out.println("GPA      : " + listStd[pos].gpa);
        }
    }
}