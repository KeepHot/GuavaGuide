package collect.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import common.Person;
import lombok.extern.slf4j.Slf4j;

/**
 * @author KevinLiu
 */
@Slf4j
public class CollectionsListTest {

    public static void main(String[] args) {
        /*
        推断范型的静态工厂方法,JDK7还不支持
         */
        List<Person> personList = Lists.newArrayList();
        log.info(personList.toString());

        /*
        JDK钻石操作符(<>)
         */
        List<Person> list = new ArrayList<>();
        log.info(list.toString());

        /*
        可以初始化的似时候指定元素
         */
        List<String> stringList = Lists.newArrayList("1", "2", "3");
        log.info(stringList.toString());

        /*
        集合初始化大小的可读性,如果确定容器装多少个，不会改变，一般直接使用newArrayListWithCapacity
        如果容器超过定义size，它会自动扩容，不用担心容量不够。扩容后，会将原来的数组复制到新的数组中
        但扩容会带来一定的性能影响：包括开辟新空间，copy数据，耗时，耗性能
         */
        List<String> arrayListWithCapacity = Lists.newArrayListWithCapacity(100);
        log.info(arrayListWithCapacity.toString());
        /*
        如果你的不确定你的容器多少个，但增幅不会太大，使用它
        会直接创建一个指定size的容器，但它会通过一条公式计算来进行扩容
        5L + (long)arraySize + (long)(arraySize / 10)
        创建一个10个size的容器，那么 5+10 + （10/10） = 16，当容器添加第17个数据时，这个容器才会进行扩容，优点：节约内存，节约时间，节约性能，
         */
        List<String>  arrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(100);
        log.info(arrayListWithExpectedSize.toString());
    }

}
