package com.xworkz.rapidoinst.external;

import com.xworkz.rapidoinst.dto.RapidoDTO;
import com.xworkz.rapidoinst.dto.RapidoDetailsDTO;
import com.xworkz.rapidoinst.internal.RapidoDetailsInsert;
import com.xworkz.rapidoinst.internal.RapidoInsert;

public class RapidoRunner {
    public static void main(String[] args) {
//        RapidoDTO rapidoDTO = new RapidoDTO(1,"krishana","12.4",
//                24,"krishan2435@gmail.com",
//                5629364829L,"Kannada","India",
//                "12-5-2013",350);
//        RapidoDTO rapidoDTO = new RapidoDTO(2,"keerthi","12.4",
//                23,"keerthi2435@gmail.com",
//                5629364829L,"Kannada","India",
//                "12-5-2013",350);
//        RapidoDTO rapidoDTO = new RapidoDTO(3,"rajesh","12.4",
//                27,"rajesg678@gmail.com",
//                567892372L,"Kannada","India",
//                "12-5-2013",350);
//        RapidoDTO rapidoDTO = new RapidoDTO(4,"karthik","12.4",
//                25,"kkarthik245@gmail.com",
//                7834195382L,"Kannada","India",
//                "12-5-2013",350);
        RapidoDTO rapidoDTO = new RapidoDTO(5,"sri","12.4",
                25,"srighs535@gmail.com",
                673914278L,"Kannada","India",
                "12-5-2013",350);
        RapidoInsert rapidoInsert = new RapidoInsert();
        String start = rapidoInsert.run(rapidoDTO);

    }
}
