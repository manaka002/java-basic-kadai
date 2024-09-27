package kadai_018;

abstract public class Kato_Chapter18		//abstract はこのクラスが 抽象クラス であることを意味

{
	// フィールド // データ型は String で、これは 文字列 を扱う
	public String familyName;	// 姓を表す	
	public String givenName;	// 名を表す
	public String address;		// 住所を表す
	
	
	//　コンストラクタ //クラスが新しく作られたときに呼び出される特別なメソッド
	public Kato_Chapter18(String familyName, String givenName, String address)
	
	{
		this.familyName = familyName;
		this.givenName = givenName;
		this.address = address;
	}
	

	// オブジェクトの共通の情報（名前と住所）を出力するメソッド
	public void commonIntroduce()
	
	{
		System.out.println( "名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	
	//抽象メソッド 定義だけがあり、実際の処理はない
	abstract public void eachIntroduce();
	
	
	// 紹介を実行するメソッド
	public void execIntroduce() 
	
	{
		commonIntroduce();  // 共通の紹介	 名前と住所を表示
		eachIntroduce();    // 個別の紹介	 抽象メソッドを呼び出して、子クラスに応じた紹介文を表示
	}

}
