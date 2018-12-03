package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) throws IllegalArgumentException {
		if (b == 0.0)
			throw new IllegalArgumentException();
		else
			return a / b;
	}

	public String reverseString(String s) throws IllegalStateException {
		if (s.length() == 0)
			throw new IllegalStateException();
		else {
			String ret = "";
			for (int i = s.length() - 1; i >= 0; i--)
				ret += s.charAt(i);
			return ret;
		}
	}
}
