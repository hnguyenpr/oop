package com.siu.edu.vn.example;

import java.util.Arrays;

public class Test {
  public static void main(String[] args) {
    System.out.println("------------");
    System.out.println("Hello world!");
    int[] a = {1,5,3};
    System.out.println(Arrays.toString(Sorts.getSortAlgorithm().sort(a)));
  }
}
