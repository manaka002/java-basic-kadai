package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26

{
	public static void main(String[] args)
	
	{
		Scanner scanner = new Scanner(System.in);  // Scannerをメインクラスで作成
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();	// じゃんけんクラスのインスタンスを作成
		
		String myChoice = jyanken.getMyChoice(scanner);		// 自分のじゃんけんの手を入力
		String opponentChoice = jyanken.getRandom();	// 対戦相手のじゃんけんの手を選ぶ

		
		jyanken.playGame(opponentChoice);	// じゃんけんを行う
		
		scanner.close();  // プログラムの最後でScannerを閉じる
	}
}