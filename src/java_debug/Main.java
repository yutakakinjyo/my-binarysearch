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

	private static void BinarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		
	}
	
	
}
