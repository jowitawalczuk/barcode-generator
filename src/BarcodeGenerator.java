import java.io.IOException;
import java.nio.file.Path;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.PDF417Writer;

/**
 * The {@ccode BarcodeGenerator} class is responsible for generating QR code with coding type PDF417. Vehicle registration number passed as an command-line argument will be encoded as barcode .png image.
 * 
 * <p><strong>Dependencies:</strong></p>ZXing core, JavaSE, JUnit Jupiter libraries</p>
 * 
 * <p><strong>Usage:</strong></p>
 * <pre>{@code
 * java BarcodeGenerator WXY859
 * }</pre>
 * 
 *  
 * @author Jowita
 * @version 1.0.0 2025-07-13
 * 
 */
public class BarcodeGenerator {

    public static void main(String args[]) throws IOException{
        

        if(args.length ==0){

            System.out.println("Registration number not provided");

        }

        else{

            System.out.println("User code has been generated for vehicle listed below: ");

            for(int i = 0; i < args.length; i++){
                            
                String regNum = args[i];
                System.out.println(args[i]);
                
                PDF417Writer barCode = new PDF417Writer();

                try {

                    BitMatrix matrix = barCode.encode(regNum, BarcodeFormat.PDF_417, 300, 150);

                    Path path = Path.of("codeForReg.png");
                    MatrixToImageWriter.writeToPath(matrix, "PNG", path);

                    System.out.println("It works!!!");

                } 
                
                catch (WriterException e) {
                    e.printStackTrace();
                }
    }
              
    }
    
}
}
