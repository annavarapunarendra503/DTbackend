package com.niit.DaoImpl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.Dao.PaymentDao;
import com.niit.Model.Payment;


@Repository("paymentDao")
public class PaymentDaoImpl implements PaymentDao{

	
	//private static Logger log = LoggerFactory.getLogger(PaymentDaoImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory ;
	
	@Transactional
	public boolean savePaymentInfo(Payment payment) {
		try{
		//	log.info("PaymentDaoImpl : save or update Payment detail");
			sessionFactory.getCurrentSession().saveOrUpdate(payment);
			return true;
			}catch (Exception e) {
				return false;
			}
	}

	@Transactional
	public Payment getPaymentInfo(int paymentId) {
		//log.info("PaymentDaoImpl : get Payment detail by payment Id");
		Payment payment= (Payment) sessionFactory.getCurrentSession().createQuery("from Payment where id = :Id")
				.setParameter("Id", paymentId).uniqueResult();
		
		//log.info("PaymentDaoImpl : Fetched Payment detail by Id => "+payment.toString());
		return payment;
	}

	@Transactional
	public List<Payment> getUserPaymentInfo(int userId) {
		//log.info("PaymentDaoImpl : get Payment detail by User Id");
		List<Payment> paymentList=  sessionFactory.getCurrentSession().createQuery("from Payment where userId = :userId",Payment.class)
				.setParameter("userId", userId).list();
		return paymentList;
	}

	@Transactional
	public List<Payment> getUserCardPaymentInfo(int userId) {
		//log.info("PaymentDaoImpl : get User Card Payment detail by User Id");
		List<Payment> paymentList=  sessionFactory.getCurrentSession().createQuery("from Payment where userId = :userId and paymentMethod IN ('creditcard','debitcard')",Payment.class)
				.setParameter("userId", userId).list();
		return paymentList;
	}


	
}
