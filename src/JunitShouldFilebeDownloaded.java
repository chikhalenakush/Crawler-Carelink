import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JunitShouldFilebeDownloaded {
	private Map<String, String> loginCookiestemp = new HashMap<String, String>();
    Boolean result = false;
    private String Username;
    private String Password;
    private String StartDate;
    private String EndDate;
    private Boolean TrueorFalse;
//      JunitShouldFilebeDownloaded(String username,String password,String startDate,String endDate,Boolean trueorFalse){
//    	
//    	Username = username;
//        Password = password;
//        StartDate = startDate;
//        EndDate = endDate;
//        TrueorFalse = trueorFalse;
//   }
	@Test
	public void test() throws IOException, ParseException {
		 LoginDetails LoginUnit = new LoginDetails();
         if(LoginUnit.CheckConnection(Username,Password)){                
         Dates DateUnit = new Dates();      
           
            if(DateUnit.GetStratDate(StartDate) && DateUnit.GetEndDate(EndDate) )
            {
                loginCookiestemp =  LoginUnit.getcookies();
      CSVData csvtest = new CSVData();
       result = csvtest.GenerateDocument(loginCookiestemp, StartDate, EndDate);
            }
            }
     assertEquals(TrueorFalse, result);
     }
	}


