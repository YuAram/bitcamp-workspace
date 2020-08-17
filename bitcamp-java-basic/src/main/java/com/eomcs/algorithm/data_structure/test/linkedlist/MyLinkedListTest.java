package com.eomcs.algorithm.data_structure.test.linkedlist;


public class MyLinkedListTest {
  public static void main(String[] args) {
    MyLinkedList list = new MyLinkedList();
    list.add("aaa");
    list.add("bbb");
    list.add(1, "ccc");

    print(list);


  }

  static void print(MyLinkedList list) {
    for (int i = 0; i < list.size; i++) {
      System.out.print(list.get(i) + ",");
    }
    System.out.println();
  }
}
