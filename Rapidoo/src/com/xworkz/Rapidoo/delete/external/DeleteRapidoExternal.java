package com.xworkz.Rapidoo.delete.external;

import com.xworkz.Rapidoo.delete.internal.DeleteRapidoDriver;
import com.xworkz.rapidoinst.dto.RapidoDTO;

public class DeleteRapidoExternal {
    public static void main(String[] args) {
        RapidoDTO rapidoDTO = new RapidoDTO(5,"sri","12.4",
                25,"srighs535@gmail.com",
                673914278L,"Kannada","India",
                "12-5-2013",350);
        DeleteRapidoDriver deleteRapidoDriver=new DeleteRapidoDriver();
        deleteRapidoDriver.byNameAndPhone("sri",673914278L);
    }
}
