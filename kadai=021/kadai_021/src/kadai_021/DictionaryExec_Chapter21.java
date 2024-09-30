package kadai_021;

public class DictionaryExec_Chapter21

{
	public static void main( String[] args)
	
	{
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		// 調べる英単語の配列を定義
		String[] wordsToLookUp = {"apple","banana","grape","orange"};
		
		// 配列内の単語を繰り返し処理
		for (String word : wordsToLookUp)
			
		{
			// 辞書を調べる
			String meaning = dictionary.lookUp(word);
			
			if (meaning != null)
				
			{
				System.out.println( word + "の意味は" + meaning );
			}
			
			else
			{
				System.out.println( word + "? ? ?" );
			}
		}	
	}
}
