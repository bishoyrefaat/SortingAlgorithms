public class QuickSort extends SortingAlg {



    public void sort(int arr[],int a , int b) {   //b=size-1;
      //  System.out.println("quick checkpoint");
        if (a < b) {
            int partitionPoint = partition(arr, a, b);

            sort(arr, a, partitionPoint-1);
            sort(arr, partitionPoint+1, b);
        } }


// let pivot be the last elem of the partition move all smaller elems to left while using i to determine the point to distinguish them , when done swap a+1 with pivot
    int partition(int arr[], int a, int b)
    {
        int pivot = arr[b],temp;
        int i =a-1;
        for (int j=a; j<b; j++) {
            if (arr[j] < pivot) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } }

         temp = arr[i+1];
        arr[i+1] = arr[b];
        arr[b] = temp;

        return i+1;
    }







}
