import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BarcodeGeneratorTest{
    
    @Test
    public void mainInputTest() throws IOException {

        //String simulating user input
        String regNumTestData = "ERA89TL";


        
        //Boilerplate formula to redirect the input/output, and test them from main in a JUnit test

        

        /*TO-DO: apply this when the input will be Scanner(System.in)), now it uses args[]
        //Converting user input String into Byte Array Input Stream
        ByteArrayInputStream in = 
        //Pasing byte Array of String into a constructor
        new ByteArrayInputStream(regNumTestData.getBytes());
        System.setIn(in);
        */

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));


        //invoking main method without arguments
        String[] args = {regNumTestData};
        BarcodeGenerator.main(args);
        

        //(expected) output
        String consoleOutput = "User code has been generated for vehicle listed below: " + System.lineSeparator();
        consoleOutput += regNumTestData + System.lineSeparator();
        consoleOutput += "It works!!!" + System.lineSeparator();

        assertEquals(consoleOutput, out.toString());
    }
}