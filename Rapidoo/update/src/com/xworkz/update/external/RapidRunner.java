package com.xworkz.update.external;


import com.xworkz.rapidoinst.dto.RapidoDTO;
import com.xworkz.update.internal.UpdateRapido;

public class RapidRunner {
    public static void main(String[] args) {
        RapidoDTO rapidoDTO=new RapidoDTO(5,"nandu","12.4",
                25,"srighs535@gmail.com",
                5634163548L,"Kannada","India",
                "12-5-2013",350);
        UpdateRapido updateRapido=new UpdateRapido();
       String name= updateRapido.save(rapidoDTO);
        System.out.println(name);

    }
}
