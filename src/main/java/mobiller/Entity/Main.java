package mobiller.Entity;




import java.text.ParseException;


public class Main {
 
    public static void main(String[] args) throws ParseException {
        MobillerDAO dao = new MobillerDAO();
 
        // Добавление новых предметов
        Friend friend = new Friend();
        friend.setMobile("091101214");
        friend.setFname("Gaidai1212");
        friend.setName("Stas");
        friend.setDate( dao.getdate());
        friend.setNumb(0);
        dao.addFriend(friend);
       
 
        System.out.println("List of SUBJECTS");
        
        
    }
}    
    