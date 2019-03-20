package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        Iterator it = collection1.iterator();
        List result = new ArrayList();
        while(it.hasNext()){
            String value = (String) it.next();
            if (collection2.contains(value)){
                result.add(value);
            }
        }
//        List<String> result = collection1.stream().filter(item -> collection2.contains(item)).collect(toList());
        return result;
    }
}
