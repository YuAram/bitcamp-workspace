package com.eomcs.algorithm.data_structure.array;

import java.util.ArrayList;
import com.eomcs.corelib.ex03.MyArrayList;

public class MyArrayListTest5 {

  public static void main(String[] args) {
    // aaa,bbb,ccc,ddd,eee
    MyArrayList list1 = new MyArrayList(100);
    list1.add("aaa");
    list1.add("bbb");
    list1.add("ccc");
    list1.add("ddd");
    list1.add("eee");
    list1.add("fff");
    list1.add("ggg");
    print(list1);


    System.out.println("------------------------");
  }

  static void print(ArrayList list) {
    for (int i = 0; i < list.size(); i++) {
      String str = (String) list.get(i);
      System.out.print(str + ",");
    }
    System.out.println();
  }
}
