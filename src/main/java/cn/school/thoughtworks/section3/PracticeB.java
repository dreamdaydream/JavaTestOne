package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> list = object.get("value");
        Map<String, Integer> result = new HashMap<String,Integer>();
        for (String key : collectionA.keySet()) {
            Integer count = collectionA.get(key);
            if (list.contains(key)){
                int times = count/3;
                count = collectionA.get(key)-times;
            }
            result.put(key,count);
        }
        return result;
    }
}
