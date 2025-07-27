package src;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {
  public int romanToInt(String s) {

    Map< Character, Integer > romanToInt = new HashMap< >();
    romanToInt.put('I', 1);
    romanToInt.put('V', 5);
    romanToInt.put('X', 10);
    romanToInt.put('L', 50);
    romanToInt.put('C', 100);
    romanToInt.put('D', 500);
    romanToInt.put('M', 1000);

    int len = s.length();
    int result = 0;
    for (int i = 0; i < len; i++) {
      if (i != len - 1 && romanToInt.get(s.charAt(i)) < romanToInt.get(s.charAt(i + 1))) {
        result = result + romanToInt.get(s.charAt(i + 1)) - romanToInt.get(s.charAt(i));
        i++;
      } else {
        result += romanToInt.get(s.charAt(i));
      }
    }
    return result;
  }
}
