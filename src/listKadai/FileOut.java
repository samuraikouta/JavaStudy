package listKadai;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class FileOut extends BufferedWriter {

	public static String ISO2022JP = "ISO2022JP";
	public static String SJIS = "SJIS";
	public static String EUC_JP = "EUC_JP";
	public static String UTF_8 = "UTF-16";
	public static String UTF_16 = "ISO2022JP";

	/**
	 * 文字型出力ストリームを作成します。エンコード方式には次のいずれかを指定します。<br>
	 * JISコード:"ISO2022JP"<br>
	 * シフトJISコード:"SJIS"<br>
	 * 日本語EUCコード:"EUC-JP"<br>
	 * Unicode:"UTF-8", "UTF-16"
	 *
	 * @param file
	 *            java.io.File
	 * @param encode
	 *            エンコード方式
	 * @return
	 * @throws IOException
	 */
	public FileOut(File file, String encode) throws IOException {
		super(new OutputStreamWriter(new FileOutputStream(file), encode));
	}

	/**
	 * ArrayListのすべての要素ををファイルに出力します。要素ごとに改行されます。
	 *
	 * @param al
	 * @throws IOException
	 */
	public void write(ArrayList<HashMap<String, String>> al) throws IOException {
		this.write("商品コード" + ",");
		this.write("商品名" + ",");
		this.write("最高売り上げ年月" + ",");
		this.write("最高売り上げ額" + ",");
		this.write("最高売り上げ台数" + ",");
		this.write("メーカー");
		this.newLine();

		for (int i = 0; i < al.size(); i++) {
			this.write(al.get(i).get(KeyConstBK.ID) + ",");
			this.write(al.get(i).get(KeyConstBK.NAME) + ",");
			this.write(al.get(i).get(KeyConstBK.SALESMONTH) + ",");
			this.write(al.get(i).get(KeyConstBK.SALESAMOUNT) + ",");
			this.write(al.get(i).get(KeyConstBK.UNITSALES) + ",");
			this.write(al.get(i).get(KeyConstBK.MAKER) + "");
			this.newLine();
		}
	}

	/**
	 * String配列のすべての要素ををファイルに出力します。要素ごとに改行されます。
	 *
	 * @param s
	 * @throws IOException
	 */
	public void write(String[] s) throws IOException {
		for (int i = 0; i < s.length; i++) {
			this.write(s[i] + "");
			this.newLine();
		}
	}
}
