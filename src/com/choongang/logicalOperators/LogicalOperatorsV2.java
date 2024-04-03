package com.choongang.logicalOperators;

public class LogicalOperatorsV2 {
    public static void main(String[] args) {
        // NOT 연산자 (!)
        // notResult의 논리적 반대를 반환합니다. 여기서 notResult는 false이므로 결과는 true입니다.
        boolean notResult = !false;
        System.out.println("!x: " + notResult); // 출력: true

        // 복합 논리 연산 예제
        boolean a = true;
        boolean b = false;
        // a가 true이고 b가 false일 때, !(a && b)는 true입니다.
        // AND 연산의 결과가 false이므로, NOT 연산 결과는 true가 됩니다.
        boolean complexResult = !(a && b);
        System.out.println("!(a && b): " + complexResult); // 출력: true

        // 복합 논리 연산 예제 2
        // (a || b)는 a가 true이므로 true입니다. 그리고, !(a || b)는 false입니다.
        boolean complexResult2 = !(a || b);
        System.out.println("!(a || b): " + complexResult2); // 출력: false
    }
}
