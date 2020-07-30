
class Leap {

	public static void main(String[] args) {

		int x = 2018;

		if(x % 400 == 0 || (x % 100 != 0 && x % 4 == 0))
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
}
