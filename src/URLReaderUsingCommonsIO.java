import java.net.*;
import java.nio.charset.Charset;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;


public class URLReaderUsingCommonsIO {
	public static void main(String[] args) throws Exception {
        
		URL url = new URL( "https://www.oracle.com" );
//        InputStream in = new URL( "https://www.oracle.com" ).openStream();

        System.out.println( IOUtils.toString( url,  (Charset) null) );
       
        
        
//		String out = new Scanner(new URL("http://www.google.com").openStream(), "UTF-8").useDelimiter("\\A").next();
        try(
        		Scanner scanner = new Scanner(new URL("https://www.oracle.com").openStream(), "UTF-8");
        		){
        	String out = scanner.useDelimiter("\\A").next();
        	System.out.println(out);
        }
        
        
        
	}
	

}
