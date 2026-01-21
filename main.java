import java.util.Arrays;

/**
 * Лабораторна робота №2. Варіант: C3=0, C17=9
 */
public class main {

    public static void main(String[] args) {
        try {
            // Використовуємо StringBuilder згідно з варіантом C3=0 
            StringBuilder text = new StringBuilder(
                "Java є популярною мовою. Мова Java використовується всюди. Це цікава лабораторна робота."
            );
            
            // Масив слів для пошуку
            String[] wordsToFind = {"Java", "мова", "робота", "студент"};

            System.out.println("Текст: " + text);
            System.out.println("Шукані слова: " + Arrays.toString(wordsToFind));
            System.out.println("-------------------------------------------------");

            processText(text, wordsToFind);

        } catch (Exception e) {
            // Обробка виключних ситуацій 
            System.err.println("Помилка при виконанні: " + e.getMessage());
        }
    }

    public static void processText(StringBuilder text, String[] wordsToFind) {
        // 1. Розбиваємо текст на речення (враховуємо крапку з пробілом)
        String[] sentences = text.toString().split("[.!?]\\s*");
        
        for (String word : wordsToFind) {
            int countInSentences = 0;
            
            for (String sentence : sentences) {
                // 2. Переводимо все в нижній регістр для порівняння
                String lowerSentence = sentence.toLowerCase();
                String lowerWord = word.toLowerCase();

                // 3. Перевіряємо чи міститься слово в реченні
                if (lowerSentence.contains(lowerWord)) {
                    countInSentences++;
                }
            }
            System.out.println("Слово \"" + word + "\" знайдено у " + countInSentences + " реченнях.");
        }
    }
}