package com.DienThoaiGiaRe.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.DienThoaiGiaRe.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	private static Logger log = LoggerFactory.getLogger(UserDaoImpl.class);
	public void setSessionFactory(SessionFactory factory) {
		this.sessionFactory = factory;
	}

	public boolean createUser(User user) {
		try {
			Session session = sessionFactory.getCurrentSession();
			session.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean findUser(String uname, String upwd) {
//		User user = new User();
//		Session session = sessionFactory.getCurrentSession();
//		log.info("Checking the user in the database");
//		boolean isValidUser = false;
//		String sqlQuery = "SELECT * FROM Users as users WHERE users.user_name = :userName and users.password = :password";
//		try {
//			SQLQuery query = session.createSQLQuery(sqlQuery);
//			query.addEntity(User.class);
//			query.setParameter(":userName", uname);
//			query.setParameter(":password", upwd);
//			query.executeUpdate();
//			isValidUser = true;
//		} catch(Exception e) {
//			isValidUser = false;
//			log.error("An error occurred while fetching the user details from the database", e);	
//		}
//		return isValidUser;
		log.info("Checking the user in the database");

		//boolean variable t validate db details from hibernate
		boolean isVaildUser  = false;
		String hql =  "from User u where  u.user_name = ?  and u.password = ?";	
		try
		{
			@SuppressWarnings("rawtypes")
			List userObject =  (List)   hibernateTemplate.find(hql,uname,upwd);
			
			//decison making for null value 
			if ( userObject != null &&  userObject.size()  >0)
			{			
				
				 log.info("Id= " + userObject.get(0));
				isVaildUser = true;				
			}			
		}
		catch(Exception e)
		{
			isVaildUser = false;
			log.error("An error occurred while fetching the user details from the database", e);
		}
		return isVaildUser;	
	}
}
