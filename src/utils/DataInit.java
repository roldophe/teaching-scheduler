package utils;

import model.Room;
import model.Schedule;
import model.Teacher;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DataInit {
    public List<Schedule> schedules = new ArrayList<>();
    public List<Teacher> teachers = new ArrayList<>();
    public List<Room> rooms = new ArrayList<>();

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
        //Initialize rooms
        rooms.add(new Room(11, "Algorithm Lab", 27, "Main Building", "Seminar Room"));
        rooms.add(new Room(12, "Programming Lab", 25, "Main Building", "Classroom"));
        rooms.add(new Room(13, "Data Structures Lab", 40, "East Wing", "Conference Room"));
        rooms.add(new Room(14, "Software Development Lab", 20, "West Wing", "Auditorium"));
        rooms.add(new Room(15, "Networking Lab", 35, "Main Building", "Meeting Room"));
        rooms.add(new Room(16, "Database Systems Lab", 30, "Main Building", "Seminar Room"));
        rooms.add(new Room(17, "Cybersecurity Lab", 28, "North Wing", "Classroom"));
        rooms.add(new Room(18, "Computer Science Library", 45, "Main Building", "Conference Room"));
        rooms.add(new Room(19, "Artificial Intelligence Lab", 22, "Main Building", "Laboratory"));
        rooms.add(new Room(20, "Machine Learning Lab", 30, "South Wing", "Meeting Room"));

        //Initialize schedules
        // MORNING
        schedules.add(new Schedule(1, TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0), "MONDAY", findRoomByName("Algorithm Lab"), findTeacherById(2)));
        schedules.add(new Schedule(2, TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45), "MONDAY", findRoomByName("Artificial Intelligence Lab"), findTeacherById(1)));
        schedules.add(new Schedule(3, TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0), "TUESDAY", findRoomByName("Cybersecurity Lab"), findTeacherById(4)));
        schedules.add(new Schedule(4, TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45), "TUESDAY", findRoomByName("Cybersecurity Lab"), findTeacherById(3)));
        schedules.add(new Schedule(5, TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0), "WEDNESDAY", findRoomByName("Networking Lab"), findTeacherById(5)));
        schedules.add(new Schedule(6, TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45), "WEDNESDAY", findRoomByName("Networking Lab"), findTeacherById(1)));
        schedules.add(new Schedule(7, TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0), "THURSDAY", findRoomByName("Data Structures Lab"), findTeacherById(3)));
        schedules.add(new Schedule(8, TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45), "THURSDAY", findRoomByName("Data Structures Lab"), findTeacherById(2)));
        schedules.add(new Schedule(9, TimeSlot.MORNING, LocalTime.of(7, 30), LocalTime.of(9, 0), "FRIDAY", findRoomByName("Computer Science Library"), findTeacherById(4)));
        schedules.add(new Schedule(10, TimeSlot.MORNING, LocalTime.of(9, 15), LocalTime.of(10, 45), "FRIDAY", findRoomByName("Computer Science Library"), findTeacherById(5)));
        // AFTERNOON
        schedules.add(new Schedule(11, TimeSlot.AFTERNOON, LocalTime.of(1, 30), LocalTime.of(3, 0), "MONDAY", findRoomByName("Cybersecurity Lab"), findTeacherById(9)));
        schedules.add(new Schedule(12, TimeSlot.AFTERNOON, LocalTime.of(3, 15), LocalTime.of(4, 45), "MONDAY", findRoomByName("Algorithm Lab"), findTeacherById(6)));
        schedules.add(new Schedule(13, TimeSlot.AFTERNOON, LocalTime.of(1, 30), LocalTime.of(3, 0), "TUESDAY", findRoomByName("Data Structures Lab"), findTeacherById(8)));
        schedules.add(new Schedule(14, TimeSlot.AFTERNOON, LocalTime.of(3, 15), LocalTime.of(4, 45), "TUESDAY", findRoomByName("Algorithm Lab"), findTeacherById(7)));
        schedules.add(new Schedule(15, TimeSlot.AFTERNOON, LocalTime.of(1, 30), LocalTime.of(3, 0), "WEDNESDAY", findRoomByName("Data Structures Lab"), findTeacherById(10)));
        schedules.add(new Schedule(16, TimeSlot.AFTERNOON, LocalTime.of(3, 15), LocalTime.of(4, 45), "WEDNESDAY", findRoomByName("Algorithm Lab"), findTeacherById(8)));
        schedules.add(new Schedule(17, TimeSlot.AFTERNOON, LocalTime.of(1, 30), LocalTime.of(3, 0), "THURSDAY", findRoomByName("Cybersecurity Lab"), findTeacherById(9)));
        schedules.add(new Schedule(18, TimeSlot.AFTERNOON, LocalTime.of(3, 15), LocalTime.of(4, 45), "THURSDAY", findRoomByName("Algorithm Lab"), findTeacherById(6)));
        schedules.add(new Schedule(19, TimeSlot.AFTERNOON, LocalTime.of(1, 30), LocalTime.of(3, 0), "FRIDAY", findRoomByName("Data Structures Lab"), findTeacherById(10)));
        schedules.add(new Schedule(20, TimeSlot.AFTERNOON, LocalTime.of(3, 15), LocalTime.of(4, 45), "FRIDAY", findRoomByName("Algorithm Lab"), findTeacherById(7)));

        //EVENING
//        schedules.add(new Schedule(21, TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0), "MONDAY", findRoomByName("Data Structures Lab"), findTeacherById(1)));
//        schedules.add(new Schedule(22, TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 30), "MONDAY", findRoomByName("Algorithm Lab"), findTeacherById(3)));
//        schedules.add(new Schedule(23,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0),"TUESDAY",findRoomByName("Algorithm Lab"),findTeacherById(10)));
//        schedules.add(new Schedule(24,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 30),"TUESDAY",findRoomByName("Cybersecurity Lab"),findTeacherById(9)));
//        schedules.add(new Schedule(25,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0),"WEDNESDAY",findRoomByName("Data Structures Lab"),findTeacherById(1)));
//        schedules.add(new Schedule(26,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 30),"WEDNESDAY",findRoomByName("Networking Lab"),findTeacherById(3)));
//        schedules.add(new Schedule(27,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0), "THURSDAY",findRoomByName("Algorithm Lab"),findTeacherById(10)));
//        schedules.add(new Schedule(28,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 30),"THURSDAY",findRoomByName("Data Structures Lab"),findTeacherById(2)));
//        schedules.add(new Schedule(29,TimeSlot.EVENING, LocalTime.of(5, 30), LocalTime.of(7, 0), "FRIDAY",findRoomByName("Algorithm Lab"),findTeacherById(2)));
//        schedules.add(new Schedule(30,TimeSlot.EVENING, LocalTime.of(7, 15), LocalTime.of(8, 30),"FRIDAY",findRoomByName("Networking Lab"),findTeacherById(9)));
    }

    // Method to find a room by room number
    public Room findRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null; // Room not found
    }

    // Method to find a teacher by ID
    public Teacher findTeacherById(int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                return teacher;
            }
        }
        return null; // Teacher not foundu
    }
    // Method to find a room by room name
    public Room findRoomByName(String roomName) {
        for (Room room : rooms) {
            if (room.getRoomName().equals(roomName)) {
                return room;
            }
        }
        return null; // Room not found
    }
}
