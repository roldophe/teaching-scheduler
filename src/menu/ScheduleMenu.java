package menu;

import model.Schedule;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;
import service.ScheduleService;
import service.impl.ScheduleServiceImpl;
import utils.TimeSlot;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;


public class ScheduleMenu {
    private final ScheduleService scheduleService = new ScheduleServiceImpl();
    //private final ScheduleMenu scheduleMenu = new ScheduleMenu(); // stack overflow
    public void displayMenu() {
        logo();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            mainMenu();
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

    public void logo(){
        System.out.println("★".repeat(40));
        System.out.println("★".repeat(8)+" ".repeat(3)+"Royal University of Phnom Penh"+" ".repeat(3)+"★".repeat(7));
        System.out.println("★".repeat(9)+" ".repeat(3)+"Teacher Teaching Scheduler"+" ".repeat(4)+"★".repeat(8));
        System.out.println("★".repeat(40));
    }

    public static void mainMenu(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0,20,25);
        table.addCell("  >> Main Menu << ");
        table.addCell("–".repeat(20));
        table.addCell("  1.Morning");
        table.addCell("  2.Afternoon");
        table.addCell("  3.Evening");
        table.addCell("  4.Read Details");
        table.addCell("  5.Exit Program");
        System.out.println(table.render());
    }

}
