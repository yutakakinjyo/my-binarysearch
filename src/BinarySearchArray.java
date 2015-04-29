import java.util.Arrays;


public class BinarySearchArray {

	int[] array;
	
	public BinarySearchArray(int[] array) {
		this.array = array;
	}
	
	public void sort() {
		Arrays.sort(array);
	}
	
	public String toString() {
		return Arrays.toString(array);
	}
	
}
