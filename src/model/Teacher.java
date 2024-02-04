package model;

public class Teacher extends SchoolMember{
    private Integer teacherId;
    private String teacherName;
    private String gender;
    private String email;
    private String phoneNumber;
    private String subject;

    public Teacher() {
    }

    public Teacher(Integer teacherId, String teacherName, String gender, String email, String phoneNumber, String subject) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subject = subject;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
