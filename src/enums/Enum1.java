package enums;

import java.util.Arrays;

public class Enum1 {
	public static void main(String[] args) {
		Today today = new Today(WeekDays.MONDAY);
		today.daysInfo();

		WeekDays w = WeekDays.FRIDAY;

		System.out.println(today.weekDay);

		WeekDays w2 = WeekDays.valueOf("MONDAY");
		System.out.println(w2);

		WeekDays[] array = WeekDays.values();
		System.out.println(Arrays.toString(array));
	}
}

enum WeekDays {
	MONDAY("bad"),
	TUESDAY("bad"),
	WEDNESDAY("so-so"),
	THURSDAY("so-so"),
	FRIDAY("good"),
	SATURDAY("great"),
	SUNDAY("good");

	private String mood;

	private WeekDays(String mood) {
		this.mood = mood;
	}

	public String getMood() {
		return mood;
	}
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
		System.out.println("Nastroenie v etot den: " + weekDay.getMood());
	}
}