public class DataDosen08 {

    // tampil semua data dosen
    void dataAllDosen(Dosen08[] arrayOfDosen) {
        for (Dosen08 d : arrayOfDosen) {
            d.printInfo();
        }
    }

    // jumlah dosen per gender
    void numberOfLecturersPerGender(Dosen08[] arrayOfDosen) {
        int male = 0, female = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.gender) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("Jumlah Dosen Laki-laki : " + male);
        System.out.println("Jumlah Dosen Perempuan : " + female);
    }

    // rata-rata umur 
    void averageAgeOfLecturersPerGender(Dosen08[] arrayOfDosen) {
        int totalMale = 0, totalFemale = 0;
        int countMale = 0, countFemale = 0;

        for (Dosen08 d : arrayOfDosen) {
            if (d.gender) {
                totalMale += d.age;
                countMale++;
            } else {
                totalFemale += d.age;
                countFemale++;
            }
        }

        double avgMale = (countMale == 0) ? 0 : (double) totalMale / countMale;
        double avgFemale = (countFemale == 0) ? 0 : (double) totalFemale / countFemale;

        System.out.println("Rata-rata Umur Dosen Laki-laki : " + avgMale);
        System.out.println("Rata-rata Umur Dosen Perempuan : " + avgFemale);
    }

    // dosen paling tua
    void infoDosenPalingTua(Dosen08[] arrayOfDosen) {
        Dosen08 tertua = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.age > tertua.age) {
                tertua = d;
            }
        }

        System.out.println("Data Dosen Paling Tua:");
        tertua.printInfo();
    }

    // dosen paling muda
    void infoDosenPalingMuda(Dosen08[] arrayOfDosen) {
        Dosen08 termuda = arrayOfDosen[0];

        for (Dosen08 d : arrayOfDosen) {
            if (d.age < termuda.age) {
                termuda = d;
            }
        }

        System.out.println("Data Dosen Paling Muda:");
        termuda.printInfo();
    }
}