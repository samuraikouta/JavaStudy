package listKadai;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	private static FileOut fileOut;

	public static void main(String[] args) throws IOException {
		// 商品マスタをnewする
		Method master = new Method();

		// 商品マスタのリストを作成
		ArrayList<HashMap<String, String>> masterList = new ArrayList<HashMap<String, String>>();

		// 「商品マスタ」の値をそれぞれマップにいれ、リストに入れる
		master.readProductcsv("/Users/haradakouta/Desktop/土曜勉強会/IN/マスターリスト.txt", masterList);

		master.hyouzi(masterList);

		System.out.println("------------------------------");

		// 売上マスタをnewする
		Method sales = new Method();

		// 売り上げマスタのリストを作成
		ArrayList<HashMap<String, String>> salesList = new ArrayList<HashMap<String, String>>();

		// 「商品売上リスト」の値をそれぞれのマップに入れ、1つのリストに入れる
		sales.readSalescsv("/Users/haradakouta/Desktop/土曜勉強会/IN/売上リスト.txt", salesList);

		sales.hyouzi(salesList);
		

		System.out.println("------------------------------");

		FileEdit max = new FileEdit();

		ArrayList<HashMap<String, String>> maxList = new ArrayList<HashMap<String, String>>();

		max.merge(salesList, masterList, maxList);

		for (Map<String, String> map : maxList) {
			for (Map.Entry<String, String> entry : map.entrySet()) {
				System.out.println(entry.getValue());
			}

			System.out.println("------------------------------");
		}

		System.out.println("テスト");

		File object1 = new File("/Users/haradakouta/Desktop/土曜勉強会/OUT", "最大売上リスト.txt");

		fileOut = new FileOut(object1, FileOut.UTF_8);
		fileOut.write(maxList);
		fileOut.close();

	}
}
