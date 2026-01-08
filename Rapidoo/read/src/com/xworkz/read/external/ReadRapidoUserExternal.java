package com.xworkz.read.external;


import com.xworkz.rapidoinst.dto.RapidoUserDTO;
import com.xworkz.read.internal.ReadRapidoUser;

public class ReadRapidoUserExternal {
    public static void main(String[] args) {
        RapidoUserDTO rapidoUserDTO=new RapidoUserDTO(1, "deepthi", "M G",
                24, "deepthi@gmail.com",
               5654678835L, "342834", 4, 4537,
               250);
    ReadRapidoUser readRapidoUser = new ReadRapidoUser();
    readRapidoUser.getAgeAndEmailById(1);


}
}
