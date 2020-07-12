import java.util.*;
public class BubbleSort extends SortingAlg {



    public void sort(int arr[],int a , int b)
    {   //b=size-1;
        boolean sorted=false;
        int temp;
        for (int i = 0; i < b&&!sorted; i++){
            sorted=true;
            for (int j = 0; j < b-i; j++){
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted=false;
                }}}
    }




}
