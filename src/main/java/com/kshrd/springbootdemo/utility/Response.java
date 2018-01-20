package com.kshrd.springbootdemo.utility;

public class Response {
	
	private Object data;
	private Paging paging;
	
	public Response(Object data, Paging paging) {
		super();
		this.data = data;
		this.paging = paging;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Paging getPaging() {
		return paging;
	}
	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	@Override
	public String toString() {
		return "Response [data=" + data + ", paging=" + paging + "]";
	}
}
