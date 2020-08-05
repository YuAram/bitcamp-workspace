package com.eomcs.util;

public class CalculatorOld {

  // 클래스를 Method Area에 로딩할 때 static 영역에 변수를 따로 생성한다.
  // => Heap에 생성되는 것이 아니다.

  // result 변수는 각 계산 마다 개별적으로 관리해야 한다.
  // => non-static 변수로 선언하라!
  // => non-static 변수는 new 연산자를 통해서만 만들 수 있다.
  // => non-static 변수는 Heap 영역에 생성된다.

  public int result = 0;

  // static 메서드는 non-static 변수를 사용할 수 없다.
  // 사용하려면 new 명령을 통해 생성된 메모리의 주소를 알아야 한다.

  // non-static 메서드(인스턴스 메서드)는
  // 인스턴스 주소를 받는 this 라는 빌트인 변수가 있다

  public void plus(int value) {
    this.result += value;
  }

  public void minus(int value) {
    this.result -= value;
  }

  public void multiple(int value) {
    this.result *= value;
  }

  public void divide(int value) {
    this.result /= value;
  }
}
