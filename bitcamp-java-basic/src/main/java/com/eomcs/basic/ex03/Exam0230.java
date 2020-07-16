// Exam0230.java
// 주제 : 메모리 크기에 따른 표기법

package com.eomcs.basic.ex03;

class Exam0230 {
    public static void main(String[] args){
        // 출력 명령문
        // - System.out.println(값);

        // 자바 기본 정수갑을 저장하는 메모리 크기 : int(4byte)
        System.out.println(21_4748_3647);
        //System.out.println(21_4748_3648);
        System.out.println(-21_4748_3647);
        //System.out.println(-21_4748_3649);

        // long(8byte) 메모리를 사용하는 정수 리터럴
        System.out.println(21_4748_3648L);
        System.out.println(-21_4748_3649l);

        System.out.println(1); // 4byte 메모리를 사용하는 1
        System.out.println(1L); // 8byte 메모리를 사용하는 1

        System.out.println(Integer.MAX_VALUE); // 4byte 정수 최대 값
        System.out.println(Integer.MIN_VALUE); // 4byte 정수 최소 값

        System.out.println(Long.MAX_VALUE); // 8byte 정수 최대 값
        System.out.println(Long.MIN_VALUE); // 8byte 정수 최소 값
    }
}