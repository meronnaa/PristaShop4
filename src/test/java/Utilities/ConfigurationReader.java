package Utilities;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    private static Properties properties;

    static{
        String paths="Configration.Properties";
        try{


            FileInputStream fileInputStream=new FileInputStream(paths);

            properties=new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public static String getProperty(String property){
        return properties.getProperty(property);
    }
}
