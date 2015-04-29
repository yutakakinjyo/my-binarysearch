
import java.util.Arrays;

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
		boolean isPresence = BinarySearch(array.array, TARGET);

		// 結果を出力する
		if(isPresence) {
			System.out.println(TARGET + "はありました。");
		} else {
			System.out.println(TARGET + "はありませんでした。");
		}

	}

	private static boolean BinarySearch(int[] array, int target) { 

		int index = array.length/2;
		int center = array[index]; 

		// 中央値を判定
		if (center == target) { // 中央値と値が同じ場合
			return true;
		} else if(array.length == 1) { // 見つからなかった場合 
			return false;
		} else if (center < target) { // 中央値より値が大きい場合
			array = Arrays.copyOfRange(array, 0, index);
			return BinarySearch(array, target);
		} else { // 中央値より値が小さい場合
			array = Arrays.copyOfRange(array, index, array.length);
			return BinarySearch(array, target);
		}
	}				
}

