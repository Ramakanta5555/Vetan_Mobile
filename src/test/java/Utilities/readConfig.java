package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {

    Properties pro;
	
	public readConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is" + e.getMessage());
		}
	}

    public String getProdUserName()
    {
        String prodUserName = pro.getProperty("prodUserName");
		return prodUserName;
    }

    public String getProdPassword()
    {
        String prodPassword = pro.getProperty("prodPassword");
		return prodPassword;
    }

}
