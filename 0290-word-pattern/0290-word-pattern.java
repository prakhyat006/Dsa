class Solution {
    public boolean wordPattern(String p, String s) {
        String[] words = s.split(" ");
    if (p.length() != words.length) return false;

    HashMap<Character, String> charToWord = new HashMap<>();
    HashMap<String, Character> wordToChar = new HashMap<>();

    for (int i = 0; i < p.length(); i++) {
        char ch = p.charAt(i);
        String word = words[i];

        if (charToWord.containsKey(ch)) {
            if (!charToWord.get(ch).equals(word)) return false;
        } else {
            if (wordToChar.containsKey(word)) return false;
            charToWord.put(ch, word);
            wordToChar.put(word, ch);
        }
    }
    return true;
    }
}