package com.choongang.compoundAssignmentOperator;

public class CompoundAssignmentOperatorV1 {
    public static void main(String[] args) {
        // num1 변수를 선언하고 초기값 1을 할당합니다.
        int num1 = 1;

        // num1 변수의 값을 1만큼 증가시킵니다.
        // 이 연산은 복합 할당 연산자를 사용하여 num1 += 1; 로도 작성할 수 있습니다.
        // 복합 할당 연산자는 변수에 연산을 적용하고 그 결과를 다시 변수에 할당하는 축약된 형태입니다.
        num1 = num1 + 1;

        // num2 변수를 선언하고 초기값 1을 할당합니다.
        int num2 = 1;

        // num2 변수의 값을 1만큼 감소시킵니다.
        // 이 연산은 복합 할당 연산자를 사용하여 num2 -= 1; 로도 작성할 수 있습니다.
        // 이는 num2의 현재 값에서 1을 빼고 그 결과를 다시 num2에 할당합니다.
        num2 = num2 - 1;
    }
}
