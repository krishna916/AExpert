import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {

  public static void main(String[] args) {
	// TODO Auto-generated method stub
	int[] a = new int[] { 3, 5, -4, 8, 11, 1, -1, 6 };
	int[] res = twoNumSum(a, 0);
	  for (int re : res) {
		  System.out.println(re);
	  }
  }

  /*
   * returns array of two number which on sum will produce targetSum
   * targetSum = x + y; where x and y are two numbers from array
   * y = targetSum - x; here x is current element in iteration and y is element in map.
   */
  static int[] twoNumSum(int[] arr, int targetSum) {
	int[] result = new int[2];
	Map<Integer, Boolean> arrElements = new HashMap<>();
	  for (int j : arr) {
		  int num = targetSum - j;

		  if (!arrElements.containsKey(num)) {
			  arrElements.put(j, true);
		  } else {
			  return new int[]{num, j};
		  }

	  }
	return result;
  }

}
