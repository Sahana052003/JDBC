package com.xworkz.rapidoinst.external;

import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;
import com.xworkz.rapidoinst.dto.RapidoDriverDTO;
import com.xworkz.rapidoinst.internal.RapidoDetailsInsert;
import com.xworkz.rapidoinst.internal.RapidoDriverInsert;

public class RapidoDriverRunner {
    public static void main(String[] args) {
//        RapidoDriverDTO rapidoDriverDTO = new RapidoDriverDTO(1,"sana","reddy",
//                21,"sana4567@gmail.com",
//                473618452825L,47623892363L,
//                "4 years","Mangalore",250);
//        RapidoDriverDTO rapidoDriverDTO = new RapidoDriverDTO(2,"karthik","reddy",
//                28,"karthik37@gmail.com",
//                452845283593L,5629569262L,
//                "4 years","Mangalore",250);
//        RapidoDriverDTO rapidoDriverDTO = new RapidoDriverDTO(3,"rajesh","reddy",
//                27,"rajesg678@gmail.com",
//                473618452825L,567892372L,
//                "4 years","Mangalore",250);
//        RapidoDriverDTO rapidoDriverDTO = new RapidoDriverDTO(4,"sri","reddy",
//                25,"srighs535@gmail.com",
//                473618452825L,673914278L,
//                "4 years","Mangalore",250);
        RapidoDriverDTO rapidoDriverDTO = new RapidoDriverDTO(5,"krishana","reddy",
                24,"krishan2435@gmail.com",
                473618452825L,5629364829L,
                "4 years","Mangalore",250);
        RapidoDriverInsert rapidoDriverInsert = new RapidoDriverInsert();
        String start = rapidoDriverInsert.drive(rapidoDriverDTO);
        System.out.println(start);
    }
}
