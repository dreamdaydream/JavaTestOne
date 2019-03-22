package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap<String,Integer>();
        for(int i=0; i<collection1.size();i++){
            String key = collection1.get(i);
            if (result.containsKey(key)){
                int count = result.get(key);
                result.put(key,count+1);
            }
            else{
                result.put(key,1);
            }
        }
        return result;
    }
}
