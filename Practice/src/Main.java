import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str = "[{}}]";

        System.out.println("Valid Parentheses :: "+isValidParentheses(str));

        String words = "Java is a Fun and Java is a Powerful Programming Language";

        List<String> uniqueWords = Arrays.stream(words.split(" ")).map(String::toLowerCase)
                .distinct().collect(Collectors.toList());

        System.out.println("uniqueWords :: "+uniqueWords);





    }

    static boolean isValidParentheses(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if( (ch == '}' && top != '{') ||
                        ( ch == ']' && top != '[') || ( ch == ')' && top != '(')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}