package com.tchatapp.chats.twilio;

import com.twilio.jwt.accesstoken.AccessToken;
import com.twilio.jwt.accesstoken.ChatGrant;

public class CreateToken {

	  public static String token(String identity) {
		    String twilioAccountSid = "AC1f7d11ebe4fcc2cb4c2a1dfa6a661f97";
		    String twilioApiKey = "SK6997daff821400758519588e18d4be7e";
		    String twilioApiSecret = "D6GgjcOUHkuDqB8dkNlFxZq9wV9n03P7";

		    String serviceSid = "ISf8e723460c2d4c5ca88897e97cf31ea4";
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