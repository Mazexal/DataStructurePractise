package CP5;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by 10235 on 2017/7/23.
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (strs == null) return result;
// one key to multiple value multiMap
        Map<String, ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();
        for (String str : strs) {
            char[] strChar = str.toCharArray();
            Arrays.sort(strChar);
            String strSorted = String.valueOf(strChar);
            if (multiMap.containsKey(strSorted)) {
                ArrayList<String> aList = multiMap.get(strSorted);
                aList.add(str);
                multiMap.put(strSorted, aList);
            } else {
                ArrayList<String> aList = new ArrayList<String>();
                aList.add(str);
                multiMap.put(strSorted, aList);
            }
        } // add List group to result
        Set<String> keySet = multiMap.keySet();
        for (String key : keySet) {
            ArrayList<String> aList = multiMap.get(key);
            Collections.sort(aList);
            result.add(aList);
        }
        return result;
    }
}