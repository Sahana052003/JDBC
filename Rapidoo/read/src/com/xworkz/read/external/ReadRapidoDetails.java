import com.xworkz.rapidoinst.dto.RapidoDriverDTO;
import com.xworkz.read.internal.ReadRapidoDriver;

public class ReadRapidoDetails {
    public static void main(String[] args) {
        RapidoDriverDTO rapidoDTO = new RapidoDriverDTO(5,"krishana","reddy",
                24,"krishan2435@gmail.com",
                473618452825L,5629364829L,
                "4 years","Mangalore",250);
        ReadRapidoDriver readRapidoDriver=new ReadRapidoDriver();
       String phoneNumber= readRapidoDriver.getPhoneByEmail("srighs535@gmail.com");
        System.out.println(phoneNumber);
    }
}