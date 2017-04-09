package Entity;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
 
    public static void main(String[] args) throws ParseException {
        MobillerDAO dao = new MobillerDAO();
 
        // Добавление новых предметов
        Friend friend = new Friend();
        friend.setMobile("09704");
        friend.setFname("Gaidai");
        friend.setName("Stas");
        friend.setDate( dao.getdate());
        friend.setNumb(0);
        dao.addFriend(friend);
       
 
        System.out.println("List of SUBJECTS");
        
        
    }
}    
    