package utils;

import model.Room;
import model.Schedule;
import model.Teacher;

import java.time.LocalTime;
import java.util.HashSet;


import java.util.HashMap;
import java.util.Map;
public class DataInit {
    public HashSet<Schedule> schedules = new HashSet<>();
    public HashSet<Teacher> teachers = new HashSet<>();
    public HashSet<Room> rooms = new HashSet<>();

    // Constructor to initialize data
    public DataInit() {
        // Initialize teachers
        teachers.add(new Teacher(1, "Lousily Enzo", "Male", "lousily.enzo@example.com", "123-456-7890", "Statistics Analysis"));
        teachers.add(new Teacher(2, "Jane Smith", "Female", "jane.smith@example.com", "987-654-3210", "JAVA Programming"));
        teachers.add(new Teacher(3, "Michael Johnson", "Male", "michael.johnson@example.com", "456-789-0123", ".Net Programming"));
        teachers.add(new Teacher(4, "Emily Brown", "Female", "emily.brown@example.com", "321-654-9870", "Computer Networks"));
        teachers.add(new Teacher(5, "David Wilson", "Male", "david.wilson@example.com", "789-012-3456", "Info. System Analysis & DeSign"));

        teachers.add(new Teacher(6, "Karo James", "Male", "karo.james@example.com", "123-456-7890", "Statistics Analysis"));
        teachers.add(new Teacher(7, "Alice Selina", "Female", "alice.selina@example.com", "987-654-3210", "JAVA Programming"));
        teachers.add(new Teacher(8, "Benz Jasmin", "Male", "benz.jasmin@example.com", "456-789-0123", ".Net Programming"));
        teachers.add(new Teacher(9, "Marry Jesus", "Female", "marry.jesus@example.com", "321-654-9870", "Computer Networks"));
        teachers.add(new Teacher(10, "Eka Rakes", "Male", "eka.rakes@example.com", "789-012-3456", "Info. System Analysis & DeSign"));

        // Map subjects to room types
        Map<String, String> subjectToRoomType = new HashMap<>();
        subjectToRoomType.put("Statistics Analysis", "Classroom");
        subjectToRoomType.put("JAVA Programming", "Lecture Hall");
        subjectToRoomType.put(".Net Programming", "Laboratory");
        subjectToRoomType.put("Computer Networks", "Conference Room");
        subjectToRoomType.put("Info. System Analysis & DeSign", "Seminar Room");

        // Initialize rooms based on subjects taught by teachers
        int roomNumber = 10;
        for (Teacher teacher : teachers) {
            String subject = teacher.getSubject();
            String roomType = subjectToRoomType.getOrDefault(subject, "Classroom"); // Default to Classroom if no match found
            rooms.add(new Room(roomNumber++, "Room " + roomNumber, 30, "Main Building", roomType));
        }
        //MORNING
        schedules.add(new Schedule(1,TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0),"MONDAY",findRoomByNumber(13),findTeacherById(2)));
        schedules.add(new Schedule(2,TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45),"MONDAY",findRoomByNumber(11),findTeacherById(1)));

        schedules.add(new Schedule(3,TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0),"TUESDAY",findRoomByNumber(13),findTeacherById(4)));
        schedules.add(new Schedule(4,TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45),"TUESDAY",findRoomByNumber(11),findTeacherById(3)));

        schedules.add(new Schedule(5,TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0),"WEDNESDAY",findRoomByNumber(13),findTeacherById(1)));
        schedules.add(new Schedule(6,TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45),"WEDNESDAY",findRoomByNumber(11),findTeacherById(2)));

        schedules.add(new Schedule(7,TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0),"THURSDAY",findRoomByNumber(13),findTeacherById(4)));
        schedules.add(new Schedule(8,TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45),"THURSDAY",findRoomByNumber(11),findTeacherById(5)));

        schedules.add(new Schedule(9,TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0),"FRIDAY",findRoomByNumber(13),findTeacherById(4)));
        schedules.add(new Schedule(10,TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45),"FRIDAY",findRoomByNumber(11),findTeacherById(5)));

        //AFTERNOON
        schedules.add(new Schedule(11,TimeSlot.AFTERNOON, LocalTime.of(7, 30), LocalTime.of(9, 0),"MONDAY",findRoomByNumber(13),findTeacherById(7)));
        schedules.add(new Schedule(12,TimeSlot.AFTERNOON, LocalTime.of(9, 15), LocalTime.of(10, 45),"MONDAY",findRoomByNumber(11),findTeacherById(6)));

        schedules.add(new Schedule(13,TimeSlot.AFTERNOON, LocalTime.of(7, 30), LocalTime.of(9, 0),"TUESDAY",findRoomByNumber(13),findTeacherById(8)));
        schedules.add(new Schedule(14,TimeSlot.AFTERNOON, LocalTime.of(9, 15), LocalTime.of(10, 45),"TUESDAY",findRoomByNumber(11),findTeacherById(7)));

        schedules.add(new Schedule(15,TimeSlot.AFTERNOON, LocalTime.of(7, 30), LocalTime.of(9, 0),"WEDNESDAY",findRoomByNumber(13),findTeacherById(6)));
        schedules.add(new Schedule(16,TimeSlot.AFTERNOON, LocalTime.of(9, 15), LocalTime.of(10, 45),"WEDNESDAY",findRoomByNumber(11),findTeacherById(9)));

        schedules.add(new Schedule(17,TimeSlot.AFTERNOON, LocalTime.of(7, 30), LocalTime.of(9, 0),"THURSDAY",findRoomByNumber(13),findTeacherById(10)));
        schedules.add(new Schedule(18,TimeSlot.AFTERNOON, LocalTime.of(9, 15), LocalTime.of(10, 45),"THURSDAY",findRoomByNumber(11),findTeacherById(9)));

        schedules.add(new Schedule(19,TimeSlot.AFTERNOON, LocalTime.of(7, 30), LocalTime.of(9, 0),"FRIDAY",findRoomByNumber(13),findTeacherById(8)));
        schedules.add(new Schedule(20,TimeSlot.AFTERNOON, LocalTime.of(9, 15), LocalTime.of(10, 45),"FRIDAY",findRoomByNumber(11),findTeacherById(10
        )));

        //EVENING
        schedules.add(new Schedule(21,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0),"MONDAY",findRoomByNumber(13),findTeacherById(1)));
        schedules.add(new Schedule(22,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 0),"MONDAY",findRoomByNumber(11),findTeacherById(3)));

        schedules.add(new Schedule(23,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0),"TUESDAY",findRoomByNumber(13),findTeacherById(2)));
        schedules.add(new Schedule(24,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 0),"TUESDAY",findRoomByNumber(11),findTeacherById(3)));

        schedules.add(new Schedule(25,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0), "WEDNESDAY",findRoomByNumber(13),findTeacherById(4)));
        schedules.add(new Schedule(26,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 0),"WEDNESDAY",findRoomByNumber(11),findTeacherById(9)));

        schedules.add(new Schedule(27,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0), "THURSDAY",findRoomByNumber(13),findTeacherById(1)));
        schedules.add(new Schedule(28,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 0),"THURSDAY",findRoomByNumber(11),findTeacherById(4)));

        schedules.add(new Schedule(30,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0), "FRIDAY",findRoomByNumber(13),findTeacherById(9)));
        schedules.add(new Schedule(10,TimeSlot.MORNING, LocalTime.of(7, 15), LocalTime.of(8, 0),"FRIDAY",findRoomByNumber(11),findTeacherById(9)));

    }
    // Method to find a room by room number
    private Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null; // Room not found
    }

    // Method to find a teacher by ID
    private Teacher findTeacherById(int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                return teacher;
            }
        }
        return null; // Teacher not found
    }
}
