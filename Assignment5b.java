import java.util.*;

public class Shabdkosh {

    public static boolean canChain(String word1, String word2) {
        int overlap = 0;
        int minOverlap = 3;

        while (overlap < word1.length()) {
            if (word2.startsWith(word1.substring(overlap))) {
                return true;
            }
            overlap++;
        }

        return false;
    }

    public static List<String> findWordChain(List<String> words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            List<String> chain = backtrack(new ArrayList<>(), new ArrayList<>(words), word);
            if (chain != null && chain.size() == words.size()) {
                return chain;
            }
        }
        return null;
    }

    public static List<String> backtrack(List<String> chain, List<String> wordsLeft, String lastWord) {
        if (wordsLeft.isEmpty()) {
            return chain;
        }

        for (String word : wordsLeft) {
            if (!chain.contains(word) && canChain(lastWord, word)) {
                List<String> newChain = new ArrayList<>(chain);
                newChain.add(word);
                List<String> remainingWords = new ArrayList<>(wordsLeft);
                remainingWords.remove(word);

                List<String> result = backtrack(newChain, remainingWords, word);
                if (result != null) {
                    return result;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }

        List<String> wordChain = findWordChain(words);

        if (wordChain != null) {
            for (String word : wordChain) {
                System.out.println(word);
            }
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
