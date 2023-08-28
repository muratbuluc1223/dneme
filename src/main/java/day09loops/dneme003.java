package day09loops;

public class dneme003 {
    public static void main(String[] args) {
        int totalWeeks = 4;
        int daysPerWeek = 7;

        for (int week = 1; week <= totalWeeks; week++) {
            System.out.println("Week: " + week);
            for (int day = 1; day <= daysPerWeek; day++) {
                System.out.println("  Day: " + day);
            }

        }
    }
}
