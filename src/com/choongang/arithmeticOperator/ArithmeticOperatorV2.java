package com.choongang.arithmeticOperator;

/**
 * 나눗셈 연산자와 나머지 연산자를 사용할 때는 우항에 0이 위치할 수 없습니다. 즉, 어떤 수를 0으로 나눌 수 없습니다.
 */
public class ArithmeticOperatorV2 {
    public static void main(String[] args) {
        // 정수 나눗셈에서, 0으로 나누려고 하면 실행 시 에러(ArithmeticException)가 발생합니다.
        // 이 라인은 프로그램을 중단시키며, 정수 나눗셈에서는 0으로 나눌 수 없음을 보여줍니다.
        int num1 = 9 / 0;   // 에러

        // 부동소수점 숫자를 0으로 나누면, Java는 에러를 발생시키지 않고 'Infinity'라는 값을 반환합니다.
        // 이는 부동소수점 연산의 특성으로, 무한대에 해당하는 값을 나타냅니다.
        double num2 = 9.0 / 0; // Infinity

        // 정수 나머지 연산에서, 0으로 나누려고 하면 실행 시 에러(ArithmeticException)가 발생합니다.
        // 이는 나머지 연산에서도 0으로 나눌 수 없음을 보여줍니다.
        int num3 = 9 % 0;   // 에러

        // 부동소수점 숫자에 대한 나머지 연산에서 0으로 나누려고 하면, 에러가 발생합니다.
        // 이 경우, 나머지 연산의 결과는 정의되지 않으며, 이는 정수와 부동소수점 모두에 해당됩니다.
        double num4 = 9.0 % 0; // 에러
    }
}
