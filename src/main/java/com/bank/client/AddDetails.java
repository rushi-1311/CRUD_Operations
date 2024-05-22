package com.bank.client;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//import com.bank.utility.Connection;
import com.bank.model.*;
import com.bank.utility.*;
/**
 * Servlet implementation class AddDetails
 */
//@WebServlet("/AddDetails")
public class AddDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Session session = null;
		Transaction txn = null;
         session = Connection.conMethod().getCurrentSession();	
         txn = session.beginTransaction();	
		
        String pname = request.getParameter("customerName") ;
        String bIfsc = request.getParameter("ifscCode") ;
        String bname= request.getParameter("branchName") ;
        int bId = Integer.parseInt(request.getParameter("customerID"));
        
        String house = request.getParameter("houseNumber");
        String landmark = request.getParameter("landmark") ;
        String city = request.getParameter("city") ;
        double pincode = Double.parseDouble( request.getParameter("pincode"));
        String state = request.getParameter("state") ;
        
        AccDetails ac = new AccDetails ();
        ac.setName(pname);
        ac.setBranch(bname);
        ac.setIfsc(bIfsc);
        ac.setId(bId);
        
        
        Address ad = new Address ();
        ad.setHouseNumber(house);
        ad.setLandmark(landmark);
        ad.setCity(city);
        ad.setPin(pincode);
        ad.setState(state);
        
    ac.setAd(ad)  ;
    ad.setAc(ac);
    session.save(ac);
   
    txn.commit();
    response.setContentType("text/html") ;   
    response.getWriter().print(" <h3 style = 'color: Green'> Your application is submitted successfully !!! Visit Again .... </h3> ");
    
	}

}
