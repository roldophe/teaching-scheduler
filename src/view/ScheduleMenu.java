package view;

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
        MenuView menuView = new MenuView();
        menuView.logo();
//        menuView.scheduleDetailTable(null);
        boolean exit = false;
        while (!exit) {
            menuView.mainMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (choice) {
                case 1: {
                    List<Schedule> schedules = scheduleService.readAll(TimeSlot.MORNING);
                    menuView.scheduleTable(schedules);
                }
                    break;
                case 2: {
                    List<Schedule> schedules = scheduleService.readAll(TimeSlot.AFTERNOON);
                        menuView.scheduleTable(schedules);

                }
                    break;
                case 3: {
                    List<Schedule> schedules = scheduleService.readAll(TimeSlot.EVENING);
//                    schedules.forEach(System.out::println);
                        menuView.scheduleTable(schedules);
                }
                    break;
                case 4: {
                        System.out.print("Please input start time (HH:MM): ");
                        String inputTime = scanner.nextLine();
                        System.out.print("Please input day (MONDAY): ");
                        String day = scanner.nextLine();
                        LocalTime timeStart = LocalTime.parse(inputTime);
                            Schedule schedule = scheduleService.readDetailByTimeStartAndDay(timeStart, day);
                            if (schedule!=null)
                                menuView.scheduleDetailTable(schedule);
                            else
                                System.out.println("Search Not Found!!");
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
