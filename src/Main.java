import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.lengthOfLastWord("   fly me   to   the moon       ");
    }

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWord = words[words.length -1];
        return lastWord.length();
    }
}
