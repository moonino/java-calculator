package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {

        // 1. 사용자 입력 기능
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input= Console.readLine();

        System.out.println("입력 확인: "+input);

    }
}
