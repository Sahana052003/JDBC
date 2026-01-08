package com.xworkz.Rapidoo.delete.external;

import com.xworkz.Rapidoo.delete.internal.DeleteRapido;
import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;

public class DeleteRapidoDetailsExternal {
    public static void main(String[] args) {
        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(5,"sree","Sai",
                24,"sree8378nshdj@gmail.com",
                454678982L,"female","India","Mangalore",250);
            DeleteRapido deleteRapido=new DeleteRapido();
            deleteRapido.byNameAndPhoneAndEmail("sree",454678982L,"sree8378nshdj@gmail.com");
    }
}
