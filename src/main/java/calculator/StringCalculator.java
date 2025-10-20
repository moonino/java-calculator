package calculator;

public class StringCalculator {
    public int add(String text) {
        // 2. 기본 계산 기능 (빈 문자열, null 처리)
        if (text == null || text.isEmpty()) {
            return 0;
        }
        // 3. 기본 구분자 처리 기능
        String[] numbers = text.split("[,:]");

        // 4. 숫자 변환 및 합산 기능
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum; // 임시 반환 값
    }
}
