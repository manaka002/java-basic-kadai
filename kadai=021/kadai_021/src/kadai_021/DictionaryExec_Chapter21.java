package kadai_021;

public class DictionaryExec_Chapter21

{
	public static void main( String[] args)
	
	{
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 調べる英単語の配列を定義
		String[] wordsToLookUp = {"apple","banana","grape","orange"};

		 // 辞書クラスに配列を渡して調べる
        dictionary.searchWords(wordsToLookUp);
        	
	}
}
