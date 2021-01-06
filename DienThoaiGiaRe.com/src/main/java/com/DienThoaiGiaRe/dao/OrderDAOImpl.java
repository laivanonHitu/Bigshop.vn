package com.DienThoaiGiaRe.dao;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.criteria.Order;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.DienThoaiGiaRe.entity.OrderDetail;
import com.DienThoaiGiaRe.entity.Orders;
import com.DienThoaiGiaRe.entity.Product;
import com.DienThoaiGiaRe.entity.User;
import com.DienThoaiGiaRe.model.CartInfo;
import com.DienThoaiGiaRe.model.CartItems;
import com.DienThoaiGiaRe.model.OrderDetailInfo;
import com.DienThoaiGiaRe.model.OrderInfo;

@Repository
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private ProductDAO productDAO;

	private int getMaxOrderNum() {
		String sql = "Select max(o.orderNum) from " + Order.class.getName() + " o ";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sql);
		Integer value = (Integer) query.uniqueResult();
		if (value == null) {
			return 0;
		}
		return value;
	}

	@Override
	public void saveOrder(CartInfo cartInfo) {
		UUID uuid = UUID.randomUUID();
		int id = uuid.variant();

		Session session = sessionFactory.getCurrentSession();
		int orderNum = this.getMaxOrderNum() + 1;
		Orders order = new Orders();

		order.setId(id);
		order.setOrderNum(orderNum);
		order.setOrderDate(new Date(orderNum));
		order.setAmount(cartInfo.getAmountTotal());

		User user = cartInfo.getUser();
		order.setCustomerName(user.getUserName());
		order.setCustomerName(user.getFirstName());
		order.setCustomerName(user.getLastName());
		order.setCustomerEmail(user.getPhoneNumber());

		session.persist(order);

		List<CartItems> Items = cartInfo.getcartItems();

		for (CartItems line : Items) {
			OrderDetail detail = new OrderDetail();
			detail.setId(UUID.randomUUID().toString());
			detail.setOrder(order);
			detail.setAmount(line.getAmount());
			detail.setPrice(line.getProductInfo().getPrice());
			detail.setQuanity(line.getQuantity());

			int code = line.getProductInfo().getId();
			Product product = this.productDAO.getProductById(code);
			detail.setProduct(product);
		}
	}

	@Override
	public OrderInfo getOrderInfo(int orderId) {
		String sql = "Select new " + OrderDetailInfo.class.getName() //
				+ "(d.id, d.product.code, d.product.name , d.quanity,d.price,d.amount) "//
				+ " from " + OrderDetail.class.getName() + " d "//
				+ " where d.order.id = :orderId ";
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery(sql);
		query.setParameter("orderId", orderId);
		
		return (OrderInfo) query.list();
	}

	@Override
	public List<OrderDetailInfo> listOrderDetailInfos(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

}
