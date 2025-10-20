package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String text) {
        // 2. 기본 계산 기능 (빈 문자열, null 처리)
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] numbers;

        // 5. 커스텀 구분자 처리 기능 (모든 줄바꿈 문자를 처리하도록 수정)
        Matcher m = Pattern.compile("//(.)\\R(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String numbersText = m.group(2);
            numbers = numbersText.split(Pattern.quote(customDelimiter));
        } else {
            // 3. 기본 구분자 처리 기능
            numbers = text.split("[,:]");
        }

        // 4. 숫자 변환 및 합산 기능
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}