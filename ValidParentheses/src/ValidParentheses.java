import java.util.Stack;

class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValidParentheses("()[]{}"));
        System.out.println(isValidParentheses("(]"));
        System.out.println(isValidParentheses("({}[])"));
    }
    static boolean isValidParentheses(String input){
        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if( (ch == '}' && top != '{') ||
                    (ch == ')' && top != '(') ||
                        (ch == ']' && top != '[')){
                   return false;
                }
            }
        }
        return stack.isEmpty();
    }
}