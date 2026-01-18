package com.xworkz.exceldata.main;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Main {

    public static void main(String[] args) {

        String excelPath = "C:\\Users\\admin\\Documents\\student.xlsx";
        String url = "jdbc:mysql://localhost:3306/student_db";
        String userName = "root";
        String password = "Ammu@5182603";
        String sql = "insert into student_table values (?, ?, ?, ?, ?)";

//        try {
//                FileInputStream fis = new FileInputStream(excelPath);
//                Workbook workbook = new XSSFWorkbook(fis);
//                Connection con = DriverManager.getConnection(url, userName, password);
//                PreparedStatement ps = con.prepareStatement(sql);
//
//
//            Sheet sheet = workbook.getSheetAt(0);
//            DataFormatter formatter = new DataFormatter();
//            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//
//            int batchSize = 0;
//
//            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//
//                Row row = sheet.getRow(i);
//                if (row == null) {
//                    continue;
//                }
//
//                if (row.getCell(1) == null || formatter.formatCellValue(row.getCell(1)).isEmpty()) {
//                    continue;
//                }
//
//                ps.setString(1, formatter.formatCellValue(row.getCell(0)));
//                ps.setString(2, formatter.formatCellValue(row.getCell(1)));
//                ps.setLong(3, Long.parseLong(formatter.formatCellValue(row.getCell(2))));
//                ps.setInt(4, Integer.parseInt(formatter.formatCellValue(row.getCell(3))));
//
//                Cell dateCell = row.getCell(4);
//                Date utilDate;
//
//                if (dateCell != null && dateCell.getCellType() == CellType.NUMERIC) {
//                    utilDate = dateCell.getDateCellValue();
//                } else {
//                    utilDate = sdf.parse(formatter.formatCellValue(dateCell));
//                }
//
//                ps.setDate(5, new java.sql.Date(utilDate.getTime()));
//
//                ps.addBatch();
//                batchSize++;
//
//                if (batchSize == 5) {
//                    ps.executeBatch();
//                    batchSize = 0;
//                }
//            }
//
//            ps.executeBatch();
//            System.out.println("Batch insertion completed successfully!");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

        try {
            FileInputStream file = new FileInputStream(new File(excelPath));
            Workbook workbook = new XSSFWorkbook(file);
            DataFormatter dataFormatter = new DataFormatter();
            Iterator<Sheet> sheets = workbook.sheetIterator();
            while (sheets.hasNext()) {
                Sheet sheet = sheets.next();
                System.out.println("Sheet name is : " + sheet.getSheetName());
                System.out.println("==========");
                Iterator<Row> iterator = sheet.iterator();
                while (iterator.hasNext()) {
                    Row row = iterator.next();
                    Iterator<Cell> cellIterator = row.iterator();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        String cellValue = dataFormatter.formatCellValue(cell);
//                    if(cell.getCellType()==CellType.STRING){
//                }
                        System.out.print(cellValue + " \t ");
                    }
                    System.out.println();
                }
            }
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
