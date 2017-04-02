import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dates {

	public static String dateFormat = "dd/MM/yyyy";
    public Date FormatedStartDate;
    public Date FormatedEndDate;
    
    public Boolean GetStratDate(String StartDate) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        Date Todaydate = new Date();
        String todayDate = sdf.format(Todaydate);

        

        Date ValidStardDate = new SimpleDateFormat(dateFormat).parse("01/01/1998"); // Tovalidate Very first start date

        try {
            FormatedStartDate = new SimpleDateFormat(dateFormat).parse(StartDate);
        } catch (Exception e) {
            System.out.println("Start Date is not in correct format \n Date should be in Format of DD/MM/YYYY  Example: 13/03/2017");
            return false;
        }
        try {
            DateFormat df = new SimpleDateFormat(dateFormat);
            df.setLenient(false);
            df.parse(StartDate);
            if (FormatedStartDate.before(ValidStardDate) || FormatedStartDate.after(new SimpleDateFormat(dateFormat).parse(todayDate))) {
                System.out.println("You can only enter Start date between 01/01/1998 and Today's Date!!");
                return false;
            }
            return true;
        } catch (Exception e) {
            System.out.println("Start Date is not Valid");
            return false;

        }
    }


     public Boolean GetEndDate(String EndDate) throws ParseException {

        Date Todaydate = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String todayDate = sdf.format(Todaydate);

      
        Date ValidStardDate = new SimpleDateFormat(dateFormat).parse("01/01/1998");
     
        try {
            FormatedEndDate = new SimpleDateFormat(dateFormat).parse(EndDate);
        } catch (Exception e) {
            System.out.println("Start Date is not in correct format \n Date should be in Format of DD/MM/YYYY  Example: 13/03/2017");
            return false;
        }
        try {
            DateFormat df = new SimpleDateFormat(dateFormat);
            df.setLenient(false);
            df.parse(EndDate);
            if (FormatedEndDate.after(new SimpleDateFormat(dateFormat).parse(todayDate)) || FormatedEndDate.before(ValidStardDate)) {
                System.out.println("You can only enter End date between 01/01/1998 and Today's Date!! ");
                return false;
            }
            if (FormatedEndDate.before(FormatedStartDate)) {
                System.out.println("End Date cannot be earlier than Start date");
                return false;
            }
            return true;
        } catch (Exception e) {
            System.out.println("End Date is not Valid");
            return false;
        }
    }
    }
