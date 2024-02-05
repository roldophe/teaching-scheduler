package menu;

import model.Schedule;
import service.ScheduleService;
import service.impl.ScheduleServiceImpl;
import utils.TimeSlot;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
public class ScheduleMenu {
    private final ScheduleService scheduleService = new ScheduleServiceImpl();
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSchedule Menu:");
            System.out.println("1. Morning");
            System.out.println("2. Afternoon");
            System.out.println("3. Evening");
            System.out.println("4. ReadDetail");

            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1: {
                    List<Schedule> schedules = scheduleService.readAll(TimeSlot.MORNING);

                    for (Schedule schedule: schedules)
                        System.out.println(schedule);

                }
                    break;
                case 2: {
                    List<Schedule> schedules = scheduleService.readAll(TimeSlot.AFTERNOON);
                    for (Schedule schedule: schedules){
                        System.out.println(schedule);
                    }
                }
                    break;
                case 3: {
                    List<Schedule> schedules = scheduleService.readAll(TimeSlot.EVENING);
                    for (Schedule schedule: schedules){
                        System.out.println(schedule);
                    }
                }
                    break;
                case 4: {
                        System.out.print("Please input start time (HH:MM): ");
                        String inputTime = scanner.nextLine();
                        System.out.print("Please input day (MONDAY): ");
                        String day = scanner.nextLine();
                        LocalTime timeStart = LocalTime.parse(inputTime);

                        Schedule schedule = scheduleService.readDetailByTimeStartAndDay(timeStart, day);
                        System.out.println(schedule);
                }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
