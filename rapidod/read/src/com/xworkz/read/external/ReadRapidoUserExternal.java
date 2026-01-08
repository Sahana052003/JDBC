package com.xworkz.read.external;

import com.xworkz.rapidod.dto.RapidoUserDTO;
import com.xworkz.read.internal.ReadRapidoUser;

public class ReadRapidoUserExternal {
    public static void main(String[] args) {
//        RapidoUserDTO rapidoUserDTO=new RapidoUserDTO(2, "charan", "M G",
//                35, "charan745679@gmail.com",
//                565678935L, "342834", 4, 4537, 250);
    ReadRapidoUser readRapidoUser = new ReadRapidoUser();

    String name=readRapidoUser.getAgeAndEmaibyId(1);
        System.out.println(name);
}
}
