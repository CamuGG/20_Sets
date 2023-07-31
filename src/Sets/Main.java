package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> daysWeek = Set.of("Monday", "Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        System.out.println("daysWeek print in random order: " + daysWeek);

        Set<String> daysWeekInsertOrder = new LinkedHashSet<>();
        daysWeekInsertOrder.add("Monday");
        daysWeekInsertOrder.add("Tuesday");
        daysWeekInsertOrder.add("Wednesday");
        daysWeekInsertOrder.add("Thursday");
        daysWeekInsertOrder.add("Friday");
        daysWeekInsertOrder.add("Saturday");
        daysWeekInsertOrder.add("Sunday");

        System.out.println("\n daysWeekPrint in insert order: " + daysWeekInsertOrder);

        boolean firstSetEqualToSecondSet = (daysWeek == daysWeekInsertOrder);
        System.out.println("\nThe first is equals to second set ? " + firstSetEqualToSecondSet);


    }
}
