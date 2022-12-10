import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ScheduledExecutorService;

public class Valid_Parentheses {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')'); map.put('[', ']'); map.put('{', '}');
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) return false;
        for (char curr:s.toCharArray()) {
            if (map.containsKey(curr)) stack.add(curr);
            else if (stack.isEmpty() || map.get(stack.pop()) == curr) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
