
import java.util.*;

public class AttendancePercentage {
    public static void main(String[] args) {

        int[] attendanceData = {
            1,1,1,0,1,1,1,1,1,1,0,
            0,1,1,1,0,1,1,1,0,1
        };

        int totalClassesAttended = 0;

        for (int attendance : attendanceData) {
            if (attendance == 1) {
                totalClassesAttended++;
            }
        }

        int totalClasses = attendanceData.length;
        int absentClasses = totalClasses - totalClassesAttended;

        double attendancePercentage =
            (double) totalClassesAttended / totalClasses * 100;

        System.out.println("----- ATTENDANCE REPORT -----");

        System.out.println("Total Classes: " + totalClasses);
        System.out.println("Classes Attended: " + totalClassesAttended);
        System.out.println("Classes Absent: " + absentClasses);

        System.out.printf("Attendance Percentage: %.2f%%\n",
                          attendancePercentage);

        if (attendancePercentage >= 75) {
            System.out.println("Exam Eligibility: Eligible");
        } else {
            System.out.println("Exam Eligibility: Not Eligible");
        }
    }
}
