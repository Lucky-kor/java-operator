package com.choongang.comparisonOperator;

public class ComparisonOperatorV1 {
    public static void main(String[] args) {
        // 대소 비교 연산자 예제

        // 5 > 3 은 true입니다. 왜냐하면 5는 3보다 크기 때문입니다.
        boolean result1 = 5 > 3;
        System.out.println("5 > 3: " + result1); // 출력: true

        // 5 <= 5 은 true입니다. 왜냐하면 5는 5 이하(또는 같음)입니다.
        boolean result2 = 5 <= 5;
        System.out.println("5 <= 5: " + result2); // 출력: true

        // 3 > 2 은 true입니다. 왜냐하면 3은 2보다 크기 때문입니다.
        boolean result3 = 3 > 2;
        System.out.println("3 > 2: " + result3); // 출력: true

        // 2 >= 3 은 false입니다. 왜냐하면 2는 3보다 크거나 같지 않기 때문입니다.
        boolean result4 = 2 >= 3;
        System.out.println("2 >= 3: " + result4); // 출력: false

        // 이항 비교와 논리 연산자 사용 예제
        // "x가 1보다 크고 5보다 작다"를 표현하기 위해 논리 연산자 '&&'와 대소 비교 연산자를 함께 사용합니다.
        int x = 3;
        boolean result5 = 1 < x && x < 5;
        System.out.println("1 < x && x < 5: " + result5); // 출력: true
    }
}
