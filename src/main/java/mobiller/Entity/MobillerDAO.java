package mobiller.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;

 
public class MobillerDAO {
 
    public String addFriend(Friend friend) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try{ 
            session.beginTransaction();
            String result = (String) session.save(friend);
            session.getTransaction().commit();
            session.close();
            HibernateUtil.closeSessionFactory();
            return result;
            
        } catch(Exception e){
            session.getTransaction().rollback();
            session.close();
            HibernateUtil.closeSessionFactory();
            return null;
            
        }
        
        
        
        
    }
    public String getdate () throws ParseException{
        
        Date date1 = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy. MM. dd  hh:mm");
         
       String time = format1.format(date1);
       // parsedDate = new SimpleDateFormat("yyyy.MM.dd  hh:mm").parse("16.04.2004");
        
        return time;
     
    }
}
   
