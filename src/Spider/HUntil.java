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
    	//创建连接客户端
        Request request = new Request.Builder()
                .url(path)
                .build();
        //创建"调用" 对象
        Call call = okHttpClient.newCall(request);
        try {
            Response response = call.execute();//执行
            if (response.isSuccessful()) {
                return response.body().string();
            }
        } catch (IOException e) {
        	System.out.println("链接格式有误:"+path);
        }
        return null;
    }
    
}