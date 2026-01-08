package com.xworkz.rapidoinst.external;

import com.xworkz.rapidoinst.dto.RapidoBookingDTO;
import com.xworkz.rapidoinst.internal.RapidoBookingInsert;

import java.sql.*;

public class RapidoBookingRunner {
    public static void main(String[] args) {
//        RapidoBookingDTO rapidoBookingDTO=new RapidoBookingDTO(1,"ram","KL",20,
//                "Bangalore",6734196329L,"KA03T5642",
//                "Male","Ravi",100);
//        RapidoBookingDTO rapidoBookingDTO=new RapidoBookingDTO(2,"sora","KL",21,
//                "Bangalore",6734196329L,"KA03T5642",
//                "female","raju",150);
//        RapidoBookingDTO rapidoBookingDTO=new RapidoBookingDTO(3,"raju","krishna",23,
//                "chennai",67341572619L,"KA03T5642",
//                "Male","dharshan",250);
//        RapidoBookingDTO rapidoBookingDTO=new RapidoBookingDTO(4,"rakesh","prabhu",28,
//                "hyderabad",34678546729L,"HY05T55642",
//                "Male","pooja",360);
        RapidoBookingDTO rapidoBookingDTO=new RapidoBookingDTO(5,"sneha","priya",27,
                "tumkur",645677329L,"KA07T5367",
                "female","varsha",60);
        RapidoBookingInsert rapidoBookingInsert=new RapidoBookingInsert();
        String saved=rapidoBookingInsert.save(rapidoBookingDTO);
        System.out.println(saved);


    }
}