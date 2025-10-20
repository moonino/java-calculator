package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();

        // 1. 사용자 입력 기능
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input= Console.readLine();

        //7. 애플리케이션 흐름 제어
        try {
            int result = calculator.add(input);
            System.out.println("결과: " + result);
        } catch (IllegalArgumentException e) {
            // StringCalculator에서 발생한 모든 예외를 여기서 처리합니다.
            System.out.println("오류: " + e.getMessage());
        }

    }
}
