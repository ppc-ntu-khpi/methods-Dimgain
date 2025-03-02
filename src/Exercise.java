
/**
 * Клас для перевірки чи є слово анаграмою іншого слова.
 * Анаграма - це слово, утворене шляхом перестановки букв іншого слова.
 */
public class Exercise {
    /**
     * Перевіряє чи є друге слово анаграмою першого.
     * 
     * @param word1 Перше слово
     * @param word2 Друге слово
     * @return true - якщо слова є анаграмами, false - якщо ні
     */
    public static boolean Calculate(String word1, String word2) {
        // Видаляємо пробіли та переводимо в нижній регістр
        word1 = word1.toLowerCase().replaceAll("\\s", "");
        word2 = word2.toLowerCase().replaceAll("\\s", "");
        
        // Якщо довжини слів різні, то це не анаграми
        if (word1.length() != word2.length()) {
            return false;
        }
        
        // Перетворюємо рядки у масиви символів
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        
        // Сортуємо масиви символів
        java.util.Arrays.sort(chars1);
        java.util.Arrays.sort(chars2);
        
        // Порівнюємо відсортовані масиви
        return java.util.Arrays.equals(chars1, chars2);
    }
}
