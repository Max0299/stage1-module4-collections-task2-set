package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
         HashSet<Integer> hashSet = new HashSet<>();

        for (int x : sourceList) {
            if (x % 2 != 0) {
                hashSet.add(x);
                hashSet.add(x * 2);
            }
            while (x % 2 == 0) {
                hashSet.add(x);
                hashSet.add(x /= 2);
            }
        }
        return hashSet;
    }
}
