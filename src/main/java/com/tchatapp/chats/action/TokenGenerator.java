package com.tchatapp.chats.action;


import com.opensymphony.xwork2.ActionSupport;
import com.tchatapp.chats.twilio.CreateToken;

public class TokenGenerator extends ActionSupport{

	private String token = "", identity, browser;
	
	public String execute() {
	    
		this.token = CreateToken.token( this.getIdentity() );
		
		return SUCCESS;
	}

    public String getToken() {
    	   return this.token;
    }
    
    public String getIdentity() {
    	  return this.identity;
    }
    
    public void setIdentity(String identity) {
    	  this.identity = identity;
    }
    
    public String getBrowser() {
  	  return this.browser;
  }
  
  public void setBrowser(String browser) {
  	  this.browser = browser;
  }
}