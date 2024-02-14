package service.impl;

import model.Room;
import model.Schedule;
import service.RoomService;
import utils.DataInit;
import view.MenuView;
import view.ScheduleMenu;

public class RoomServiceImpl implements RoomService {

    ScheduleMenu scheduleMenu = new ScheduleMenu();
    @Override
    public void create() {

    }

    @Override
    public void readAll() {
        MenuView menuView = new MenuView();
        menuView.scheduleInfo(null,new DataInit().rooms);
    }


    @Override
    public Room readById(Integer id) {
        return null;
    }

    @Override
    public Room readByName(String name) {
        return null;
    }
}
