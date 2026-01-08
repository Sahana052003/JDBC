package com.xworkz.update.external;


import com.xworkz.rapidoinst.dto.RapidoUserDTO;
import com.xworkz.update.internal.Rapido;


public class RapidoRunner {
    public static void main(String[] args) {
        RapidoUserDTO rapidoUserDTO = new RapidoUserDTO(2, "charan", "M G",
                25, "charankumar75687267@gmail.com",
                565678935L, "342834", 4, 4537, 250);
        com.xworkz.update.update.RapidoUpdate rapidoUpdate=new com.xworkz.update.update.RapidoUpdate();
       String x= rapidoUpdate.stop(rapidoUserDTO);
        System.out.println(x);
    }
}
