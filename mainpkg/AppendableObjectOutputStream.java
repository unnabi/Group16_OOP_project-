package mainpkg;
 SadiaSiddika_2220768

 main
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

 SadiaSiddika_2220768
class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException { 
        
    }
} 

public class AppendableObjectOutputStream extends ObjectOutputStream{
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
        }
     @Override
         protected void writeStreamHeader() throws IOException {     
    }
}
 main
