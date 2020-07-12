public class HeapSort extends SortingAlg {

        public void sort(int arr[],int a , int b) {   //b=size-1;
            int size=b+1,temp ;

            for (int i = size/2-1 ;i>=0 ; i--)//constructing heap
                heapify(arr,size,i);

            for (int i = size-1; i>=0; i--)
                {temp=arr[0];
                arr[0]=arr[i];
                arr[i]=temp;

                heapify(arr,i,0);
                }//System.out.println("heap checkpoint");
        }


    // determine the biggest int between the node and its 2 childeren if a change occures heapify the changed child
    void heapify(int arr[], int size , int i)
    {
        int largest = i,lchild = 2*i + 1, rchild = 2*i + 2;

        if (lchild < size && arr[lchild] > arr[largest]) largest = lchild;
        if (rchild < size && arr[rchild] > arr[largest]) largest = rchild;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, size , largest);
        } }




}
