package com.choongang.compoundAssignmentOperator;

public class CompoundAssignmentOperatorV2 {
    public static void main(String[] args) {
        // 변수들을 선언하고 모두 초기값으로 10을 할당합니다.
        int num1 = 10;
        int num2 = 10;
        int num3 = 10;
        int num4 = 10;
        int num5 = 10;

        // num1에 3을 더합니다. 복합 할당 연산자 '+='을 사용하여,
        // num1의 값에 3을 더하고 결과를 다시 num1에 할당합니다.
        num1 += 3; // 이후 num1의 값은 13입니다.

        // num2에서 3을 뺍니다. 복합 할당 연산자 '-='을 사용하여,
        // num2의 값에서 3을 빼고 결과를 다시 num2에 할당합니다.
        num2 -= 3; // 이후 num2의 값은 7입니다.

        // num3에 3을 곱합니다. 복합 할당 연산자 '*='을 사용하여,
        // num3의 값에 3을 곱하고 결과를 다시 num3에 할당합니다.
        num3 *= 3; // 이후 num3의 값은 30입니다.

        // num4를 3으로 나눕니다. 복합 할당 연산자 '/='을 사용하여,
        // num4의 값을 3으로 나누고 결과를 다시 num4에 할당합니다.
        // 정수 나눗셈의 결과는 정수이므로, 소수점 이하는 버려집니다.
        num4 /= 3; // 이후 num4의 값은 3입니다.

        // num5를 3으로 나눈 나머지를 구합니다. 복합 할당 연산자 '%='을 사용하여,
        // num5를 3으로 나눈 나머지를 계산하고 그 결과를 다시 num5에 할당합니다.
        num5 %= 3; // 이후 num5의 값은 1입니다.
    }
}
