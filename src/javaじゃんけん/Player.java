package javaじゃんけん;

//じゃんけんのプレイヤーを表すクラス

public class Player {
//	じゃんけんの手を表す定数
	public static final int STONE = 0; //グー
	public static final int SCISSORS = 1; //チョキ
	public static final int PAPER = 2; //パー
	
	//------------------------------------
	//プレイヤークラスの属性
	//------------------------------------
	/**プレイヤーの名前*/
	private String name_;
	
	/**プレイヤーの勝った回数*/
	private int winCount_ = 0;
	
	//------------------------------------
	//プレイヤークラスの操作
	//------------------------------------
	/**
	 * プレイヤークラスのコンストラクタ。
	 * 
	 * @param name 名前
	 */
	public Player(String name){
		this.name_ = name;
	}
	
	/**与えられた戦略*/
	private Tactics tactics_;
	
	/**
	 * プレイヤーに戦略を渡す。
	 * 
	 * @param tactics 戦略
	 */
	void setTactics(Tactics tactics){
		tactics_ = tactics;
	}
	
	/**
	 * じゃんけんの手を出す。
	 * 
	 * @return じゃんけんの手
	 */
	public int showHand(){
		//与えられた戦略を読んでじゃんけんの手を決める
		int hand = tactics_.readTactics();
		
		//決定した手を戻り値として返す
		return hand;
	}
	
	/**
	 * 審判から勝敗を聞く。
	 * 
	 * @param result true:勝ち,false:負け
	 */
	public void notifyResult(boolean result){
		if(true == result){
			//勝った場合は勝数を加算する
			winCount_ += 1;
		}
	}
	
	/**
	 * 自分の勝った回数を答える。
	 * 
	 * @return 勝った回数
	 */
	public int getWinCount(){
		return winCount_;
	}
	
	/**
	 * 自分の名前を答える。
	 * 
	 * @return 名前
	 */
	public String getName(){
		return name_;
	}
}
