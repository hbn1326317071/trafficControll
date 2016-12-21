package org.cm.entity;

import java.io.Serializable;
import java.util.Map;

public class RouteResult implements Serializable{
	private int id;
	private String[] routeFindById;
	private Map<Integer,String[]> allRoute;
	private Map<Integer,Integer> allTime;
	private Map<Integer,Double> allFee;
//	private String name;//��ǰվ������
//	private int[] routeIn;//��ǰվ�����ڵ�·��
	private double fee;//����ʼվ�㵽��ֹվ��ķ���
	private int time;//����ʼվ�㵽��ֹ�յ������ѵ�ʱ��
	public int getId() {
	
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getRouteFindById() {
		return routeFindById;
	}
	public void setRouteFindById(String[] routeFindById) {
		this.routeFindById = routeFindById;
	}
	public Map<Integer, String[]> getAllRoute() {
		return allRoute;
	}
	public void setAllRoute(Map<Integer, String[]> allRoute) {
		this.allRoute = allRoute;
	}
	public Map<Integer, Integer> getAllTime() {
		return allTime;
	}
	public void setAllTime(Map<Integer, Integer> allTime) {
		this.allTime = allTime;
	}
	public Map<Integer, Double> getAllFee() {
		return allFee;
	}
	public void setAllFee(Map<Integer, Double> allFee) {
		this.allFee = allFee;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	
}
	
