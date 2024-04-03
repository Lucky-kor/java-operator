package com.choongang.logicalOperators;

public class LogicalOperatorsV1 {
    public static void main(String[] args) {
        // 논리 연산자 예제

        // AND 연산자 (&&)
        // x와 y 모두 true일 때만 결과가 true입니다.
        boolean andResult = true && true;
        System.out.println("true && true: " + andResult); // 출력: true

        andResult = false && true;
        System.out.println("false && true: " + andResult); // 출력: false

        andResult = true && false;
        System.out.println("true && false: " + andResult); // 출력: false

        andResult = false && false;
        System.out.println("false && false: " + andResult); // 출력: false

        // OR 연산자 (||)
        // x와 y 중 하나라도 true이면 결과가 true입니다.
        boolean orResult = true || true;
        System.out.println("true || true: " + orResult); // 출력: true

        orResult = false || true;
        System.out.println("false || true: " + orResult); // 출력: true

        orResult = true || false;
        System.out.println("true || false: " + orResult); // 출력: true

        orResult = false || false;
        System.out.println("false || false: " + orResult); // 출력: false
    }
}
