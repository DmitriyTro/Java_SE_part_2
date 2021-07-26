package enums;

public class Enum1 {
	public static void main(String[] args) {
		Today today = new Today(WeekDays.MONDAY);
		today.daysInfo();
	}
}

enum WeekDays {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

class Today {
	WeekDays weekDay;

	public Today(WeekDays weekDay) {
		this.weekDay = weekDay;
	}

	void daysInfo() {
		switch (weekDay) {
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
				System.out.println("Idi na rabotu!");
				break;
			case SATURDAY:
			case SUNDAY:
				System.out.println("Mojno otdohnut.");
		}
	}
}