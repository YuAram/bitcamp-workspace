package com.eomcs.corelib.ex01.test;

public class Exam0141 {
  static class My {
    String name;
    int age;

    @Override
    public int hashCode() {
      // String 클래스의 hashCode() 메서드는
      // 같은 문자열에 대해 같은 해시값을 리턴한다.
      // 이 능력을 이용하여 My 클래스의 인스턴스 해시값을 계산해보자.
      //
      String str = String.format("%s,%d", this.name, this.age);
      return str.hashCode();
    }
  }

  public static void main(String[] args) {
    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
    System.out.println("---------------------------------");
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1.hashCode() == s2.hashCode());
    System.out.println("---------------------------------");

    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1 == obj2);
    System.out.println(obj1.equals(obj2));

    System.out.println(Integer.toHexString(obj1.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj1);
    System.out.println(obj2);
  }
}
