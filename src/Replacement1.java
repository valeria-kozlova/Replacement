// Введите любую строку.
// Замените в строке каждое второе вхождение «object-oriented programming»
// (не учитываем регистр символов) на «OOP»
public class Replacement1 {
    public static void main(String[] args) {
        String s = "Object-oriented programming peep poj is aaaa programming language hryy model \n"  +
                "organized ff deed around objects rather than \"actions\" and data \n" +
                "rather than logic. Object-oriented programming blab pttt \n" +
                "слишком сложно, я не могу level. Object-oriented programming bla madam \n";
        Replacement11(s);
    }
    static void Replacement11 (String text) {
        String str = "Object-oriented programming";
        String str2 = "OOP";
        int index = 0;
        int count = 0;

        while (true) {
            index = text.indexOf(str, index);
            if (index != -1) {
                if (count % 2 != 0) {
                    text = text.substring(0, index) + str2 + text.substring(index + str.length());
                }
                count++;
                index += str.length();
            } else {
                break;
            }
        }

        System.out.println(text);
    }
}