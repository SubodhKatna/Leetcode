import java.util.HashMap;
import java.util.Map;

public class OptimizeApproach {

    public static void main(String[] args) {
        String[] tests = {
            "III",      // 3
            "IV",       // 4
            "IX",       // 9
            "LVIII",    // 58
            "MCMXCIV",  // 1994
            "MMXXV",    // 2025
            "CDXLIV"    // 444
        };

        System.out.println("Roman → Integer conversions:");
        for (String roman : tests) {
            int value = romanToInt(roman);
            System.out.printf("%-7s → %d%n", roman, value);
        }
    }

    public static int romanToInt(String s){
        Map <Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char chars[] = s.toCharArray();
        int result = 0;
        int i,j;
        for(i = 0, j = 1; j < chars.length; i++,j++){
            if(map.get(chars[i]) >= map.get(chars[j])){
                result += map.get(chars[i]);
            } else {
                result -= map.get(chars[i]);
            }
        }
        result += map.get(chars[i]);
        return result;
    }
    
}
