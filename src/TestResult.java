
/**
 * Клас для тестування перевірки анаграм.
 */
public class TestResult {
    public static void main(String[] args) {
        // Приклади анаграм
        String word1 = "listen";
        String word2 = "silent";
        
        String word3 = "hello";
        String word4 = "world";
        
        String word5 = "Astronomer";
        String word6 = "Moon starer";
        
        // Тестування та виведення результатів
        System.out.println("Слова '" + word1 + "' та '" + word2 + "' є анаграмами: " + Exercise.Calculate(word1, word2));
        System.out.println("Слова '" + word3 + "' та '" + word4 + "' є анаграмами: " + Exercise.Calculate(word3, word4));
        System.out.println("Слова '" + word5 + "' та '" + word6 + "' є анаграмами: " + Exercise.Calculate(word5, word6));
    }
}
