import java.util.*;
    public class InsertionSort extends SortingAlg {



        public void sort(int arr[],int a , int b) {   //b=size-1;
            int j ;
            for (int i = 1; i < b+1; i++) {
                int temp=arr[i];
                for (j = i; j>0&&temp<arr[j-1]; j--)
                        arr[j] = arr[j - 1];
                        arr[j] = temp;
            }
            //System.out.println("insertion checkpoint");
        }




    }





