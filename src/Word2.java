public class Word2 {
    private String word;
    private int uniqueCharsNumber;

    public Word2 (String word) {
        this.word = word;
        uniqueCharsNumber = uniqueCharsCount(word);
    }

    private int uniqueCharsCount(String word) {
        int count = word.length();
        String lowerCaseWord = word.toLowerCase();
        for (int i = 0; i < word.length() - 1; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (lowerCaseWord.charAt(i) == lowerCaseWord.charAt(j)) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public String getWord() {
        return word;
    }

    public int getUniqueCharsNumber() {
        return uniqueCharsNumber;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Word2)) return false;

        Word2 word1 = (Word2) o;

        if (uniqueCharsNumber != word1.uniqueCharsNumber) return false;
        return word.equals(word1.word);
    }
    public int hashCode() {
        int result = word.hashCode();
        result = 31 * result + uniqueCharsNumber;
        return result;
    }
    public String toString() {
        return "Word{" +
                "word = '" + word + '\'' +
                ", uniqueSymbolsNumber = " + uniqueCharsNumber +
                '}';
    }
}