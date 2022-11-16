//Найти слово, в котором число различных символов минимально
// Слово может содержать буквы и цифры
// Если таких слов несколько, найти первое из них
public class WordFinder2 {
    public static void main(String[] args) {
        String text = "Object-oriented programming peep poj is aaaa programming language hryy model \n"  +
                "organized ff deed around objects rather than \"actions\" and data \n" +
                "rather than logic. Object-oriented programming blab pttt \n" +
                "слишком сложно, я не могу level. Object-oriented programming bla madam \n";
        MinimumNumber2 searcher = new MinimumNumber2();
        System.out.println("Первое слово: " +
                searcher.search(text, "[\\wА-Яа-яЁё]+"));
    }
}