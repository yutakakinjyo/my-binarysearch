package java_debug;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// 二分探索を実装する		

		// サンプル配列の生成
		int[] sample_data = {3, 4, 5, 10, 12, 14, 25, 30, 49, 100};

		// ソート
		Arrays.sort(sample_data);
		System.out.println(Arrays.toString(sample_data));

		// 二分探索し、結果を返す
		BinarySearch(sample_data, 12);

		// 結果を出力する
	}

	private static boolean BinarySearch(int[] array, int target) {
		// 中央値を判定
		
		// 中央値より値が大きい場合
		
		// 中央値より値が小さい場合
		
		// 中央値と値が同じ場合
		
		// 見つからんかった場合
		return false;
	}
	
	
}
