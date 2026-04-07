public class AssigmentScore {

    int highestUTS(Assigment arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = highestUTS(arr, l, mid);
        int right = highestUTS(arr, mid + 1, r);

        if(left > right){
            return left;
        } else {
            return right;
        }
    }

    int lowestUTS(Assigment arr[], int l, int r){
        if(l == r){
            return arr[l].uts;
        }

        int mid = (l + r) / 2;

        int left = lowestUTS(arr, l, mid);
        int right = lowestUTS(arr, mid + 1, r);

        if(left < right){
            return left;
        } else {
            return right;
        }
    }

    double averageUAS(Assigment arr[]){
        int total = 0;

        for(int i = 0; i < arr.length; i++){
            total = total + arr[i].uas;
        }

        return (double) total / arr.length;
    }
}