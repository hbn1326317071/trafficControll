package org.cm.service;

import java.util.HashMap;
import java.util.List;

import org.cm.entity.Order;
import org.cm.entity.OrderResult;

public interface OrderService {
/**
 * Ϊ�˷����û���Ҫ�ٴεĴ���from��to��ʱ�������ٴζ�current��·�����ж�
 * @param from
 * @param to
 * @param currentLine
 */
	public OrderResult order(String from,String to,int currentLine,Long startTime);
/**
 * ��ѯ���еĶ�����Ϣ��
 */
	public List<Order> findAll();
	
//����д��
public int getOrdersOfPayByDate(String date);
	
	public int getPersonsPeriod(String startTime,String endTime);
	
	public double getIncomePeriod(String startTime,String endTime);
	
	public HashMap<String,Integer> getBusestOfThree(String startTime,String endTime);
}
