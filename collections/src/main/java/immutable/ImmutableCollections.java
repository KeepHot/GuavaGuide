package immutable;

import java.util.*;

import com.google.common.collect.ImmutableSet;
import common.Person;
import lombok.extern.slf4j.Slf4j;

/**
 * @author KevinLiu
 */
@Slf4j
public class ImmutableCollections {

    public static void main(String[] args) {

        /*
          common
         */
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("aa", 2));
        personSet.add(new Person("bb", 3));
        personSet.add(new Person("cc", 4));

        /*
          1.of方法
         */
        ImmutableSet<Person> immutableSetByOf = ImmutableSet.copyOf(personSet);
        log.info(immutableSetByOf.toString());
        /*
          2.CopyOf方法
         */
        Set<String> immutableSetByCopyOf = ImmutableSet.of("a", "b", "c");
        log.info(immutableSetByCopyOf.toString());
        /*
          3.Build
         */
        ImmutableSet<Person> immutableSetByBuild = ImmutableSet.<Person>builder().
                add(new Person("aa", 3)).
                addAll(personSet).build();
        log.info(immutableSetByBuild.toString());
        /*
        访问 ImmutableSet
         */
        Iterator<Person> personIterator = immutableSetByBuild.stream().iterator();
        while (personIterator.hasNext()) {
            log.info(personIterator.next().toString());
        }

    }
}
