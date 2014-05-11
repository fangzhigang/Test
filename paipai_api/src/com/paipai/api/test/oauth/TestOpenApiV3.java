package com.paipai.api.test.oauth;

import java.io.IOException;

import org.junit.Test;

public class TestOpenApiV3 {

	public static void main(String args[]) {
		TestOpenApiV3 v3 = new TestOpenApiV3();
		v3.testInvoke();
	}
	
	@Test
	public void testInvoke() {

		PaiPaiOpenApiOauth api = PaiPaiOpenApiOauth.createInvokeApi("/user/getUserInfo.xhtml");

		api.setAppOAuthID("700190547");
		api.setAppOAuthkey("6zV1q9tyEGyeOWML");
		api.setAccessToken("0368eaee86df902623e049956a078a75");
		api.setUin(39012904);
		api.setHost("http://api.paipai.com");


		//api.addParam("itemCode", "0368eaee86df902623e049956a078a75");
		api.addParam("userUin", "39012904");
		try {
			PaiPaiOpenApiOauth.invoke(api);
		} catch (OpenApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
