package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 

{
	 // HashMapを宣言
	private HashMap<  String, String > dictionary;
	
	
	// コンストラクタ
	public Dictionary_Chapter21 ()
	
	{
		dictionary = new HashMap<>();
		addWords();						// 英単語を辞書に追加
	}
	
	
	// 英単語を辞書に追加するメソッド
	private void addWords()
	
	{
		
		// 辞書に単語と意味を追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		
	}
	
	
	// 辞書を調べるメソッド
	public String lookUp( String word)
	
	{
		return dictionary.get(word);
	}
	
	
	// 辞書のサイズを取得するメソッド
	public int size()
	
	{
		return dictionary.size();
		
	}
	
}
