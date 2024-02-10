package service;

import model.Teacher;

import java.util.List;

public interface TeacherService {
    void create(Teacher teacher);
    void update(Integer id, Teacher teacher);
    void readAll();
    Teacher readById(Integer id);
    Teacher readByName(String name);
    void delete(Integer id);
}
