package kadai_021;

public class DictionaryExec_Chapter21 {

	 public static void main(String[] args) {
		 Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		 String[] wordArray = {"apple" , "banana" , "grape" , "orange"};

		 for(String word : wordArray) {
	        System.out.println(dictionary.wordPut(word));
		 }
	 }

}
