package view;

import model.Room;
import model.Schedule;
import model.Teacher;
import service.ScheduleService;
import service.impl.ScheduleServiceImpl;
import utils.DataInit;
import utils.TimeSlot;
import java.time.LocalTime;
import java.util.*;

public class ScheduleMenu {
    private final ScheduleService scheduleService = new ScheduleServiceImpl();
    DataInit dataInit = new DataInit();
    List<Schedule> schedules = new DataInit().schedules;
    int scheduleIdCounter = schedules.size()+1;
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        MenuView menuView = new MenuView();
        menuView.logo();
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
                case 5: {
                    List<Teacher> teacherList = new ArrayList<>(new DataInit().teachers);
                    List<Room> roomList = new ArrayList<>(new DataInit().rooms);
                    teacherList.sort(Comparator.comparingInt(Teacher::getTeacherId));
                    roomList.sort(Comparator.comparingInt(Room::getRoomNumber));
                    menuView.scheduleInfo(teacherList,roomList);
                    List<Schedule> scheduleList = new ArrayList<>();
                    System.out.print("\tPlease insert time slot(1. MORNING 2. AFTERNOON 3. EVENING): ");
                    int timeSlot = scanner.nextInt();
                    if (timeSlot >= 1 && timeSlot <= 3) {
                        for (int i = 0; i < 10; i++) {
                            Schedule schedule = new Schedule();
                            switch (timeSlot) {
                                case 1:
                                    setMorningSchedule(schedule, i);
                                    break;
                                case 2:
                                    setAfternoonSchedule(schedule, i);
                                    break;
                                case 3:
                                    setEveningSchedule(schedule, i);
                                    break;
                                default:
                                    System.out.println("Invalid time slot!");
                                    continue;
                            }
                            scheduleList.add(setScheduleDetails(schedule, i, scanner));
                        }
                        scheduleService.create(scheduleList);
                    } else {
                        System.out.println("Invalid time slot!");
                    }
                }
                break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
    public String getDayOfWeek(int dayIndex) {
        String dayOfWeek;
        switch (dayIndex) {
            case 0, 1 -> dayOfWeek = "MONDAY";
            case 2, 3 -> dayOfWeek = "TUESDAY";
            case 4, 5 -> dayOfWeek = "WEDNESDAY";
            case 6, 7 -> dayOfWeek = "THURSDAY";
            case 8, 9 -> dayOfWeek = "FRIDAY";
            default -> dayOfWeek = "UNKNOWN";
        };
        return dayOfWeek;
    }
    private Schedule setScheduleDetails(Schedule schedule, int dayIndex ,Scanner scanner) {
        schedule.setDay(getDayOfWeek(dayIndex));
        switch (dayIndex % 2) {

            case 0:
                System.out.println("ON " + getDayOfWeek(dayIndex) + " SECTION I");
                break;
            case 1:
                System.out.println("ON " + getDayOfWeek(dayIndex) + " SECTION II");
                break;
        }
        schedule.setScheduleId(scheduleIdCounter);
        scheduleIdCounter++;
        System.out.print("Please insert TeacherID: ");
        int teacherID = scanner.nextInt();
        schedule.setTeacher(dataInit.findTeacherById(teacherID));

        System.out.print("Please insert RoomID: ");
        int roomID = scanner.nextInt();
        schedule.setRoom(dataInit.findRoomByNumber(roomID));
        return schedule;
    }
    private void setMorningSchedule(Schedule schedule, int i) {
        schedule.setTimeSlot(TimeSlot.MORNING);
        if (i % 2 == 0) {
            schedule.setStartTime(LocalTime.of(7, 30));
            schedule.setEndTime(LocalTime.of(9, 0));
        } else {
            schedule.setStartTime(LocalTime.of(9, 15));
            schedule.setEndTime(LocalTime.of(10, 45));
        }
    }
    private void setAfternoonSchedule(Schedule schedule, int i) {
        schedule.setTimeSlot(TimeSlot.AFTERNOON);
        if (i % 2 == 0) {
            schedule.setStartTime(LocalTime.of(1, 30));
            schedule.setEndTime(LocalTime.of(3, 0));
        } else {
            schedule.setStartTime(LocalTime.of(3, 15));
            schedule.setEndTime(LocalTime.of(4, 45));
        }
    }
    private void setEveningSchedule(Schedule schedule, int i) {
        schedule.setTimeSlot(TimeSlot.EVENING);
        if (i % 2 == 0) {
            schedule.setStartTime(LocalTime.of(5, 30));
            schedule.setEndTime(LocalTime.of(7, 0));
        } else {
            schedule.setStartTime(LocalTime.of(7, 15));
            schedule.setEndTime(LocalTime.of(8, 30));
        }
    }
}
