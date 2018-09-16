package com.xzfw.app.util;

import java.io.IOException;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

/**
 * 短信发送
 * @author 刘靖
 */

public class SmsMessage {

	public static String SendSmsMEssage(String phone, String content) {
		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://gbk.api.smschinese.cn");
		// PostMethod post = new
		// PostMethod("http://sms.webchinese.cn/web_api/");
		post.addRequestHeader("Content-Type",
				"application/x-www-form-urlencoded;charset=gbk");// 在头文件中设置转码
		NameValuePair[] data = { new NameValuePair("Uid", "biaobaiwang"),// 注册的用户名
				new NameValuePair("Key", "d41d8cd98f00b204e980"),// 注册成功后，登录网站后得到的密钥
				new NameValuePair("smsMob", phone),// 手机号码
				new NameValuePair("smsText", content) };// 短信内容
		post.setRequestBody(data);

		try {
			client.executeMethod(post);
//			Header[] headers = post.getResponseHeaders();
//			int statusCode = post.getStatusCode();
			String result = new String(post.getResponseBodyAsString().getBytes("gbk"));
			return result;
		} catch (HttpException e) {
			return e.getMessage();
		} catch (IOException e) {
			return e.getMessage();
		}
	}
	
}
