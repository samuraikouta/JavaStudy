package listKadai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Method {
	public void readProductcsv(String adress, ArrayList<HashMap<String, String>> list) {
		try {
			BufferedReader inputLine = new BufferedReader(new FileReader(adress));
			String line;

			while ((line = inputLine.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);// lineを分割の対称にする
				String id = st.nextToken(",");// 1回目の区切り(ID)
				String name = st.nextToken(",");// 2回目の区切り(商品名)
				String maker = st.nextToken(",");// 3回目の区切り(生産元)

				HashMap<String, String> map = new HashMap<String, String>();

				map.put(KeyConstBK.ID, id);
				map.put(KeyConstBK.NAME, name);
				map.put(KeyConstBK.MAKER, maker);

				list.add(map);
			}
			inputLine.close();

		} catch (IOException e) {
			System.out.println("ファイルが開けません");
		}
	}

	public void readSalescsv(String adress, ArrayList<HashMap<String, String>> list) {
		try {
			BufferedReader inputLine = new BufferedReader(new FileReader(adress));
			String line;

			while ((line = inputLine.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);// lineを分割の対称にする
				String id = st.nextToken(",");// 1回目の区切り(ID)
				String salesMonth = st.nextToken(",");// 2回目の区切り(売上月)
				String salesAmount = st.nextToken(",");// 3回目の区切り(売上金額)
				String unitSales = st.nextToken(",");// 4回目の区切り(売上台数)

				HashMap<String, String> map = new HashMap<String, String>();

				map.put(KeyConstBK.ID, id);
				map.put(KeyConstBK.SALESMONTH, salesMonth);
				map.put(KeyConstBK.SALESAMOUNT, salesAmount);
				map.put(KeyConstBK.UNITSALES, unitSales);

				list.add(map);
			}

			inputLine.close();

		} catch (IOException e) {
			System.out.println("ファイルが開けません");
		}
	}

	public void hyouzi(ArrayList<HashMap<String, String>> list) {
		for (Map<String, String> map : list) {
			for (Map.Entry<String, String> entry : map.entrySet()) {
				System.out.println(entry.getValue());
			}
		}
	}
}
