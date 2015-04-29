public class Main {

	private static final int TARGET = 12;

	public static void main(String[] args) {
		
		// サンプル配列の生成
		int[] sample_data = {3, 4, 5, 10, 14, 12, 25, 30, 49, 100};
		
		BinarySearchArray array =  new BinarySearchArray(sample_data);

		// ソート
		array.sort();
		System.out.println(array);

		// 二分探索し、結果を返す
		boolean isPresence = array.BinarySearch(TARGET);

		// 結果を出力する
		if(isPresence) {
			System.out.println(TARGET + "はありました。");
		} else {
			System.out.println(TARGET + "はありませんでした。");
		}

	}	
}

