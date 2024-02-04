package model;

import utils.TimeSlot;

import java.time.LocalTime;

public class Schedule{
    private Integer scheduleId;
    private TimeSlot timeSlot;
    private LocalTime startTime;
    private LocalTime endTime;
    private String day;
    private Room room;
    private Teacher teacher;

    public Schedule() {
    }

    public Schedule(Integer scheduleId, TimeSlot timeSlot, LocalTime startTime, LocalTime endTime, String day, Room room, Teacher teacher) {
        this.scheduleId = scheduleId;
        this.timeSlot = timeSlot;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", day='" + day + '\'' +
                ", room=" + room +
                ", teacher=" + teacher +
                '}';
    }
}
