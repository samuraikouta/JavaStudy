package listKadai;

import java.util.ArrayList;
import java.util.HashMap;

public class FileEdit {
	// マージ処理のメソッド
	public void merge(ArrayList<HashMap<String, String>> salesList, 
			ArrayList<HashMap<String, String>> masterList,
			ArrayList<HashMap<String, String>> maxList) {

		String amountData = null;
		String monthData = null;
		String unitData = null;

		int amount = 0;
		int month = 0;
		int unit = 0;

		int maxAmount = 0;
		int maxMonth = 0;
		int maxUnit = 0;

		// マスターリストをループ
		for (int i = 0; i < masterList.size(); i++) {
			HashMap<String, String> masterMap = masterList.get(i);

			// 売上リストをループ
			for (int e = 0; e < salesList.size(); e++) {
				HashMap<String, String> salesMap = salesList.get(e);
				// 条件：指定したキーが一致したとき
				if (masterMap.get(KeyConstBK.ID).equals(salesMap.get(KeyConstBK.ID))) {
					amountData = (String) salesMap.get(KeyConstBK.SALESAMOUNT);
					monthData = (String) salesMap.get(KeyConstBK.SALESMONTH);
					unitData = (String) salesMap.get(KeyConstBK.UNITSALES);

					amount = Integer.parseInt(amountData);
					month = Integer.parseInt(monthData);
					unit = Integer.parseInt(unitData);

					if (maxAmount < amount) {
						maxAmount = amount;
						maxMonth = month;
						maxUnit = unit;
					}
				}
			}

			// マップを作成
			HashMap<String, String> maxMap = new HashMap<String, String>();

			maxMap.put(KeyConstBK.ID, (String) masterMap.get(KeyConstBK.ID));
			maxMap.put(KeyConstBK.NAME, (String) masterMap.get(KeyConstBK.NAME));
			maxMap.put(KeyConstBK.MAKER, (String) masterMap.get(KeyConstBK.MAKER));
			maxMap.put(KeyConstBK.SALESMONTH, String.valueOf(maxMonth));
			maxMap.put(KeyConstBK.SALESAMOUNT, String.valueOf(maxAmount));
			maxMap.put(KeyConstBK.UNITSALES, String.valueOf(maxUnit));

			maxList.add(maxMap);

			maxAmount = 0;
			maxMonth = 0;
			maxUnit = 0;
		}
	}
}
