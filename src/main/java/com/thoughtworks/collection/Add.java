package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int temp;
        int sum =0;
        if (leftBorder > rightBorder) {
            temp = leftBorder;
            leftBorder = rightBorder;
            rightBorder = temp;
        }
        for (int i = leftBorder; i<=rightBorder; i++) {
            if(i % 2 ==0) sum += i;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map((num) -> num * 3 + 2 ).reduce(0,(a,b) -> a + b);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map((item) -> item % 2 == 0 ? item : item *3+2).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item%2 ==0).mapToDouble(item -> item).average().orElse(0);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0).distinct().collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
