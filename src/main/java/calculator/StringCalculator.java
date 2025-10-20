package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {
        // 2. 기본 계산 기능 (빈 문자열, null 처리)
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] numbersText = split(text);

        // 4. 숫자 변환 및 합산 기능
        int sum = 0;
        for (String numberStr : numbersText) {
            try {
                int number = Integer.parseInt(numberStr);
                // 6.(1) 음수 입력 시 예외 처리
                if (number < 0) {
                    throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
                }
                sum += number;
            } catch (NumberFormatException e) {
                // 6.(2)숫자가 아닌 값 입력 시 예외 처리
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다.");
            }
        }

        return sum;
    }

    private String[] split(String text) {
        // 5. 커스텀 구분자 처리 기능
        Matcher m = Pattern.compile("//(.)\\R(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String numbers = m.group(2);
            return numbers.split(Pattern.quote(customDelimiter));
        }
        // 3. 기본 구분자 처리 기능
        return text.split("[,:]");
    }
}

