package collect.multiset;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;

/**
 * @author KevinLiu
 */
@Slf4j
public class MultisetTest {
    public static void main(String[] args) {

        /*
        传统的统计list的重复次数
         */
        List<String> words = Lists.newArrayList("a", "b", "c", "b", "b", "c");
        Map<String, Integer> counts = new HashMap<>(8);
        for (String word : words) {
            Integer count = counts.get(word);
            if (count == null) {
                counts.put(word, 1);
            } else {
                counts.put(word, count + 1);
            }
        }
        //output = {a=1, b=3, c=2}
    }
}
