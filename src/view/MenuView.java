package view;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

public class MenuView {
    public void logo(){
        System.out.println("★".repeat(40));
        System.out.println("★".repeat(8)+" ".repeat(3)+"Royal University of Phnom Penh"+" ".repeat(3)+"★".repeat(7));
        System.out.println("★".repeat(9)+" ".repeat(3)+"Teacher Teaching Scheduler"+" ".repeat(4)+"★".repeat(8));
        System.out.println("★".repeat(40));
    }

    public void mainMenu(){
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.setColumnWidth(0,20,25);
        table.addCell("  >> Main Menu << ");
        table.addCell("–".repeat(20));
        table.addCell("  1.Morning");
        table.addCell("  2.Afternoon");
        table.addCell("  3.Evening");
        table.addCell("  4.Read Details");
        table.addCell("  5.Exit Program");
        System.out.println(table.render());
    }

    // static table
    /*public void scheduleTable(){
        System.out.println(" ".repeat(5)+"Department: Computer Science,  Year:3");
        System.out.println(" ".repeat(5)+"Room: 207, Building: B, Class: M7");
        Table table = new Table(6, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.ALL);
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        table.setColumnWidth(0,10,15);
        table.setColumnWidth(1,20,25);
        table.setColumnWidth(2,20,25);
        table.setColumnWidth(3,20,25);
        table.setColumnWidth(4,20,25);
        table.setColumnWidth(5,20,25);
        table.addCell("Time ");
        table.addCell("Monday ", cellStyle);
        table.addCell("Tuesday ", cellStyle);
        table.addCell("Wednesday ", cellStyle);
        table.addCell("Thursday ", cellStyle);
        table.addCell("Friday ", cellStyle);
        table.addCell(" ", cellStyle);
        table.addCell("Java Programming", cellStyle);
        table.addCell("Statistics Analysis ", cellStyle);
        table.addCell("Infor. System ", cellStyle);
        table.addCell("Java Programming ", cellStyle);
        table.addCell("Infor. System ", cellStyle);
        table.addCell("–".repeat(10));
        table.addCell("–".repeat(20));
        table.addCell("–".repeat(20));
        table.addCell("–".repeat(20));
        table.addCell("–".repeat(20));
        table.addCell("–".repeat(20));
        System.out.println(table.render());

    }*/
}
