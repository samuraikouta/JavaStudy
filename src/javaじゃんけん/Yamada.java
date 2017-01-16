package javaじゃんけん;
/**
 * プレイヤーを継承した山田さんクラス。
 */
public class Yamada extends Player{
	/**
	 * コンストラクタ
	 * 
	 * @param name 名前
	 */
	public Yamada(String name){
		//スーパークラスのコンストラクタを呼び出す
		super(name);
	}
	
	/**
	 * じゃんけんの手を出す。
	 * スーパークラスの同名メソッドをオーバーライドしている。
	 * 
	 * @return じゃんけんの手
	 */
	public int showHand(){
		//必ずパーを出す
		return PAPER;
	}
}
