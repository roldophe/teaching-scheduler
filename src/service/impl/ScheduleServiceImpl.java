package service.impl;

import model.Schedule;
import service.ScheduleService;
import utils.DataInit;
import utils.TimeSlot;

import java.time.LocalTime;
import java.util.*;

public class ScheduleServiceImpl implements ScheduleService {

    @Override
    public void create(Schedule schedule) {

    }

    @Override
    public void update(Integer id) {

    }

    @Override
    public List<Schedule> readAll(TimeSlot timeSlot) {
        Set<Schedule> schedules = new DataInit().schedules;
        List<Schedule> scheduleList = new ArrayList<>();
            System.out.println("\nSchedules for " + timeSlot + ":");
            for (Schedule schedule : schedules) {
                if (schedule.getTimeSlot() == timeSlot) {
                    scheduleList.add(schedule);
                }
            }
        scheduleList.sort(Comparator.comparingInt((Schedule::getScheduleId)));
        return scheduleList;
    }

    @Override
    public Schedule readDetailByTimeStartAndDay(LocalTime startTime, String day) {
        Set<Schedule> schedules = new DataInit().schedules;

        // Filter schedules based on the given start time and day
        for (Schedule schedule : schedules) {
            if (schedule.getStartTime().equals(startTime) && schedule.getDay().equalsIgnoreCase(day)) {
                return schedule;
            }
        }
        return null;
    }

    @Override
    public Schedule readByName(String name) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }


}
