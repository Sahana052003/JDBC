package com.xworkz.update.external;

import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;
import com.xworkz.rapidoinst.dto.RapidoUserDTO;
import com.xworkz.update.update.RapidoUpdate;
import com.xworkz.update.internal.Rapidoo;

public class MainRapido {
    public static void main(String[] args) {
        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(1,"kavya","Sai",
                24,"kavya5725@gmail.com",
                6456756448L,"female","India","Mangalore",250);
        Rapidoo rapidoo=new Rapidoo();
        String x= rapidoo.stop(rapidoDetailsDTO);
        System.out.println(x);
    }
}
