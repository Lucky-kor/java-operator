package com.choongang.incrementDecrementOperator;

public class IncrementDecrementOperatorV3 {
    public static void main(String[] args) {
        // num1 변수를 선언하고 초기값 1을 할당합니다.
        int num1 = 1;

        // 전위 증가 연산자(++num1)를 사용합니다.
        // 이 연산자는 num1의 값을 먼저 1 증가시킨 후,
        // 증가된 값을 prefix 변수에 할당합니다.
        // 따라서, num1의 값이 먼저 2가 되고, 그 후 prefix 변수에도 2가 할당됩니다.
        int prefix = ++num1; // num1과 prefix 모두 2입니다.

        // num2 변수를 선언하고 초기값 1을 할당합니다.
        int num2 = 1;

        // 후위 증가 연산자(num2++)를 사용합니다.
        // 이 연산자는 num2의 현재 값을 postfix 변수에 할당한 후,
        // num2의 값을 1 증가시킵니다.
        // 따라서, postfix 변수에는 num2 증가 전의 값인 1이 할당되고,
        // 그 후 num2의 값은 2가 됩니다.
        int postfix = num2++; // postfix는 1, num2는 2입니다.
    }
}
