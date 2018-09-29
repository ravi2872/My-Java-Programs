package generalprograms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			numbers.add(i);
		}
		numbers.add(33);
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number: " + dn.findDuplicateNumber(numbers));
	}

	public int findDuplicateNumber(List<Integer> numbers) {

		int highestNumber = numbers.size() - 1;
		int total = getSum(numbers);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
	}

	public int getSum(List<Integer> numbers) {

		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

}
