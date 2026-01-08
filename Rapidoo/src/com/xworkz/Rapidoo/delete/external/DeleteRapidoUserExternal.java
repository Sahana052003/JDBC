package com.xworkz.Rapidoo.delete.external;

import com.xworkz.Rapidoo.delete.internal.DeleteRapidoUser;
import com.xworkz.rapidoinst.dto.RapidoUserDTO;

public class DeleteRapidoUserExternal {
    public static void main(String[] args) {
        RapidoUserDTO rapidoUserDTO=new RapidoUserDTO(1, "deepthi", "M G",
                24, "deepthi@gmail.com",
                5654678835L, "342834", 4, 4537,
                250);
        DeleteRapidoUser deleteRapidoUser = new DeleteRapidoUser();
        deleteRapidoUser.byId(1);
    }
}