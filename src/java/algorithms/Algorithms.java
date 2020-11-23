package java.algorithms;

public class Algorithms {

	Integer checkMax(Integer[] ints) {
		Integer maxValue = 0;
		for(int i=0;i<ints.length;i++) {
			if(ints[i] > maxValue) {
				maxValue = ints[i];
			}
		}
		return maxValue;
	}

	Integer checkMin(Integer[] ints) {
		Integer minValue = 0;
		for(int i=0;i<ints.length;i++) {
			if(ints[i] < minValue) {
				minValue = ints[i];
			}
		}
		return minValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] ints = {-1,7,3,12,-6,15};
		System.out.println("Hello People");
		Algorithms e = new Algorithms();
		System.out.println("Max Value: "+e.checkMax(ints));
		System.out.println("Min Value: "+e.checkMin(ints));
	}
}