import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
public class LoginDetails {
    private Map<String, String> loginCookies = new HashMap<String, String>();
     public static String UserAgent = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36";

   public Map<String, String> getcookies() {
       return this.loginCookies;
   
}



 public  Boolean CheckConnection(String Username,String Password ) throws IOException {



       Connection.Response loginForm
               = Jsoup.connect("https://carelink.minimed.eu/patient/j_security_check")
                       .referrer("https://carelink.minimed.eu/")
                       .userAgent(UserAgent)
                       .timeout(10 * 1000)
                       .followRedirects(true).ignoreHttpErrors(true)
                       .execute();

       try {

           Connection.Response res = Jsoup.connect("https://carelink.minimed.eu/patient/j_security_check")
                   .data("j_username", Username).data("j_password", Password).method(Connection.Method.POST)
                   .execute();
           loginCookies = res.cookies();

           return true;
       } catch (Exception e) {
           System.out.println("Incorrect Username or Password");
           return false;
       }

   }

}
