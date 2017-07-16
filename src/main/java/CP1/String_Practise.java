package CP1;

/**
 * Created by 10235 on 2017/7/16.
 */
public class String_Practise {


    public static void main(String[] args)
    {
        String s1=new String();
        String s2="billryan";
        int s2Len=s2.length();
        s2.substring(4,8);
        StringBuilder s3=new StringBuilder(s2.substring(4,8));
        char[] s2char=s2.toCharArray();
        char ch=s2.charAt(2);
        int index= s1.indexOf('r');

    }

}
