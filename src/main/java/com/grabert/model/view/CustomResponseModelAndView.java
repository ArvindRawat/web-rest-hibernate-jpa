package com.grabert.model.view;

public class CustomResponseModelAndView {
	
	private Object data;
	public CustomResponseModelAndView(Object data) {
		this.data=data;
		
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
