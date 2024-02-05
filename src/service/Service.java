package service;

public interface Service {
    void create();
    void update();
    void readAll();
    Object readById(Integer id);
    Object readByName(String name);
    void delete(Integer id);
}
