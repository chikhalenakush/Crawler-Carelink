import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JunitShouldFilebeDownloaded {
	private Map<String, String> loginCookiestemp = new HashMap<String, String>();
    Boolean result = false;
    

    
    CrawlerCarelink cc = new CrawlerCarelink();
    

    
   
	@Test
	public void test() throws IOException, ParseException {
		 LoginDetails LoginUnit = new LoginDetails();
         if(LoginUnit.CheckConnection(cc.Username,cc.Password)){                
         Dates DateUnit = new Dates();      
           
            if(DateUnit.GetStratDate(cc.StartDate) && DateUnit.GetEndDate(cc.EndDate) )
            {
                loginCookiestemp =  LoginUnit.getcookies();
      CSVData csvtest = new CSVData();
       result = csvtest.GenerateDocument(loginCookiestemp, cc.StartDate, cc.EndDate);
            }
            }
         System.out.print("Test case Result is :" + " ");
     assertEquals(cc.TrueorFalse, result);
     }
	}


