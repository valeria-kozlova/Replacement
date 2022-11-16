// Найти слова палиндромы
import Searcher3.Searcher3;

import java.util.List;

public class Palindrome4 {
    public static void main(String[] args) {
        String text = getText();
        printInfo(Searcher3.getAllEntries("\\w+", text));
    }

    public static String getText() {
        return "\"Object-oriented programming peep poj is aaaa programming language hryy model  +\n" +
                "                \"organized ff deed around objects rather than \"actions\" and data +\n" +
                "                \"rather than logic. Object-oriented programming blab pttt  +\n " +
                "слишком сложно, я не могу level. Object-oriented programming bla madam \n";

    }

    public static void printInfo(List<String> words) {
        System.out.println("Палиндромы: ");
        String s = "";
        for (String word : words) {
            if (Searcher3.isPalindrome(word)) {
                s = !s.equals("") ? String.join(", ", s, word) : word;
            }
        }
        System.out.println(s);
    }
}