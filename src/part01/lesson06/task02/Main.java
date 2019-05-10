/**
 * Задание 2. Создать генератор текстовых файлов, работающий по следующим правилам:
 * Предложение состоит из 1<=n1<=15 слов. В предложении после произвольных слов могут находиться запятые.
 * Слово состоит из 1<=n2<=15 латинских букв
 * Слова разделены одним пробелом
 * Предложение начинается с заглавной буквы
 * Предложение заканчивается (.|!|?)+" "
 * Текст состоит из абзацев. в одном абзаце 1<=n3<=20 предложений. В конце абзаца стоит разрыв строки и перенос каретки.
 * Есть массив слов 1<=n4<=1000.
 * Есть вероятность probability вхождения одного из слов этого массива в следующее предложение (1/probability).
 * Необходимо написать метод getFiles(String path, int n, int size, String[] words, int probability),
 * который создаст n файлов размером size в каталоге path. words - массив слов, probability - вероятность.
 */

package part01.lesson06.task02;

import static part01.lesson06.task02.solution.Solution.getFiles;
import static part01.lesson06.task02.solution.Solution.getWordsArray;
import static part01.lesson06.task02.util.ReadProperties.getProperties;

public class Main {

    private static final String PATH_TO_OUTPUT_FILES = getProperties("outputFiles");

    public static void main(String[] args) {
        String[] words = getWordsArray();
        getFiles(PATH_TO_OUTPUT_FILES, 3, 3000, words);
    }
}