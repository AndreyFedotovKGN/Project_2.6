import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printingOddNumbers(nums);
        printingEvenNumbers(nums);

        String tongueTwister = "Корабли лавировали лавировали да не вылавировали";
        printingTextWithoutDuplicates(tongueTwister);
        printingTheNumberOfDuplicates(tongueTwister);
    }

    //Задание 1
//Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
// Код должен работать с любой последовательностью и объемом списка чисел.
    public static void printingOddNumbers(List nums) {
        List<Integer> numbers = new ArrayList<>();
        for (Object num : nums) {
            int oddNumbers = (int) num;
            if (oddNumbers % 2 != 0) {
                numbers.add(oddNumbers);
            }
        }
        System.out.println(numbers);
    }

    //## Задание 2
//Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
//Код должен работать с любой последовательностью и объемом списка чисел.
    public static void printingEvenNumbers(List nums) {
        Set<Integer> noDuplicates = new HashSet<>();
        for (Object num : nums) {
            int evenNumbers = (int) num;
            if ((evenNumbers % 2 == 0)) {
                noDuplicates.add(evenNumbers);
            }
        }
        System.out.println(noDuplicates);
    }

    //## Задание 3
//Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
//В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
// Код должен работать с любой последовательностью и объемом списка слов.
    public static void printingTextWithoutDuplicates(String tongueTwister) {
        List<String> listWord = new ArrayList<String>(Arrays.asList(tongueTwister.split(" ")));
        Set<String> wordNoDublicatet = new HashSet<>();
        for (int i = 0; i < listWord.size(); i++) {
            String word = listWord.get(i);
            if (word == null) continue;
            for (int j = 0; j < listWord.size(); j++) {
                if (i == j) continue;
                String copyWord = listWord.get(j);
                if (!word.equals(copyWord)) {
                    wordNoDublicatet.add(copyWord);
                }
            }
        }
        System.out.println(wordNoDublicatet);
    }
//## Задание 4
//Напишите код, который выводит в консоль все количество дублей из списка слов.
//*Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется. В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.*
//В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
//Код должен работать с любой последовательностью и объемом списка слов.
    public static void printingTheNumberOfDuplicates(String tongueTwister) {
        List<String> listWord = new ArrayList<>(Arrays.asList(tongueTwister.split(" ")));
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < listWord.size(); i++) {
            String word = listWord.get(i);
            int num = 0;
            for (int j = 0; j < listWord.size(); j++) {
                if (i == j) continue;
                String word2 = listWord.get(j);
                if (word.equals(word2)) {
                    num++;
                }
            }
            counter.put(word,num);
        }
        System.out.println(counter);
    }

}







