package service.impl;

import model.Schedule;
import service.ScheduleService;
import utils.DataInit;
import utils.TimeSlot;

import java.time.LocalTime;
import java.util.*;

public class ScheduleServiceImpl implements ScheduleService {
    List<Schedule> schedules = new DataInit().schedules;

    @Override
    public void create(List<Schedule> schedules) {
        if (schedules != null)
            this.schedules.addAll(schedules);
        else
            System.out.println("Something when wrong!!");
    }
    @Override
    public List<Schedule> readAll(TimeSlot timeSlot) {
        List<Schedule> scheduleList = new ArrayList<>();
            System.out.println("\nSchedules for " + timeSlot + ":");
            for (Schedule schedule : schedules)
                if (schedule.getTimeSlot() == timeSlot)
                    scheduleList.add(schedule);
        scheduleList.sort(Comparator.comparingInt((Schedule::getScheduleId)));
        return scheduleList;
    }

    @Override
    public Schedule readDetailByTimeStartAndDay(LocalTime startTime, String day) {
        List<Schedule> schedules = new DataInit().schedules;
        for (Schedule schedule : schedules)
            if (schedule.getStartTime().equals(startTime) && schedule.getDay().equalsIgnoreCase(day))
                return schedule;
        return null;
    }

    @Override
    public Schedule readByName(String name) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(Integer id) {

    }

}
