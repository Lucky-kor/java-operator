package com.choongang.incrementDecrementOperator;

public class IncrementDecrementOperatorV2 {
    public static void main(String[] args) {
        // 변수 num1과 num2를 선언하고 초기 값으로 각각 1을 할당합니다.
        // 이 예제에서는 이들 변수의 초기화가 누락되어 있으므로, 올바른 실행을 위해 추가해야 합니다.
        int num1 = 1;
        int num2 = 1;

        // 후위 증가 연산자(num1++): num1의 값을 사용한 다음, num1의 값을 1 증가시킵니다.
        // 이 연산 후 num1의 값은 2가 됩니다.
        num1++; // num1 = num1 + 1;과 같습니다.

        // 전위 증가 연산자(++num1): num1의 값을 1 증가시킨 다음, 증가된 값을 사용합니다.
        // num1의 현재 값이 2이므로, 이 연산 후 num1의 값은 3이 됩니다.
        ++num1; // num1 = num1 + 1;과 같습니다.

        // 후위 감소 연산자(num2--): num2의 값을 사용한 다음, num2의 값을 1 감소시킵니다.
        // 이 연산 후 num2의 값은 0이 됩니다.
        num2--; // num2 = num2 - 1;과 같습니다.

        // 전위 감소 연산자(--num2): num2의 값을 1 감소시킨 다음, 감소된 값을 사용합니다.
        // num2의 현재 값이 0이므로, 이 연산 후 num2의 값은 -1이 됩니다.
        --num2; // num2 = num2 - 1;과 같습니다.
    }
}
