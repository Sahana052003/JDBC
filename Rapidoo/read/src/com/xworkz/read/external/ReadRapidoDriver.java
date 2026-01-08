package com.xworkz.read.external;

import com.xworkz.rapidoinst.dto.RapidoDTO;
import com.xworkz.read.internal.ReadRapidoInternal;

public class ReadRapidoDriver {
    public static void main(String[] args) {
        RapidoDTO rapidoDTO = new RapidoDTO(5,"sri","12.4",
                25,"srighs535@gmail.com",
                673914278L,"Kannada","India",
                "12-5-2013",350);
    ReadRapidoInternal readRapidoInternal=new ReadRapidoInternal();
    readRapidoInternal.getNameAndPhoneByEmail("srighs535@gmail.com");
}
}