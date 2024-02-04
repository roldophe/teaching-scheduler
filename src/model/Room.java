package model;
public class Room{
    private Integer roomNumber;
    private String roomName;
    private Integer capacity;
    private String building;
    private String roomType;

    public Room() {
    }

    public Room(Integer roomNumber, String roomName, Integer capacity, String building, String roomType) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.capacity = capacity;
        this.building = building;
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomName='" + roomName + '\'' +
                ", capacity=" + capacity +
                ", building='" + building + '\'' +
                ", roomType='" + roomType + '\'' +
                '}';
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }


}