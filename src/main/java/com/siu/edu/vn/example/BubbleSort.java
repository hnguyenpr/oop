package com.siu.edu.vn.example;

public class BubbleSort implements Sort {

  public int[] sort(int[] input) {
    int n = input.length;
    for (int i = 0; i< n ; i++) {
      for (int j = i; j< n ; j++) {
        if (input[i] > input[j]) {
          int temp = input[j];
          input[j] = input[i];
          input[i] = temp;
        }
      }
    }
    return input;
  }
}
