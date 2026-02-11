// STUDENT NAME: Kaan Kocaman
// DATE: 2/22/2026

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int todayMonth, todayDay, todayYear;
		int birthMonth, birthDay, birthYear;
		
		int a, y, m;
		int jdnToday, jdnBirth;
		int differenceDays;
		int ageYears;

		/***** INITIALIZATION SECTION *****/
		todayMonth = 2;
		todayDay = 22;
		todayYear = 2026;

		// Example birthday (change if needed)
		birthMonth = 8;
		birthDay = 26;
		birthYear = 1918;

		/***** INPUT SECTION *****/
		// N/A

		/***** CALCULATION & PROCESSING SECTION *****/

		// JDN for today
		a = (14 - todayMonth) / 12;
		y = todayYear + 4800 - a;
		m = todayMonth + 12 * a - 3;

		jdnToday = todayDay + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

		// JDN for birthday
		a = (14 - birthMonth) / 12;
		y = birthYear + 4800 - a;
		m = birthMonth + 12 * a - 3;

		jdnBirth = birthDay + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

		// Difference
		differenceDays = jdnToday - jdnBirth;

		// Approximate age
		ageYears = differenceDays / 365;

		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, "
				+ todayMonth + "/" + todayDay + "/" + todayYear
				+ ", is " + jdnToday);
		System.out.println();
		System.out.println("Julian Day Number for birthday, "
				+ birthMonth + "/" + birthDay + "/" + birthYear
				+ ", is " + jdnBirth);
		System.out.println();
		System.out.println("The difference in days is " 
				+ differenceDays 
				+ ", which makes you approximately " 
				+ ageYears 
				+ " years old!");
  }
}