package com.xworkz.rapidoinst.external;

import com.xworkz.rapidoinst.dto.RapidoUserDTO;
import com.xworkz.rapidoinst.internal.RapidoDetailsInsert;
import com.xworkz.rapidoinst.internal.RapidoUserInsert;

public class RapidoUserRunner {
    public static void main(String[] args) {
//        RapidoUserDTO rapidoUserDTO = new RapidoUserDTO(1, "deepthi", "M G",
//                24, "deepthi@gmail.com",
//                5654678835L, "342834", 4, 4537,
//                250);
        RapidoUserDTO rapidoUserDTO = new RapidoUserDTO(2, "charan", "M G",
                35, "charan745679@gmail.com",
                565678935L, "342834", 4, 4537, 250);
//        RapidoUserDTO rapidoUserDTO = new RapidoUserDTO(3, "chiru", "M G",
//                37, "cirujyts4589@gmail.com",
//                5467890221L, "342834", 4, 4537, 250);
//        RapidoUserDTO rapidoUserDTO = new RapidoUserDTO(4, "sonia", "M G",
//                36, "sony45678jhbash9@gmail.com",
//                565678935L, "342834", 4, 4537, 250);
//        RapidoUserDTO rapidoUserDTO = new RapidoUserDTO(5, "keerthi", "M G",
//                27, "sharan6789@gmail.com",
//                5678234834L, "342834", 4, 4537, 250);
        RapidoUserInsert rapidoUserInsert = new RapidoUserInsert();
        String start = rapidoUserInsert.stop(rapidoUserDTO);

    }

}
