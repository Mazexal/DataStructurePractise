package CP2Execute;

import CP2.SortUtil;

/**
 * Created by Mazexal on 2017/7/18.
 */
public class SortExecute {
    public  static void main(String[] args)
    {
        int unsortedArray[]=new int[]{6,5,3,1,8,7,2,4};
        
        bubbleSortExecute(unsortedArray);
    }


    //冒泡排序
    public  static void bubbleSortExecute(int unsortedArray[])
    {
        SortUtil.bubbleSort(unsortedArray);
        System.out.println("After sort: ");
        for(int item:unsortedArray){
            System.out.print(item+" ");
        }
    }

}
