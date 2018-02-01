package com.tchatapp.chats.twilio;

import com.twilio.jwt.accesstoken.AccessToken;
import com.twilio.jwt.accesstoken.ChatGrant;

public class CreateToken {

	  public static String token(String identity) {
		    String twilioAccountSid = "AC****************************";
		    String twilioApiKey = "SK********************************";
		    String twilioApiSecret = "D6G****************************";

		    String serviceSid = "IS**********************************";
		    String deviceId = "browser";
		    String appName = "chatX";
		    String endpointId = appName + ":" + identity + ":" + deviceId;

		    ChatGrant grant = new ChatGrant();
		    grant.setEndpointId(endpointId);
		    grant.setServiceSid(serviceSid);

		    AccessToken token = new AccessToken.Builder(twilioAccountSid, twilioApiKey, twilioApiSecret)
		        .identity(identity).grant(grant).build();
		    
		    return token.toJwt();
		  }

}
