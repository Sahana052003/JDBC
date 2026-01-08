package com.xworkz.read.external;

import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;
import com.xworkz.read.internal.ReadRapidoDetails;

public class ReadRapido {
    public static void main(String[] args) {

        RapidoDetailsDTO rapidoDetailsDTO = new RapidoDetailsDTO(5,"sree","Sai",
                24,"sree8378nshdj@gmail.com",
                454678982L,"female","India","Mangalore",250);

        ReadRapidoDetails readRapidoDetails=new ReadRapidoDetails();
      String user=readRapidoDetails.getNameAndPhoneAndEmailById(5);
        System.out.println(user);
    }
}
