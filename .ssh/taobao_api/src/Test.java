import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.ParseException;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.domain.User;
import com.taobao.api.request.UserBuyerGetRequest;
import com.taobao.api.response.UserBuyerGetResponse;


public class Test {
	
	protected static String testUrl = "http://gw.api.tbsandbox.com/router/rest";// ɳ�价�����õ�ַ
    protected static String Url = "http://gw.api.taobao.com/router/rest";//��ʽ�������õ�ַ
    /**
    * ˵����ɳ�价����ģ���Ա����Ͻ��׵ģ�������Ա�����ڴ��Ȳ����Լ���Ӧ�ã�Ȼ��������뵽��ʽ��������
    */
   
   // ����Ĳ����˺� appkey �� secret
    protected static String myappkey = "21755150";
   protected static String mysecret = "202d17171fb68fe908d343ea372f06a8";
   protected static String sandboxSecret = "sandbox71fb68fe908d343ea372f06a8"; // ɳ�价�������µ� AppSecret

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*TaobaoClient client=new DefaultTaobaoClient(testUrl, myappkey, sandboxSecret);
		UserBuyerGetRequest req=new UserBuyerGetRequest();
		req.setFields("nick");
		try {
			UserBuyerGetResponse response = client.execute(req);
			System.out.println(response.getErrorCode());
			User user= response.getUser();
			System.out.println(user.getEmail());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	    /*    StringBuilder param=new StringBuilder("grant_type=authorization_code");
	        TaobaoClient client=new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "21755150", "202d17171fb68fe908d343ea372f06a8");
	        UserGetRequest req=new UserGetRequest();
	        req.setFields("user_id,uid,nick,sex,buyer_credit,seller_credit,location,created,last_visit,birthday,type,status,alipay_no,alipay_account,alipay_account,email,consumer_protection,alipay_bind");
	        try {
	            UserGetResponse userResponse = client.execute(req);
	        } catch (ApiException e) {
	            e.printStackTrace();
	        }*/
		/*
		TaobaoClient client=new DefaultTaobaoClient("http://gw.api.taobao.com/router/rest", "app key", "��ȫ��"); 
        TaobaokeItemsGetRequest req=new TaobaokeItemsGetRequest(); 
        req.setFields("num_iid,title,nick,pic_url,price,click_url,commission,commission_rate,commission_num,commission_volume,shop_click_url,seller_credit_score,item_location,volume"); 
        req.setNick("�˺�����"); 
        req.setKeyword("Ь"); 
        req.setMallItem("TRUE"); 
        req.setPageNo((long)10); 
        TaobaokeItemsGetResponse response = client.execute(req); 
         
        List<TaobaokeItem> t=response.getTaobaokeItems(); 
        for(int i=0;i<t.size();i++){ 
            System.out.println(t.get(i).getNumIid()+"||"+t.get(i).getPrice()+"||"+t.get(i).getCommission()+"||"+t.get(i).getClickUrl()); 
        } 
         
         
        System.out.println(response.isSuccess()); 
        System.out.println(response.getMsg()); 
        System.out.println(response.getTaobaokeItems().size()); */
    } 
	
	/*public static String testTradeGet() throws ApiException, ParseException {

        // ������client ���캯���� ���÷��ص����ݸ�ʽ xml or json
         TaobaoClient client = new DefaultTaobaoClient(testUrl, myappkey,
                sandboxSecret, Constants.FORMAT_XML);
        TradesBoughtGetRequest req = new TradesBoughtGetRequest();
        req.setFields("seller_nick,buyer_nick,title,type,create,orders.pic_path,orders.price,orders.num,receiver_city");
        Date dateTime = SimpleDateFormat.getDateTimeInstance().parse(
                "2011-03-09 05:15:27");
        Date dateTime2 = SimpleDateFormat.getDateTimeInstance().parse(
                "2011-04-09 23:15:27");

        req.setStartCreated(dateTime);
        req.setEndCreated(dateTime2);

        TradesBoughtGetResponse response = client.execute(req);

        System.out.println("------>>  " + response.getBody());

        return response.getBody();
    }*/

}
