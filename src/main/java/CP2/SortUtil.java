package CP2;

/**
 * Created by Mazexal on 2017/7/18.
 */
public class SortUtil {




    public static void bubbleSort(int[] array)
    {
        int len=array.length;
        for(int i=0;i<len;i++)
        {
            for (int item:array){
                System.out.print(item+" ");
            }
            System.out.println();
            for(int j=1;j<len;j++){
                if(array[j-1]>array[j]){
                    int tmp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=tmp;
                }
            }
        }

    }

}
