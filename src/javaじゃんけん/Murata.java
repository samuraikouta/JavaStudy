package javaじゃんけん;
/**
 * プレイヤーを継承した村田さんクラス。
 */
public class Murata extends Player{
	/**
	 * コンストラクタ
	 * 
	 * @param  name  名前
	 */
	public Murata(String name){
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
		//必ずグーを出す
		return STONE;
	}
}
