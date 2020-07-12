import java.util.*;
public class MergeSort extends SortingAlg {


    public void sort(int arr[],int a , int b)
    {
        if(a<b){
            int m= (a+b)/2;
            sort(arr,a,m);
            sort(arr,m+1,b);
            merge(arr,a,m,b);

        }
    }

//determine the start of each part and select the smallest to be moved to a new array untill one is finished and then move any left then move back to the original array
    public void merge(int arr[],int a ,int m, int b)
    {
        int temp[] = new int [(b+1)-a];
        int f1=a,f2=m+1,i=a;
        while((f1<=m)&&(f2<=b)) {

            if (arr[f1] < arr[f2]) {
                temp[i-a] = arr[f1];
                f1++;
            }else{
                temp[i-a]=arr[f2];
                ++f2;
            }
            i++;
        }

        for (;f1 <= m; ++f1, ++i)
            temp[i-a] = arr[f1];
        for (;f2 <= b; ++f2, ++i)
            temp[i-a] = arr[f2];

        for(int j=a;j<=b;++j)
            arr[j]=temp[j-a];

    }




}
