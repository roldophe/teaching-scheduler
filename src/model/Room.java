package model;

public class Room extends SchoolMember{
    private Integer roomNumber;
    private String roomName;
    private Integer numberStudent;
    private String building;
    public Room(){}
    public Room(Integer roomNumber, String roomName, Integer numberStudent, String building) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.numberStudent = numberStudent;
        this.building = building;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(Integer numberStudent) {
        this.numberStudent = numberStudent;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
