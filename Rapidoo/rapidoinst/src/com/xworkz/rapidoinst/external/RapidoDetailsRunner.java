package com.xworkz.rapidoinst.external;

import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;
import com.xworkz.rapidoinst.internal.RapidoDetailsInsert;

public class RapidoDetailsRunner {
    public static void main(String[] args) {
//        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(1,"Nandu","Sai",
//                21,"nandu4567@gmail.com",
//                4528150264L,"Male","India",
//                "Mangalore",250);
//        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(2,"ravi","deep",
//                26,"ravi678bhj@gmail.com",
//                6873075532L,"Male","India","Mangalore",250);
//        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(3,"karthik","Sai",
//                27,"karthik678rtghsdb@gmail.com",
//                5672810364L,"Male","India","Mangalore",250);
//        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(4,"ankitha","kumari",
//                24,"ankithakumari@gmail.com",
//                 6873075532L,"female","India","Mangalore",250);
        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(5,"sree","Sai",
                24,"sree8378nshdj@gmail.com",
                454678982L,"female","India","Mangalore",250);
        RapidoDetailsInsert rapidoDetailsInsert = new RapidoDetailsInsert();
        String saved = rapidoDetailsInsert.start(rapidoDetailsDTO);
        System.out.println(saved);
    }
}