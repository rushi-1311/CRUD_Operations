package com.bank.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
public class Connection {
		
		public static SessionFactory conMethod()
		{
		SessionFactory factory = null;
			//step 1
		Configuration config=
		new Configuration().configure("bank.cfg.xml");
		//step 2
		ServiceRegistry registry = 
			new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        //step 3
		factory= config.buildSessionFactory(registry);
			
			return factory;
		}
	}



