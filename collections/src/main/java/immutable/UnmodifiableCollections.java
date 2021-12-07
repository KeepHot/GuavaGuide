package immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * @author KevinLiu
 */
@Slf4j
public class UnmodifiableCollections {
    public static void main(String[] args) {
        /*
        JDK自带的unmodifiableXXX
         */
        List<String>  originalList = new ArrayList<>();
        originalList.add("a");
        originalList.add("b");
        originalList.add("c");

        List<String> unmodifiableList = Collections.unmodifiableList(originalList);
        log.info(unmodifiableList.toString());

        List<String> unmodifiableByAsList = Collections.unmodifiableList(
                Arrays.asList("a", "b", "c"));
        log.info(unmodifiableByAsList.toString());

        /*
        在原集合添加一个元素，不可变集合也发生变化
         */
        originalList.add("d");
        log.info(unmodifiableList.toString());
        log.info(originalList.toString());

        /*
        不可变集合不可以修改集合数据,会出错
         */
//        unmodifiableList.add("e");
//        unmodifiableByAsList.add("e");
    }
}
