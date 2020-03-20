package com.xlaser4j.refactor.chapter6.case9;

import java.util.Arrays;
import java.util.List;

/**
 * @package: com.xlaser4j.refactor.chapter6.case9
 * @author: Elijah.D
 * @time: 2020/3/20 17:18
 * @description:
 * @modified: Elijah.D
 */
public class SubstituteAlgorithm {
    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Elijah")) {
                return "Elijah";
            }
            if (people[i].equals("Martin")) {
                return "Martin";
            }
            if (people[i].equals("Kent")) {
                return "Kent";
            }
        }
        return "";
    }

    class SubstituteAlgorithmR {
        /**
         * 利用<b>Substitute Algorithm: 替换算法</b>重构
         *
         * @param people people
         * @return candidates
         */
        String foundPerson(String[] people) {
            List<String> candidates = Arrays.asList("Elijah", "Martin", "Kent");
            for (String person : people) {
                if (candidates.contains(person)) {
                    return person;
                }
            }
            return "";
        }
    }
}
