package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> navigableSet = sourceList.stream().map(x -> x * x).collect(Collectors.toCollection(TreeSet::new));

        return navigableSet.subSet(lowerBound, upperBound + 1);
    }
}
