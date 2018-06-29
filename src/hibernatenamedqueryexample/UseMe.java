
package hibernatenamedqueryexample;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UseMe {

    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
        Session session=sf.openSession();
        Student s = (Student)session.get(Student.class,101);
        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getPhone());
        System.out.println("hello");
        session.close();
        try{
            Thread.sleep(6000);
        }
    catch(Exception e){
        e.printStackTrace();
    }
         Session session1=sf.openSession();
        Student s1 = (Student)session1.get(Student.class,101);
        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getPhone());
        
        
        
    
    }    
}
