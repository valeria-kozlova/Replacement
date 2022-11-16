// Найти количество слов, содержащих только символы латинского алфавита
import Searcher3.Searcher3;

import java.util.List;

public class NumberOfWords3 {
    public static void main(String[] args) {
        String text = getText();
        printInfo(Searcher3.getAllEntries("[A-Za-z]+", text));
    }

    public static String getText() {
        return "Object-oriented programming peep poj is aaaa programming language hryy model \n"  +
                "organized ff deed around objects rather than \"actions\" and data \n" +
                "rather than logic. Object-oriented programming blab pttt \n" +
                "слишком сложно, я не могу level. Object-oriented programming bla madam \n";
    }
    public static void printInfo(List<String> words) {
        System.out.print("количество слов: ");
        System.out.printf(String.valueOf(words.size()));
        System.out.println(" ");
    }
}