package com.jsu.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.jsu.Idao.IUserDao;
import com.jsu.po.Users;

public class IUserDaoImpl implements IUserDao {
	
	private HibernateTemplate hibernateTemplate;  
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {  
		this.sessionFactory = sessionFactory;
      //  this.hibernateTemplate = new HibernateTemplate(sessionFactory);  
    }  
	
	public HibernateTemplate getHibernateTemplate(){
		
		if( hibernateTemplate==null)
			
			hibernateTemplate = new HibernateTemplate(sessionFactory);
	
		return hibernateTemplate;
	}
	
	@Override
	public void saveUser(Users user) throws SQLException {
		// TODO Auto-generated method stub
		
		getHibernateTemplate().saveOrUpdate(user);
		
	}

	@Override
	public void delUser(Users user) throws SQLException {
		// TODO Auto-generated method stub
		
		getHibernateTemplate().delete(user);
		
	}

	@Override
	public void editUsre(Users user) throws SQLException {
		// TODO Auto-generated method stub
		
		getHibernateTemplate().update(user);  
		
	}

	@Override
	public List getUserByname(String username) throws SQLException {
		// TODO Auto-generated method stub
		
		List list = getHibernateTemplate().find("from Users");
		
		return list;
	}

}
