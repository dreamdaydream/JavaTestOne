package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collection3 = new HashMap<>();
        for (String value:collectionA){
            if (collection3.containsKey(value)){
                int count = collection3.get(value);
                collection3.put(value,count+1);
            }
            else{
               collection3.put(value,1);
            }
        }
        List<String> list = object.get("value");
        Map<String, Integer> result = new HashMap<String,Integer>();
        for (String key : collection3.keySet()) {
            Integer count = collection3.get(key);
            if (list.contains(key)){
                int times = count/3;
                count = collection3.get(key)-times;
            }
            result.put(key,count);
        }
        return result;
    }
}
