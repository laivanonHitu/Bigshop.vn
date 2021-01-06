package com.DienThoaiGiaRe.dao;


import java.util.List;

import com.DienThoaiGiaRe.model.CartInfo;
import com.DienThoaiGiaRe.model.OrderDetailInfo;
import com.DienThoaiGiaRe.model.OrderInfo;

public interface OrderDAO {
	 public void saveOrder(CartInfo cartInfo);
//	 public PaginationResult<OrderInfo> listOrderInfo(int page, int maxResult, int maxNavigationPage);
	 public OrderInfo getOrderInfo(int orderId);
	 public List<OrderDetailInfo> listOrderDetailInfos(int orderId);
	 
}
