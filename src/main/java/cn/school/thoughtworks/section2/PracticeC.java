package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap<String,Integer>();
        for(int i=0; i<collection1.size();i++){
            String key = collection1.get(i);
            int add = 1;
            char keylast = key.charAt(0);
            String  num = "";
            if (key.length()>1){
                for(int j=0;j<key.length();j++) {
                    if (key.charAt(j) >= 48 && key.charAt(j) <= 57) {
                        num += String.valueOf(key.charAt(j));
                        add = Integer.valueOf(num);
                    }
                }
            }
            if (result.containsKey(String.valueOf(keylast))){
                int count = result.get(String.valueOf(keylast));
                result.put(String.valueOf(keylast),count+add);
            }
            else{
                result.put(String.valueOf(keylast),add);
            }
        }
        return result;
    }
}
