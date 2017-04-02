import static org.junit.Assert.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class JunitShouldFilebeDownloaded {
	private Map<String, String> loginCookiestemp = new HashMap<String, String>();
	Boolean result = false;

	@Test
	public void test() throws IOException, ParseException {
		LoginDetails LoginUnit = new LoginDetails();
		if (LoginUnit.CheckConnection(CrawlerCarelink.Username, CrawlerCarelink.Password)) {
			Dates DateUnit = new Dates();

			if (DateUnit.GetStratDate(CrawlerCarelink.StartDate) && DateUnit.GetEndDate(CrawlerCarelink.EndDate)) {
				loginCookiestemp = LoginUnit.getcookies();
				CSVData csvtest = new CSVData();
				result = csvtest.GenerateDocument(loginCookiestemp, CrawlerCarelink.StartDate, CrawlerCarelink.EndDate);
			}
		}

		assertEquals(CrawlerCarelink.TrueorFalse, result);
	}
}
