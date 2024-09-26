package kadai_015;

public class CarExec_Chapter15 
{
	public static void main(String[] args) 

	{
		
		// 車のインスタンスを作成
		Car_Chapter15 myCar = new Car_Chapter15();
		
		// 初期状態を表示
		myCar.run();
		
		// ギアを変更して速度を表示
		myCar.gearChange(2); // ギアを2に変更
		myCar.run();         // 現在の状態を表示
		
		myCar.gearChange(3); // ギアを3に変更
		myCar.run();         // 現在の状態を表示
		
		myCar.gearChange(4); // ギアを4に変更
		myCar.run();         // 現在の状態を表示
		
		myCar.gearChange(6); // 無効なギアを設定
		myCar.run();         // 現在の状態を表示
		
    }
}
