package com.choongang.incrementDecrementOperator;

/**
 * 코드를 작성하다 보면, 어떤 정수 타입 변수가 가진 값을 증가시키거나 감소시켜야 하는 경우가 있습니다.
 * 예를 들어, 1이라는 값을 할당받아 저장하고 있는 변수 num1의 값을 1 증가시켜야 한다면,
 * 그리고 1이라는 값을 할당받아 저장하고 있는 변수 num2의 값을 1 감소시켜야 한다면
 * 아래와 같은 코드를 작성할 수 있을 것입니다.
 */
public class IncrementDecrementOperatorV1 {
    public static void main(String[] args) {
        // 변수 num1을 선언하고 초기 값 1을 할당합니다.
        // 이 변수는 우리가 조작할 첫 번째 정수입니다.
        int num1 = 1;

        // 이 연산 후, num1의 값은 2가 됩니다.
        num1 = num1 + 1; // num1의 값은 2가 됩니다.

        // 변수 num2를 선언하고 초기 값 1을 할당합니다.
        // 이 변수는 우리가 조작할 두 번째 정수입니다.
        int num2 = 1;

        // 이 연산 후, num2의 값은 0이 됩니다.
        num2 = num2 - 1; // num2의 값은 0이 됩니다.
    }
}
