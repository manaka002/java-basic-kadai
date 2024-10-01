package kadai_026;

import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26

{
	private String myChoice; 	// 自分のじゃんけんの手

	
	 // 自分のじゃんけんの手を入力するメソッド
	public String getMyChoice(Scanner scanner)	// Scannerを引数として受け取る
	
	{		
		while (true)	// 無限ループで入力を待つ
			
		{
			System.out.print("自分のじゃんけんの手を選んでください (r: グー, s: チョキ, p: パー): ");
			myChoice = scanner.nextLine().toLowerCase(); 	// 小文字に変換
			
			// 正しい入力か確認
			if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p"))
				
			{
				return myChoice;	// 正しい手を返す
			}
			else
			{
				System.out.println("無効な選択です。もう一度選んでください。");
			}
		}
	}
	
	// 対戦相手のじゃんけんの手を乱数で選ぶメソッド
	
	public String getRandom()
	
	{
		String[] hands = {"r","s","p"};		// 配列に手をセット
		Random random = new Random();
		return hands[random.nextInt(hands.length)];	// ランダムに手を選ぶ
	}
	
	
	// じゃんけんを行うメソッド
	public void playGame(String opponentChoice)
	
	{
		System.out.println("自分のじゃんけんの手: " + myChoice);
		System.out.println("対戦相手のじゃんけんの手: " + opponentChoice);
		
		// 勝敗を判定
		if(myChoice.equals(opponentChoice))
		{
			System.out.println("あいこです。");
		}
		
		else if(myChoice.equals("r") && opponentChoice.equals("s"))
		{
			System.out.println("自分の勝ちです。");
		}
		
		else if (myChoice.equals("r") && opponentChoice.equals("p")) 
		{
			System.out.println("自分の負けです。");
		} 
		
		else if (myChoice.equals("s") && opponentChoice.equals("r")) 
		{
			System.out.println("自分の負けです。");
		} 
		
		else if (myChoice.equals("s") && opponentChoice.equals("p")) 
		{
			System.out.println("自分の勝ちです。");
		} 
		
		else if (myChoice.equals("p") && opponentChoice.equals("r")) 
		{
			System.out.println("自分の勝ちです。");
		} 
		
		else if (myChoice.equals("p") && opponentChoice.equals("s")) 
		{
			System.out.println("自分の負けです。");
		}

	}
	
}













