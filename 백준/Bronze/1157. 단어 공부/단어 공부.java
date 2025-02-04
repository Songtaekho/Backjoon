import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Map<Character, Integer> word = new HashMap<>();
        
        String S = scan.next().toUpperCase();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            word.put(c, word.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        int count = 0;
        char result = '?';

        for (Map.Entry<Character, Integer> entry : word.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
                count = 1;  // 새로운 최대값이 나오면 카운트를 1로 초기화
            } else if (entry.getValue() == max) {
                count++;  // 같은 최대값을 가진 문자가 있으면 카운트 증가
            }
        }

        if (count > 1) {
            result = '?';  // 최대값을 가진 문자가 여러 개 있으면 '?'
        }

        System.out.println(result);
    }
}