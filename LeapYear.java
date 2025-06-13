import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		System.out.print("enter the year  :");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if (isLeapYear(year)) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is NOT a leap year.");
		}
	}
	static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		} else if (year % 4 == 0 && year % 100 != 0) {
			return true;
		} else {
			return false;
		}
	}
}
