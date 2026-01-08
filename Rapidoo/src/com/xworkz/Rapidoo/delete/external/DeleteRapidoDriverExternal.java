package com.xworkz.Rapidoo.delete.external;

import com.xworkz.Rapidoo.delete.internal.DeleteRapidoDetails;
import com.xworkz.rapidoinst.dto.RapidoDriverDTO;

public class DeleteRapidoDriverExternal {
    public static void main(String[] args) {
        RapidoDriverDTO rapidoDTO = new RapidoDriverDTO(5,"krishana","reddy",
                24,"krishan2435@gmail.com",
                473618452825L,5629364829L,
                "4 years","Mangalore",250);
        DeleteRapidoDetails deleteRapidoDetails=new DeleteRapidoDetails();
        deleteRapidoDetails.byEmail("krishan2435@gmail.com");
    }
}
