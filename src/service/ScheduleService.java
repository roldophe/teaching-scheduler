package service;

import model.Schedule;
import utils.TimeSlot;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.List;

public interface ScheduleService {
    void create(List<Schedule> schedules);
    void update(Integer id);
    List<Schedule> readAll(TimeSlot timeSlot);
    Schedule readDetailByTimeStartAndDay(LocalTime startTime,String day);
    Schedule readByName(String name);
    void delete(Integer id);
}
