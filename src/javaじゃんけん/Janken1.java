package javaじゃんけん;

public class Janken1 {
	
	//じゃんけんの手を表す定数
	public static final int STONE = 0; //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2; //パー
	//プレイヤー1の勝数
	public static int player1WinCount = 0;

	//プレイヤー2の勝数
	public static int player2WinCount = 0;
	
	public static void main(String[] args){
		//■■■■■■■■■■■■■■■■■■
		//①プログラムが開始したことを表示する
		//■■■■■■■■■■■■■■■■■■
		//プログラム開始メッセージを表示する
		
		System.out.println("【じゃんけん開始】\n");
	
		//乱数を格納するための変数
		double randomNum = 0;
		
		//じゃんけんを3回実施する
		//■■■■■■■■■■■■■■■■■■
		//⑥勝負した回数を加算する
		//⑦③回勝負が終わったか？
		//■■■■■■■■■■■■■■■■■■
		for(int cnt=0; cnt<3; cnt++){
		
			int cnt1 = cnt+1; 
			
			System.out.println("【" + cnt1 + "回戦目】\n");
			
			//■■■■■■■■■■■■■■■■■■
			//②プレイヤー1が何を出すか決める
			//■■■■■■■■■■■■■■■■■■
			int player1Hand = 0;

			//0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;
			if (randomNum < 1){
				//randomNumが0.0以上1.0未満の場合、グー
				player1Hand = STONE;

				//プレイヤー1の手を表示する
				System.out.println("グー");
			}
			else if(randomNum <2){
				//randomNumが1.0以上2.0未満の場合、チョキ
				player1Hand = SCISSORS;

				//プレイヤー1の手を表示する
				System.out.println("チョキ");
			}
			else if(randomNum <3){
				//randomNumが2.0以上3.0未満の場合、パー
				player1Hand = PAPER;

				//プレイヤー1の手を表示する
				System.out.println("パー");
			}

			//■■■■■■■■■■■■■■■■■■
			//③プレイヤー2が何を出すか決める
			//■■■■■■■■■■■■■■■■■■
			int player2Hand = 0;

			//0以上3未満の少数として乱数を得る
			randomNum = Math.random() * 3;
			if (randomNum < 1){
				//randomNumが0.0以上1.0未満の場合、グー
				player2Hand = STONE;

				//プレイヤー1の手を表示する
				System.out.println("グー");
			}
			else if(randomNum <2){
				//randomNumが1.0以上2.0未満の場合、チョキ
				player2Hand = SCISSORS;

				//プレイヤー1の手を表示する
				System.out.println("チョキ");
			}
			else if(randomNum <3){
				//randomNumが2.0以上3.0未満の場合、パー
				player2Hand = PAPER;

				//プレイヤー1の手を表示する
				System.out.println("パー");
			}

			//■■■■■■■■■■■■■■■■■■
			//④どちらが勝ちかを判定し、結果を表示する
			//■■■■■■■■■■■■■■■■■■
			//プレイヤー1が勝つ場合
			if(   (player1Hand == STONE && player2Hand == SCISSORS)
					||(player1Hand == SCISSORS && player2Hand == PAPER)
					||(player1Hand == PAPER && player2Hand == STONE)    )
			{
				//■■■■■■■■■■■■■■■■■■
				//⑤プレイヤー1の勝った回数を加算する
				//■■■■■■■■■■■■■■■■■■
				player1WinCount++;

				//じゃんけんの結果を表示する
				System.out.println("\nプレイヤー1が勝ちました！\n");
			}

			//プレイヤー2が勝つ場合
			else if (  (player1Hand == STONE && player2Hand == PAPER)
					||(player1Hand == SCISSORS && player2Hand == STONE)
					||(player1Hand == PAPER && player2Hand == SCISSORS) )
			{
				//■■■■■■■■■■■■■■■■■■
				//⑤プレイヤー2の勝った回数を加算する
				//■■■■■■■■■■■■■■■■■■
				player2WinCount++;

				//じゃんけんの結果を表示する
				System.out.println("\nプレイヤー2が勝ちました！\n");
			}

			//引き分けの場合
			else{
				//じゃんけんの結果を表示する
				System.out.println("\n引き分けです！\n");
			}
		}
		//■■■■■■■■■■■■■■■■■■
		//⑧最終的な勝者を判定し、画面に表示する
		//■■■■■■■■■■■■■■■■■■
		System.out.println("【じゃんけん終了】\n");

		//プレイヤー1の勝数が多い時
		if(player1WinCount > player2WinCount){
			//プレイヤー1の勝数を表示する。
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー1の勝ちです！\n");
		}

		//プレイヤー2の勝数が多い時
		else if(player1WinCount < player2WinCount){
			//プレイヤー1の勝数を表示する。
			System.out.println(player1WinCount + "対" + player2WinCount + "でプレイヤー2の勝ちです！\n");
		}

		//プレイヤー1と2の勝数が同じ時
		else if(player1WinCount == player2WinCount){
			//引き分けを表示する。
			System.out.println(player1WinCount + "対" + player2WinCount + "で引き分けです！\n");
		}
	}
}
