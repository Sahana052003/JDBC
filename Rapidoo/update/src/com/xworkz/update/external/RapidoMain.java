package com.xworkz.update.external;



import com.xworkz.rapidoinst.dto.RapidoDriverDTO;
import com.xworkz.update.internal.Rapido;
import com.xworkz.update.update.RapidoUpdate;

public class RapidoMain {
    public static void main(String[] args) {
        RapidoDriverDTO rapidoDriverDTO = new RapidoDriverDTO(5,"krishana","reddy",
                24,"krishan2435@gmail.com",
                473618452825L,841936239L,
                "4 years","Mangalore",250);
        Rapido rapido=new Rapido();
        String x= rapido.stop(rapidoDriverDTO);
        System.out.println(x);
    }
}
