package Spider;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

/**
 * Created by XieTiansheng on 2018/3/7.
 */

public class HUntil {
    private static OkHttpClient okHttpClient;
    private static int num = 0;
    
    static{
    	okHttpClient = new OkHttpClient();
    }
    
    
    public static String get(String path){
    	//�������ӿͻ���
        Request request = new Request.Builder()
                .url(path)
                .build();
        //����"����" ����
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();//ִ��
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (IOException e) {
        	System.out.println("���Ӹ�ʽ����:"+path);
        }
        return null;
    }
    
}