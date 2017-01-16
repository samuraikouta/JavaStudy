package なぜjavaじゃんけん;
/**
 * オブジェクト指向によるじゃんけんプログラム
 */

public class ObjectJanken {
	public static void main(String args[]){
		//審判（斎藤さん）のインスタンス生成
		Judge saito = new Judge();
		
		//プレイヤー1（村田さん）の生成
		Player murata = new Player("村田さん");
		
		//村田さんに渡す戦略クラスを生成する
		Tactics murataTactics = new CyclicTactics();
		
		//村田さんに戦略クラスを渡す
		murata.setTactics(murataTactics);
		
		//プレイヤー2（山田さん）の生成
		Player yamada = new Player("山田さん");

		//村田さんに渡す戦略クラスを生成する
		Tactics yamadaTactics = new RandomTactics();

		//村田さんに戦略クラスを渡す
		yamada.setTactics(yamadaTactics);
				
		//村田さんと山田さんをプレイヤーとしてじゃんけんを開始する
		saito.startJanken(murata, yamada);
	}
}
