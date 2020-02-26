package com.netty.fuse.util;

public class ExtRequest {
	
	private String tid;
	private String svc;
	private String idata;
	private String flags;
	
	public ExtRequest() {
	}
	public ExtRequest(String tid, String svc, String idata, String flags) {
		super();
		this.tid = tid;
		this.svc = svc;
		this.idata = idata;
		this.flags = flags;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getSvc() {
		return svc;
	}
	public void setSvc(String svc) {
		this.svc = svc;
	}
	public String getIdata() {
		return idata;
	}
	public void setIdata(String idata) {
		this.idata = idata;
	}
	public String getFlags() {
		return flags;
	}
	public void setFlags(String flags) {
		this.flags = flags;
	}

	
	

}
