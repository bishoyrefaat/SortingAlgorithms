 import java.util.*;
import java.io.*;
import java.lang.*;

public class main {

    public static void main(String[] args) {



  /*      Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int test[]=new int[m];
        while(i<m){ test[i]=s.nextInt(); i++;}*/
       /* Random random = new Random();
        for(int i =0; i<10000; i++){
            int randomInteger = random.nextInt(6400)-3200;
            System.out.println(randomInteger);
        }*/




        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(2);
        list.add(new ArrayList<Integer>()) ;
        list.add(new ArrayList<Integer>()) ;

        try {
        Scanner scanner = new Scanner(new File("random10k.txt"));//name of the 1st file to read
        while(scanner.hasNextInt()){
            list.get(0).add ( scanner.nextInt()); }
        scanner = new Scanner(new File("random10k.txt"));//name of the 2nd file to read
        while(scanner.hasNextInt()){
            list.get(1).add ( scanner.nextInt()); }
        } catch (FileNotFoundException ex){
            System.out.println("ERROR CANT READ FILE"); }


        SortingAlg obj[]=new SortingAlg[5];
        obj[0]=new BubbleSort();
        obj[1]=new InsertionSort();
        obj[2]=new MergeSort();
        obj[3]=new QuickSort();
        obj[4]=new HeapSort();



        long start,time;
        String[] algName={"BUBBLE SORT" ,"INSERTION SORT","MERGE SORT","QUICK SORT" ,"HEAP SORT"};
        int size,flag=0;
        int[] arr;
        int[][] temp=new int[2][];

        //loop to send a copy of the array in each file to each of the 5 sorting algorthims and repeat for the 2nd file while calculating and printing sorting time
        for(int k=0;k<2;k++){
            System.out.println("================= sorting file " + (k+1) +" =================");
            size=list.get(k).size();
            System.out.println("size= " + size );
        for(int j=0;j<5;j++) {
           arr=copyAlistToA(list.get(k));
           System.out.print(algName[j]+" ");

            start = System.nanoTime();
            obj[j].sort(arr,0,size-1);
            time = System.nanoTime() - start;
            // print(arr);
            System.out.print("  time= "+((double)time/1000000)+" milli second\n");


        // if(!(Arrays.equals(arr, temp[k])||j<1)) flag=1;
           if(j==4){
            temp[k]=new int[size] ;
              System.arraycopy(arr,0, temp[k],0 , size);}
        } }


        System.out.println("==================================================");
        // if(flag==1) System.out.println("error detected");

        /*printA(list.get(0));
        printA(list.get(1));
        print(temp[0]);
        print(temp[1]);*/

        checkEqual(temp[1],temp[0]);
        System.out.println("==================================================");


        System.out.println("press 1 to Print sorted files");
        int sel;
        Scanner s=new Scanner(System.in);
        sel=s.nextInt();
        if(sel==1){
        print(temp[0]);
        System.out.println();
        print(temp[1]);}

    }







    public static void checkEqual(int[] arr1, int[] arr2)
    {
        if(Arrays.equals(arr1, arr2))
        System.out.println("The 2 arrays are idenetical ");
        else
        System.out.println("The 2 arrays are NOT idenetical ");
    }




    public static void printA(ArrayList<Integer> arr)
    {
        for (Integer num : arr)
            System.out.print(num+" ");

        System.out.println();
    }




    public static void print(int[] arr)
    {

        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }





    public static int[] copyAlistToA(ArrayList<Integer> list)
    {  int arr[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = (int)list.get(i);
        }

        return arr;
    }






}

