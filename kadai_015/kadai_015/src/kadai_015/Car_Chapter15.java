package kadai_015;

public class Car_Chapter15 
{
	// フィールド
	private int gear = 1;		// ギア（1速から5速の初期値は1）
	private int speed = 10;		// ギアチェンジ後の速度の初期値は10
	
	
	// ギアチェンジメソッド
	public void gearChange(int afterGear )
	{ 			 
		
		 // ギアの範囲をチェック
		if (afterGear >= 1 && afterGear <= 5)
		{
			// ギア変更のメッセージ
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました"); 
			
			// ギアを変更
			gear = afterGear;
			
			 // ギアに応じた速度を設定
			switch (gear)
			{
			
				case 1:
					speed = 10; // 1速の速度
					break;
					
				case 2:
					speed = 20; // 2速の速度
					break;
					
				case 3:
					speed = 30; // 3速の速度
					break;
					
				case 4:
					speed = 40; // 4速の速度
					break;
					
				case 5:
					speed = 50; // 5速の速度
					break;
					
			}
			
			// 速度を表示
			System.out.println( "速度:は時速" + speed + " kmです。");
		}
		
		else
		{
			System.out.println("無効なギアです。");
		}
	}
	
	// 速度を表示するメソッド
	public void run() 
	{
        System.out.println( "速度:は時速" + speed + " kmです。");
    }

}


