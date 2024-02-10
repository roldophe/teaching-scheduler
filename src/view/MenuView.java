package view;

import model.Schedule;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MenuView {
    public void logo(){
        System.out.println();
        System.out.println(" ".repeat(45)+"★".repeat(40));
        System.out.println(" ".repeat(40)+"★".repeat(8)+" ".repeat(3)+"Royal University of Phnom Penh"+" ".repeat(3)+"★".repeat(7));
        System.out.println(" ".repeat(40)+"★".repeat(9)+" ".repeat(3)+"Teacher Teaching Scheduler"+" ".repeat(4)+"★".repeat(8));
        System.out.println(" ".repeat(45)+"★".repeat(40));
        System.out.println();
    }

    public void mainMenu(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0,20,45);
        table.addCell("             >> Main Menu <<            ");
        table.addCell(" ".repeat(10)+"–".repeat(20));
        table.addCell("  1.Morning                 2.Afternoon  ");
        table.addCell("  3.Evening               4.Read Details ");
        table.addCell("            5.Exit Program            ");
        System.out.println(table.render());
    }

    // static table
    public void scheduleTable(List<Schedule> scheduleList){

        Schedule section1 = scheduleList.getFirst();
        Schedule section2 = scheduleList.get(1);
        Schedule section3= scheduleList.get(2);
        Schedule section4= scheduleList.get(3);
        Schedule section5= scheduleList.get(4);
        Schedule section6= scheduleList.get(5);
        Schedule section7= scheduleList.get(6);
        Schedule section8= scheduleList.get(7);
        Schedule section9= scheduleList.get(8);
        Schedule section10= scheduleList.get(9);

        System.out.println(" ".repeat(5)+"Department: Computer Science,  Year:3");
        System.out.println(" ".repeat(5)+"Room: 207, Building: B, Class: M7");

        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,30,45);
        table.setColumnWidth(2,30,45);
        table.setColumnWidth(3,30,45);
        table.setColumnWidth(4,30,45);
        table.setColumnWidth(5,30,45);

        table.setColumnWidth(0,15,20);
        table.setColumnWidth(1,30,45);
        table.setColumnWidth(2,30,45);
        table.setColumnWidth(3,30,45);
        table.setColumnWidth(4,30,45);
        table.setColumnWidth(5,30,45);
        table.addCell("Time ",cellStyle);
        table.addCell("Monday ", cellStyle);
        table.addCell("Tuesday ", cellStyle);
        table.addCell("Wednesday ", cellStyle);
        table.addCell("Thursday ", cellStyle);
        table.addCell("Friday ", cellStyle);

        table.addCell("");
        table.addCell(section1.getTeacher().getSubject(), cellStyle);
        table.addCell(section3.getTeacher().getSubject(), cellStyle);
        table.addCell(section5.getTeacher().getSubject(), cellStyle);
        table.addCell(section7.getTeacher().getSubject(), cellStyle);
        table.addCell(section9.getTeacher().getSubject(), cellStyle);

        table.addCell(section1.getStartTime()+" - "+section1.getEndTime(), cellStyle);
        table.addCell(section1.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section3.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section5.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section7.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section9.getTeacher().getTeacherName(), cellStyle);
        table.addCell("");


        table.addCell(section1.getRoom().getRoomName(), cellStyle);
        table.addCell(section3.getRoom().getRoomName(), cellStyle);
        table.addCell(section5.getRoom().getRoomName(), cellStyle);
        table.addCell(section7.getRoom().getRoomName(), cellStyle);
        table.addCell(section9.getRoom().getRoomName(), cellStyle);
        //END SECTION1

        table.addCell("───".repeat(60),cellStyle,6);

        //START SECTION2
        table.addCell(" ", cellStyle);
        table.addCell(section2.getTeacher().getSubject(), cellStyle);
        table.addCell(section4.getTeacher().getSubject(), cellStyle);
        table.addCell(section6.getTeacher().getSubject(), cellStyle);
        table.addCell(section8.getTeacher().getSubject(), cellStyle);
        table.addCell(section10.getTeacher().getSubject(), cellStyle);

        table.addCell(section2.getStartTime()+" - "+section2.getEndTime(), cellStyle);
        table.addCell(section2.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section4.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section6.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section8.getTeacher().getTeacherName(), cellStyle);
        table.addCell(section10.getTeacher().getTeacherName(), cellStyle);
        table.addCell("");


        table.addCell(section2.getRoom().getRoomName(), cellStyle);
        table.addCell(section4.getRoom().getRoomName(), cellStyle);
        table.addCell(section6.getRoom().getRoomName(), cellStyle);
        table.addCell(section8.getRoom().getRoomName(), cellStyle);
        table.addCell(section10.getRoom().getRoomName(), cellStyle);
        System.out.println(table.render());
//        System.out.println(table1.render());
    }

    public void scheduleDetailTable(Schedule schedule){
//        System.out.println("schedule>>:::: "   +schedule);
        System.out.println(" ".repeat(5)+"Department: Computer Science,  Year:3");
        System.out.println(" ".repeat(5)+"Room: 207, Building: B, Class: M7");
        Table table = new Table(12, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0,10,25);
        table.setColumnWidth(1,10,25);
        table.setColumnWidth(2,10,25);
        table.setColumnWidth(3,10,25);
        table.setColumnWidth(4,5,25);
        table.setColumnWidth(5,15,25);
        table.setColumnWidth(6,15,25);
        table.setColumnWidth(7,10,25);
        table.setColumnWidth(8,10,25);
        table.setColumnWidth(9,5,25);
        table.setColumnWidth(10,10,25);
        table.setColumnWidth(11,20,25);
        table.addCell("Class Schedule Details",cellStyle,13);
        table.addCell("Start Time ",cellStyle);
        table.addCell("End Time ",cellStyle);
        table.addCell("Day", cellStyle);
        table.addCell("Room Name ", cellStyle);
        table.addCell("Capacity ", cellStyle);
        table.addCell("Building ", cellStyle);
        table.addCell("Room Type ", cellStyle);
        table.addCell("Teacher Name", cellStyle);
        table.addCell("Gender", cellStyle);
        table.addCell("Email", cellStyle);
        table.addCell("Phone Number", cellStyle);
        table.addCell("Subject", cellStyle);

        table.addCell(schedule.getStartTime().toString(),cellStyle);
        table.addCell(schedule.getEndTime().toString(),cellStyle);
        table.addCell(schedule.getDay(), cellStyle);
        table.addCell(schedule.getRoom().getRoomName(), cellStyle);
        table.addCell(schedule.getRoom().getCapacity().toString(), cellStyle);
        table.addCell(schedule.getRoom().getBuilding(), cellStyle);
        table.addCell(schedule.getRoom().getRoomType(), cellStyle);
        table.addCell(schedule.getTeacher().getTeacherName(), cellStyle);
        table.addCell(schedule.getTeacher().getGender(), cellStyle);
        table.addCell(schedule.getTeacher().getEmail(), cellStyle);
        table.addCell(schedule.getTeacher().getPhoneNumber(), cellStyle);
        table.addCell(schedule.getTeacher().getSubject(), cellStyle);
        System.out.println(table.render());
    }

}
