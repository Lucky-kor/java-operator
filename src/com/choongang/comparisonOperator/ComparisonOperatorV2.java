package com.choongang.comparisonOperator;

public class ComparisonOperatorV2 {
    public static void main(String[] args) {
        // 등가 비교 연산자 예제

        // 5 == 3 은 false입니다. 왜냐하면 5와 3은 서로 다른 값이기 때문입니다.
        boolean isEqual = 5 == 3;
        System.out.println("5 == 3: " + isEqual); // 출력: false

        // 5 == 5 은 true입니다. 왜냐하면 두 값이 동일하기 때문입니다.
        boolean isEqual2 = 5 == 5;
        System.out.println("5 == 5: " + isEqual2); // 출력: true

        // 3 != 2 은 true입니다. 왜냐하면 3과 2는 서로 다른 값이기 때문입니다.
        boolean isNotEqual = 3 != 2;
        System.out.println("3 != 2: " + isNotEqual); // 출력: true

        // 3 != 3 은 false입니다. 왜냐하면 두 값이 동일하기 때문입니다.
        boolean isNotEqual2 = 3 != 3;
        System.out.println("3 != 3: " + isNotEqual2); // 출력: false

        // 참조 타입의 등가 비교 예제
        String str1 = new String("test");
        String str2 = new String("test");
        String str3 = str1;

        // str1과 str2는 내용은 같지만, 참조하는 객체가 다릅니다.
        // 따라서, == 연산자로 비교했을 때 false를 반환합니다.
        boolean areStringsEqual = str1 == str2;
        System.out.println("str1 == str2: " + areStringsEqual); // 출력: false

        // str1과 str3는 동일한 객체를 참조합니다.
        // 따라서, == 연산자로 비교했을 때 true를 반환합니다.
        boolean areStringsEqual2 = str1 == str3;
        System.out.println("str1 == str3: " + areStringsEqual2); // 출력: true

        // 문자열의 내용을 비교하기 위해서는 equals 메서드를 사용해야 합니다.
        boolean areStringsContentEqual = str1.equals(str2);
        System.out.println("str1.equals(str2): " + areStringsContentEqual); // 출력: true
    }
}
