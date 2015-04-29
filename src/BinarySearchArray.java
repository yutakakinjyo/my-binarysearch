import java.util.Arrays;


public class BinarySearchArray {

	private int[] array;
	
	public BinarySearchArray(int[] array) {
		this.array = array;
	}
	
	public void sort() {
		Arrays.sort(array);
	}
	
	public String toString() {
		return Arrays.toString(array);
	}
	
	public boolean BinarySearch(int target) { 

		int index = array.length/2;
		int center = array[index]; 

		// 中央値を判定
		if (center == target) { // 中央値と値が同じ場合
			return true;
		} else if(array.length == 1) { // 見つからなかった場合 
			return false;
		} else if (center < target) { // 中央値より値が大きい場合
			array = Arrays.copyOfRange(array, 0, index);
			return BinarySearch(target);
		} else { // 中央値より値が小さい場合
			array = Arrays.copyOfRange(array, index, array.length);
			return BinarySearch(target);
		}
	}			
	
}
