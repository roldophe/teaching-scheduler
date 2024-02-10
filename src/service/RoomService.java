package service;

import model.Room;

import java.util.List;

public interface RoomService {
    void create();
    void readAll();
    Room readById(Integer id);
    Room readByName(String name);
}
