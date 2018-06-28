
package hibernatenamedqueryexample;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class UseMe {

    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        Session session = cfg.configure().buildSessionFactory().openSession();
    Student s1=new Student();
   s1.setId(101);
   s1.setName("raju");
   s1.setPhone("7458435");
//        Query query1 = session.getNamedQuery("query1");
//    query1.setInteger("id", 101);
//       List list = query1.list();
//       for (Object object : list) {
//           Student s=(Student)object;
//           System.out.println(s.getId());
//           System.out.println(s.getName());
//           System.out.println(s.getPhone());
       session.save(s1);
       session.beginTransaction().commit();
  
    }
    
}
