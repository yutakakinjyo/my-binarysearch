
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// 二分探索を実装する		

		// サンプル配列の生成
		int[] sample_data = {3, 4, 12, 5, 10, 14, 25, 30, 49, 100};

		// ソート
		Arrays.sort(sample_data);
		System.out.println(Arrays.toString(sample_data));

		// 二分探索し、結果を返す
		boolean isPresence = BinarySearch(sample_data, 12);

		// 結果を出力する
		if(isPresence) {
			System.out.println("12はありました。");
		} else {
			System.out.println("12はありませんでした。");
		}
		
	}

	private static boolean BinarySearch(int[] array, int target) {
		// 中央値を判定
		int center = array[(array.length/2)]; 

		if (center > target) { // 中央値より値が大きい場合
			array = Arrays.copyOfRange(array, 0, array.length/2);
			return BinarySearch(array, target);
		} else if(center < target) { // 中央値より値が小さい場合
			array = Arrays.copyOfRange(array, array.length/2, array.length);
			return BinarySearch(array, target);
		} else if(center == target) { // 中央値と値が同じ場合
			return true;
		} else { // 見つからなかった場合
			return false;
		}
	}
}
