package lambda_api_gateway.repeatedWords;


import java.util.Hashtable;

public class RepeatedWord{

    public static String firstRepeatedWord(String input) {
        input = input.toLowerCase();
        String[] arrayOfWords = input.split("[\\s,.;]+");
        Hashtable<String, Integer> newHashTable = new Hashtable<String, Integer>();

        String result = null;

        for (int i = 0; i < arrayOfWords.length; i++) {
            String checkThisWord = arrayOfWords[i];
            if (newHashTable.containsKey(checkThisWord)) {
                result = checkThisWord;
                return result;
            }
            else {
                newHashTable.put(checkThisWord, 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RepeatedWord classUnderTest = new RepeatedWord();
        System.out.println(classUnderTest.firstRepeatedWord("hello hi hello how are you"));

    }
}
