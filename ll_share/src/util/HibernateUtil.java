package util;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateCallback;

public class HibernateUtil {

	public static Session findSession(HibernateTemplate hibernateTemplate){
		return (Session) hibernateTemplate.execute(new HibernateCallback() {
			public Object doInHibernate(Session session) throws HibernateException {
				
				
				return session;
			}
		});
	}
}
