package model;

import java.time.LocalTime;

public class Schedule extends SchoolMember{
    private Integer scheduleId;
    private LocalTime time;
    private String day;
    private Room room;
    private Teacher teacher;

    public Schedule() {
    }

    public Schedule(Integer scheduleId, LocalTime time, String day, Room room, Teacher teacher) {
        this.scheduleId = scheduleId;
        this.time = time;
        this.day = day;
        this.room = room;
        this.teacher = teacher;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
