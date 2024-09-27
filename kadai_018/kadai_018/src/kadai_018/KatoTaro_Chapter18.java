package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18

{
	public KatoTaro_Chapter18()
	
	{
		super( "加藤", "", "東京都中野区〇×");
		
	}
	
	 // 名を設定するメソッド
    public void setGivenName(String name) 
    {
        this.givenName = name;
    }
        
	// 個別の実装
	@Override
	public void eachIntroduce()
	
	{
		System.out.println( "私はJavaが得意です" );
	}
	
}
