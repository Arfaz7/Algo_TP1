import java.util.ArrayList;

public class Main {

    public static void main(String[] args){


        int nbVals= 100000;
        int[] data= new int[nbVals];
        for(int i=0; i != data.length; ++i){
             data[i]= 2*i;
        }

        long startTime = System.currentTimeMillis();

        System.out.println(lowerBound(data, 3));

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Table Length " + nbVals + " == > Time: "+totalTime);

    }

         public static int indexOfOrdered(int[] data, int v){
         int res=lowerBound(data, v);
         if((res==data.length) || (data[res] != v)){
             res= -1;
             }
         return res;
         }
 // index of first element >= v
         public static int lowerBound(int[] data, int v){
         return lowerBound(data, v, 0, data.length);
         }

         public static int lowerBound(int[] data, int v, int begin, int end){
         if(begin == end){ return begin;}
         int m= (begin + end)/2;
         return data[m] < v ? lowerBound(data, v, m+1, end) : lowerBound(data, v, begin, m);
         }

         public static int lowerBoundTCO(int[] data, int v){
         int begin=0, end=data.length;
         while(begin != end){
             int m= (begin + end)/2;
             if(data[m] < v){
                 begin= m+1;
                 }
             else{
                 end= m;
                 }
             }
            return begin;
        }
}

    /*public static void main(String[] args) {

        final int SIZE = 1000000;
        final int MAX = 500;
        final int MIN = 0;

        int[] values = RandomData.generate1d(SIZE, MIN, MAX);


        // MINIMUM

        /*for (int i = 0; i < values.length; i++){

            System.out.println(values[i]);
        }

        System.out.println("\n");*/




        /*long startTime = System.currentTimeMillis();

        // System.out.println(findMinimun(values));     //FIND MINIMUM
        // selectionSort(values);                       //SELECTION SORT
        // bubbleSort(values);                          //BUBBLE SORT
        //mergeSort(values);                              //MERGE SORT
        quickSort(values);

        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.println("Table Length " + SIZE + " == > Time: "+totalTime);



        /*System.out.println("\n");
        for (int i = 0; i < values.length; i++){

            System.out.println(values[i]);
        }*/

    /*}

    // Complexity : n
    public static int findMinimun(int[] values) {

        int min = values[0];

        for(int i = 1; i < values.length; i++){

            min = values[i] < min ? values[i] : min;
        }

        return min;
    }

    public static int minimumIndex(int[] data, int begin, int end){
        int res= begin;
        for(int i=begin+1; i != end; ++i){
            if(data[i] < data[res]){
                res= i;
            }
        }
        return res;
    }

    // Complexity : O(1)
    public static void swap(int[] data, int i, int j){

        int tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

    public static void selectionSort(int[] data){

        if(data.length < 2){return;}

        for(int i=0; i != data.length-1; ++i){
            swap(data, i, minimumIndex(data, i, data.length));
        }

    }

    public static void bubbleSort(int[] data){
        if(data.length < 2){return;}
        boolean hadToSwap= false;
        do{
            hadToSwap=false;
            for(int i= 0; i != data.length-1; ++i){
                if(data[i] > data[i+1]){
                    swap(data, i, i+1);
                    hadToSwap= true;
                    } }
        }while(hadToSwap);
    }

    public static void mergeSort(int data[], int begin, int middle, int end){

        int[] tmp= new int[middle-begin];

        System.arraycopy(data, begin, tmp, 0, tmp.length);

        int i=0, j=middle, dest=begin;

        while((i< tmp.length) && (j<end)){
            data[dest++]= (tmp[i] < data[j]) ? tmp[i++] : data[j++] ;
        }
        while(i < tmp.length){
            data[dest++]= tmp[i++];
        }
    }

    public static void mergeSort(int[] data){
        mergeSort(data, 0, data.length);
    }

    public static void mergeSort(int[] data, int begin, int end){
        if((end-begin) < 2){return;}
            int middle= (end+begin)/2;
            mergeSort(data, begin, middle);
            mergeSort(data, middle, end);
            mergeSort(data, begin, middle, end);
    }

    public static int partition(int[] data, int begin, int end, int pivotIdx){
        swap(data, pivotIdx, --end);
        pivotIdx= end;
        int pivot= data[pivotIdx];
        //invariant is that everything before begin is known to be < pivot
        // and everything after end is known to be >= pivot
        while(begin != end){
            if(data[begin] >= pivot){
                swap(data, begin, --end);
            }else{
                ++begin;
            }
        }
        swap(data, pivotIdx, begin);
        return begin;
    }

    public static void quickSort(int[] data){
        quickSort(data, 0, data.length);
    }

    public static void quickSort(int[] data, int begin, int end){
        if((end-begin) < 2){ return; }
        int m= partition(data, begin, end, (end+begin)/2);
        quickSort(data, begin, m);
        quickSort(data, m+1, end); // +1 for convergence
    }
}*/
