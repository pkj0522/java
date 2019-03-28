import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열

	void set(String wok, String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

public class MonthSchedule {
	private int nDays;
	private Day[] days; // Day 객체 배열
	private Scanner scanner;

	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
		scanner = new Scanner(System.in);
	}

	private void input() {
		System.out.print("날짜(1~30)?");
		int day = scanner.nextInt();
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		day--;

		if (day < 0 || day > nDays) { // 0~29만 유효
			System.out.println("날짜 잘못 입력하였습니다.!");

			return;
		}
		days[day].set(work, work);
	}

	private int view() {
		System.out.print("날짜(1-30)?");
		int day = scanner.nextInt();
		day--;
		if (day < 0 || day > nDays) { // 0~29만 유효
			System.out.println("날짜 잘못 입력하였습니다.!");

			return 0;
		}
		System.out.print((day + 1) + "일의 할 일은");
		days[day].show();
		return day;
	}

	private void finish() {
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
	}

	public void run() {
		System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
		int memu = scanner.nextInt();
		int menu = 0;
		switch (menu) {
		case 1:
			input();
			break;
		case 2:
			view();
			break;
		case 3:
			finish();
			return;
		default:
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30); // 4월달의 한 일
		april.run();
	}

}