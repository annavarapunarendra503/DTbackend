package com.niit.DaoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Dao.UserDao;
import com.niit.Model.User;


@Repository
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {}
	
	    @Autowired
		private SessionFactory sessionFactory;
	    
		   public UserDaoImpl(SessionFactory sessionFactory) {
			this.sessionFactory=sessionFactory;
			
		}

		public boolean saveUser(User user) {
			
			Session session=sessionFactory.openSession();
			session.saveOrUpdate(user);
			Transaction tx=session.beginTransaction();
			tx.commit();
			
			return true;
		}
	}
