package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> collection3 = new HashMap<>();
        for (String value:collectionA){
            int add = 1;
            char valuelast = value.charAt(0);
            if (value.length()>1){
                add = Integer.valueOf(String.valueOf(value.charAt(value.length()-1)));
            }
            if (collection3.containsKey(String.valueOf(valuelast))){
                int count = collection3.get(String.valueOf(valuelast));
                collection3.put(String.valueOf(valuelast),count+add);
            }
            else{
                collection3.put(String.valueOf(valuelast),add);
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
