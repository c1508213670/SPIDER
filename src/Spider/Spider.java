package Spider;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Base64.Encoder;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import okio.ForwardingTimeout;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;

class UrlCrawBoke {
	public static Map<String, List<String>> getQueryParams(String url) {
	    try {
	        Map<String, List<String>> params = new HashMap<String, List<String>>();
	        String[] urlParts = url.split("\\?");
	        if (urlParts.length > 1) {
	            String query = urlParts[1];
	            for (String param : query.split("&")) {
	                String[] pair = param.split("=");
	                String key = URLDecoder.decode(pair[0], "UTF-8");
	                String value = "";
	                if (pair.length > 1) {
	                    value = URLDecoder.decode(pair[1], "UTF-8");
	                }
	 
	                List<String> values = params.get(key);
	                if (values == null) {
	                    values = new ArrayList<String>();
	                    params.put(key, values);
	                }
	                values.add(value);
	            }
	        }
	 
	        return params;
	    } catch (UnsupportedEncodingException ex) {
	        throw new AssertionError(ex);
	    }
	}
	
	
	public static InputStream doGet(String urlstr) throws IOException {
		URL url = new URL(urlstr);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestProperty("User-Agent",
				"Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
		InputStream inputStream = conn.getInputStream();
		return inputStream;
	}
	
	public static String inputStreamToString(InputStream is, String charset) throws IOException {
		byte[] bytes = new byte[1024];
		int byteLength = 0;
		StringBuffer sb = new StringBuffer();
		while ((byteLength = is.read(bytes)) != -1) {
			sb.append(new String(bytes, 0, byteLength, charset));
		}
		return sb.toString();
	}

}
public class Spider {
	public static class Frameshow extends JFrame//??????
	{
		Frameshow()
		{
			super();
			//setResizable(false);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setBounds(350,50,700,750);
			final FlowLayout flowLayout=new FlowLayout();
			flowLayout.setVgap(20);
			flowLayout.setHgap(50);
			flowLayout.setAlignment(FlowLayout.CENTER);
			final JPanel jpanel=new JPanel();
			jpanel.setLayout(flowLayout);
			getContentPane().add(jpanel,BorderLayout.CENTER);
			
	//

			final JLabel toplabel=new JLabel();
			toplabel.setBorder(new TitledBorder(null,"",TitledBorder.DEFAULT_JUSTIFICATION,TitledBorder.DEFAULT_POSITION,null,null));
			toplabel.setForeground(new Color(250,125,200));
			toplabel.setFont(new Font("",Font.BOLD,52));
			toplabel.setText("   ?? ?? ?? ??   ");
			jpanel.add(toplabel);
			  final JLabel leftLabel=new JLabel(); 
			  leftLabel.setPreferredSize(new Dimension(10,0));
			  getContentPane().add(leftLabel,BorderLayout.NORTH);
			  final JLabel label0=new JLabel();
				label0.setText("????????????????????????");
				jpanel.add(label0);
				label0.setFont(new Font("",Font.BOLD,20));
				JTextField textField=new JTextField();
				textField.setPreferredSize(new Dimension (320,35));
				textField.setHorizontalAlignment(JTextField.CENTER);
				textField.setFont(new Font("",Font.BOLD,30));
				jpanel.add(textField);
				final JLabel label1=new JLabel();
				label1.setText("??????????????????????");
				jpanel.add(label1);
				label1.setFont(new Font("",Font.BOLD,20));
				JTextField textField1=new JTextField();
				textField1.setPreferredSize(new Dimension (320,35));
				textField1.setHorizontalAlignment(JTextField.CENTER);
				textField1.setFont(new Font("",Font.BOLD,30));
				jpanel.add(textField1);
				final JLabel label2=new JLabel();
				label2.setText("????????????????????");
				jpanel.add(label2);
				label2.setFont(new Font("",Font.BOLD,20));
				JTextField textField2=new JTextField();
				textField2.setPreferredSize(new Dimension (320,35));
				textField2.setHorizontalAlignment(JTextField.CENTER);
				textField2.setFont(new Font("",Font.BOLD,30));
				jpanel.add(textField2);
				final JLabel label3=new JLabel();
				label3.setText("????????????????????????????");
				jpanel.add(label3);
				label3.setFont(new Font("",Font.BOLD,20));
				JTextField textField3=new JTextField();
				textField3.setPreferredSize(new Dimension (320,35));
				textField3.setHorizontalAlignment(JTextField.CENTER);
				textField3.setFont(new Font("",Font.BOLD,30));
				jpanel.add(textField3);
				final JLabel label4=new JLabel();
				label4.setText("??????????????????????????java??????");
				jpanel.add(label4);
				label4.setFont(new Font("",Font.BOLD,25));
				final JLabel label5=new JLabel();
				label5.setText("????????????????????????????????????????");
				jpanel.add(label5);
				label5.setFont(new Font("",Font.BOLD,24));
				final JButton button=new JButton();
				button.setText("??????????");
				button.setFont(new Font("",Font.BOLD,30));
				jpanel.add(button);
				button.addActionListener(new ActionListener()//????allstudents????????
						{
							public void actionPerformed(ActionEvent e)
							{
						if(!textField.getText().equals(""))
						{
							path=textField.getText();
						}
						else
						{
							path="http://www.suda.edu.cn/";
						}
						if(!textField1.getText().equals(""))
						{
							linkpath=textField1.getText()+"\\";
						}
						else {
							linkpath="";
						}
						if(!textField2.getText().equals(""))
						{
							imgpath=textField2.getText();
						}
						else {
							File directory = new File("");//????????
							try {
								String courseFile = directory.getCanonicalPath() ;
								File file=new File(courseFile+"\\imgpakage");
								if(!file.exists()){//????????????????
									file.mkdir();//??????????
								}
								imgpath=courseFile+"\\imgpakage";
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						}
						if(!textField3.getText().equals(""))
						{
							filepath=textField3.getText()+"\\";
						}
						else {
							filepath="";
						}
						
						try {Writer out;
							out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("org.txt"), "utf-8"));
							try {
								out.write(path+"\n"+linkpath+"\n"+imgpath+"\n"+filepath+"\n");
								out.write("\r\n");
								out.flush();
								out.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						} catch (UnsupportedEncodingException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						dispose();
					}
						});
				final JLabel leftLabel1=new JLabel(); 
				  leftLabel1.setPreferredSize(new Dimension(100,0));
				  getContentPane().add(leftLabel1,BorderLayout.WEST);
				  final JLabel rightLabel=new JLabel(); 
				  rightLabel.setPreferredSize(new Dimension(100,0));
				  getContentPane().add(rightLabel,BorderLayout.EAST);
		}
	}
	public static String Html2Text1(String inputString) {
		String htmlStr = inputString; // ??html????????????
		String textStr = "";
		java.util.regex.Pattern p_script;
		java.util.regex.Matcher m_script;
		java.util.regex.Pattern p_style;
		java.util.regex.Matcher m_style;
		java.util.regex.Pattern p_html;
		java.util.regex.Matcher m_html;
		try {
			String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>"; // ????script????????????{??<script[^>]*?>[\\s\\S]*?<\\/script>
			String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>"; // ????style????????????{??<style[^>]*?>[\\s\\S]*?<\\/style>
			String regEx_html = "<[^>]+>"; // ????HTML????????????????
			p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
			m_script = p_script.matcher(htmlStr);
			htmlStr = m_script.replaceAll(""); // ????script????
			p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
			m_style = p_style.matcher(htmlStr);
			htmlStr = m_style.replaceAll(""); // ????style????
			p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
			m_html = p_html.matcher(htmlStr);
			htmlStr = m_html.replaceAll(""); // ????html????
			textStr = htmlStr;
		} catch (Exception e) {
			System.err.println("Html2Text: " + e.getMessage());
		}
		// ??????????
		textStr = textStr.replaceAll("[ ]+", "");
		textStr = textStr.replaceAll("1", "").replaceAll("2", "").replaceAll("3", "").replaceAll("4", "")
				.replaceAll("5", "").replaceAll("6", "").replaceAll("7", "").replaceAll("8", "").replaceAll("9", "")
				.replaceAll("0", "");
		textStr = textStr.replaceAll("(?m)^\\s*$(\\n|\\r\\n)", "");
		textStr = textStr.replaceAll("\t", "");
		textStr = textStr.replaceAll("&nbsp;", "").replace("&gt;", "").replace("&mdash;", "");// ???????? ??????
		textStr = textStr.replaceAll("\\\\", "");// ????????????????????????????????????????
		textStr = textStr.replaceAll("\r\n", "");
		textStr = textStr.replaceAll("\n", "");
		return textStr;// ??????????????
	}
	
	public static String getPageContent(String strUrl, String strPostRequest,
			   int maxLength) {
			  // ????????????
			  StringBuffer buffer = new StringBuffer();
			  System.setProperty("sun.net.client.defaultConnectTimeout", "5000");
			  System.setProperty("sun.net.client.defaultReadTimeout", "5000");
			  try {
			   URL newUrl = new URL(strUrl);
			   HttpURLConnection hConnect = (HttpURLConnection) newUrl
			     .openConnection();
			   // POST??????????????
			   if (strPostRequest.length() > 0) {
			    hConnect.setDoOutput(true);
			    OutputStreamWriter out = new OutputStreamWriter(hConnect
			      .getOutputStream());
			    out.write(strPostRequest);
			    out.flush();
			    out.close();
			   }
			   // ????????
			   BufferedReader rd = new BufferedReader(new InputStreamReader(
			     hConnect.getInputStream()));
			   int ch;
			   for (int length = 0; (ch = rd.read()) > -1
			     && (maxLength <= 0 || length < maxLength); length++)
			    buffer.append((char) ch);
			   String s = buffer.toString();
			   s.replaceAll("//&[a-zA-Z]{1,10};", "").replaceAll("<[^>]*>", "");
			   System.out.println(s);
			   rd.close();
			   hConnect.disconnect();
			   return buffer.toString().trim();
			  } catch (Exception e) {
			   // return "????:??????????????";
			   //
			   return null;
			  }
			}
	private static void downloadPicture1(String urlList,String path) {
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            byte[] buffer = new byte[1024];
            int length;

            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            Encoder encoder = Base64.getEncoder();;
            final String encodedText = encoder.encodeToString(buffer);//????Base64??????????????????????
            System.out.println(encodedText);
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	static List<String> reout=new ArrayList(); 
	
    private static void downloadPicture(String urlList,String path) {
        URL url = null;
        try {
            url = new URL(urlList);
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
 
            FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
 
            byte[] buffer = new byte[1024];
            int length;
 
            while ((length = dataInputStream.read(buffer)) > 0) {
                output.write(buffer, 0, length);
            }
            fileOutputStream.write(output.toByteArray());
            dataInputStream.close();
            fileOutputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean deleteDir(String path){
		File file = new File(path);
		if(!file.exists()){//??????????????????????????
			System.err.println("The dir are not exists!");
			return false;
		}
		
		String[] content = file.list();//??????????????????????????????
		for(String name : content){
			File temp = new File(path, name);
			if(temp.isDirectory()){//??????????????
				deleteDir(temp.getAbsolutePath());//??????????????????????????
				temp.delete();//??????????
			}else{
				if(!temp.delete()){//????????????
					System.err.println("Failed to delete " + name);
				}
			}
		}
		return true;
	}

	public static int num = -1,sum = 0;
	/**
	 * ????????????????????????????????????????????????????????????
	 */
	
	public static File aLinkFile,imgLinkFile,docLinkFile,errorLinkFile,docFile;
	/**
	 * 
	 * @param path		????????
	 * @throws IOException 
	 */
	public static void getAllLinks(String path) throws IOException{
		
		Document doc = null;
		try{
			doc = Jsoup.parse(HUntil.get(path));
		}catch (Exception e){
			//????????????????404??????
			writeTxtFile(errorLinkFile, path+"\r\n");	//????????????????????
			num++;	
			if(sum>num){	//??????????????sum??????num(????????)??????????
				getAllLinks(getFileLine(aLinkFile, num));
			}
			return;
		}
		Elements aLinks = doc.select("a[href]");
		Elements imgLinks = doc.select("img[src]");
		System.out.println("??????????"+path);
		for(Element element:aLinks){
			String url =element.attr("href");
			//????????????????????????
			if(!url.contains("http://")&&!url.contains("https://")){
				//??????????	????<a href="xitongshow.php?cid=67&id=113" />
				//??????????????	http://www.yada.com.cn/xitongshow.php?cid=67&id=113
				//????404
				url = Spider.path+url;
			}
			//????????????????????????????????????????javascript:??????(????????????js????????)
			if(!readTxtFile(aLinkFile).contains(url)
					&&!url.contains("javascript")){	
				//??????????????????????--->????????????????
				if(url.contains(Spider.path)){		
					//??????a??????????????????????????
					if(url.contains(".doc")||url.contains(".exl")
							||url.contains(".exe")||url.contains(".apk")
							||url.contains(".mp3")||url.contains(".mp4")){
						//??????????????????+????????
						writeTxtFile(docLinkFile, element.text()+"\r\n\t"+url+"\r\n");
					}else{
						//??????????????
						writeTxtFile(docFile, element.text()+"\r\n\t");
						writeTxtFile(aLinkFile, url+"\r\n");
						sum++;	//????????+1
					}
					
					
					System.out.println("\t"+element.text()+"??\t"+url);
				}
			}
		}
		//??????????????????????
		for(Element element:imgLinks){
			String srcStr = element.attr("src");
			if(!srcStr.contains("http://")&&!srcStr.contains("https://")){//????????????
				srcStr = Spider.path+srcStr;
			}
			if(!readTxtFile(imgLinkFile).contains(srcStr)){	
				//????????????????????
				writeTxtFile(imgLinkFile, srcStr+"\r\n");
			}
		}
		num++;
		if(sum>num){
			getAllLinks(getFileLine(aLinkFile, num));
		}
	}
	
	/**
	 * ????????????
	 * @param file	??????
	 * @return	????????
	 */
	public static String readTxtFile(File file){
		String result = "";		//?????Y??
		String thisLine = "";	//????????????
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			try {
				while((thisLine=reader.readLine())!=null){
					result += thisLine+"\n";
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * ????????
	 * @param file	??????
	 * @param urlStr	????????????
	 */
	public static void writeTxtFile(File file,String urlStr){
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));
			writer.write(urlStr);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static class Frameexcues extends JFrame//
	{
		Frameexcues()
		{
			
			super();
			setResizable(false);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setBounds(500,250,480,360);
			final FlowLayout flowLayout=new FlowLayout();
			flowLayout.setVgap(20);
			
			flowLayout.setHgap(50);
			flowLayout.setAlignment(FlowLayout.CENTER);
			final JPanel jpanel=new JPanel();
			jpanel.setLayout(flowLayout);
			getContentPane().add(jpanel,BorderLayout.CENTER);
			JLabel plabel=new JLabel();
			plabel.setText("??????????????????");
			plabel.setFont(new Font("",Font.BOLD,30));
			jpanel.add(plabel);
			JLabel plabel1=new JLabel();
			plabel1.setText("????????????????????????????GUI??????????????");
			plabel1.setFont(new Font("",Font.BOLD,18));
			jpanel.add(plabel1);
			JLabel plabel2=new JLabel();
			plabel2.setText("????????????????????");
			
			plabel2.setFont(new Font("",Font.BOLD,18));
			jpanel.add(plabel2);
			JLabel plabel4=new JLabel();
			plabel4.setText("????????????????????????????????????????????");
			plabel4.setFont(new Font("",Font.BOLD,18));
			jpanel.add(plabel4);
			JLabel plabel3=new JLabel();
			plabel3.setText("????????????????????????????????");
			plabel3.setFont(new Font("",Font.BOLD,18));
			jpanel.add(plabel3);
			final JButton button=new JButton();
			button.setText("????????");
			button.setFont(new Font("",Font.BOLD,25));
			jpanel.add(button);
			final JButton sbutton=new JButton();
			sbutton.setText("????????");
			sbutton.setFont(new Font("",Font.BOLD,25));
			jpanel.add(sbutton);
			
			button.addActionListener(new ActionListener()//????????
			{
				public void actionPerformed(ActionEvent e)
				{ 
					Framecontent frametemp = new Framecontent();
					frametemp.setVisible(true);
				}});
			
			sbutton.addActionListener(new ActionListener()//????????
			{
				public void actionPerformed(ActionEvent e)
				{ 
					Frameshow frametemp = new Frameshow();
					frametemp.setVisible(true);
					dispose();
				}});
			
		}
		 
	}
	public static class Framecontent extends JFrame//??????????
	{
		Framecontent()
		{
			
			super();
			setResizable(false);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			setBounds(500,100,480,660);
			final FlowLayout flowLayout=new FlowLayout();
			flowLayout.setVgap(20);
			
			flowLayout.setHgap(50);
			flowLayout.setAlignment(FlowLayout.CENTER);
			final JPanel jpanel=new JPanel();
			jpanel.setLayout(flowLayout);
			getContentPane().add(jpanel,BorderLayout.CENTER);
			JLabel plabel=new JLabel();
			plabel.setText("????????????");
			plabel.setFont(new Font("",Font.BOLD,35));
			jpanel.add(plabel);
			JLabel plabel1=new JLabel();
			plabel1.setText("????????????4??????????");
			plabel1.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel1);
			JLabel plabel2=new JLabel();
			plabel2.setText("??????ALinks??????????DocLinks??????????ErrorLinks");
			
			plabel2.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel2);
			JLabel plabel4=new JLabel();
			plabel4.setText("????????????ImgLinks,??????????doccontent");
			plabel4.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel4);
			JLabel plabel3=new JLabel();
			plabel3.setText("org.txt??????????????");
			plabel3.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel3);
			JLabel plabel6=new JLabel();
			plabel6.setText("??????????????????????????????????????");
			plabel6.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel6);
			JLabel plabel7=new JLabel();
			plabel7.setText("??????imgpakage??????");
			plabel7.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel7);
			JLabel plabel12=new JLabel();
			plabel12.setText("htmlcontent??????????????html????");
			plabel12.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel12);
			JLabel plabel8=new JLabel();
			plabel8.setText("txtcontent??????????????????????");
			plabel8.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel8);
			JLabel plabel9=new JLabel();
			plabel9.setText("??????????????????????????????????");
			plabel9.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel9);
			JLabel plabel11=new JLabel();
			plabel11.setText("??????????????????????????????????????????");
			plabel11.setFont(new Font("",Font.BOLD,15));
			jpanel.add(plabel11);
			JLabel plabel10=new JLabel();
			plabel10.setText("??????????????????????????????????");
			plabel10.setFont(new Font("",Font.BOLD,20));
			jpanel.add(plabel10);
			final JButton button=new JButton();
			button.setText("????");
			button.setFont(new Font("",Font.BOLD,25));
			jpanel.add(button);
			
			button.addActionListener(new ActionListener()//????
			{
				public void actionPerformed(ActionEvent e)
				{ 
					dispose();
				}});
			
		}
		 
	}
	/**
	 * ??????????????????????????????????????????????????
	 * @param file	????????
	 * @param num	??????????
	 */
	public static String getFileLine(File file,int num){
		String thisLine = "";
		int thisNum = 0 ;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while((thisLine = reader.readLine())!=null){
				if(num == thisNum){
					return thisLine;
				}
					thisNum++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	public static void download(String urlString, int i) throws Exception {
	       // ????URL
	       URL url = new URL(urlString);
	       // ????????
	       URLConnection con = url.openConnection();
	       // ??????
	       InputStream is = con.getInputStream();
	       // 1K??????????
	       byte[] bs = new byte[1024];
	       // ????????????????
	       int len;
	       // ????????????
	       String filename = "D:\\????????/" + i + ".jpg";  //??????????????????????
	       File file = new File(filename);
	       FileOutputStream os = new FileOutputStream(file, true);
	       // ????????
	       while ((len = is.read(bs)) != -1) {
	           os.write(bs, 0, len);
	       }
	       System.out.println(i);
	       // ??????????????????
	       os.close();
	       is.close();
	   }
	/**
	 * ????????????????????????????
	 * @param file	??????
	 * @return	??????
	 */
	public static int getFileCount(File file){
		int count = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			while(reader.readLine()!=null){	//??????????
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	public static String path ;	//????????"https://www.139y.com/gl/2081024.html""https://www.it610.com/article/1296058064964755456.htm" "http://www.yada.com.cn/""https://book.qidian.com/info/1026684143#Catalog"
	public static String linkpath;
	public static String imgpath;
	public static String filepath;
	
	//static List <String>linkpath=new ArrayList();
	public static void main(String[] args) throws Exception   {
		Frameexcues frametemp = new Frameexcues();
		frametemp.setVisible(true);
		System.out.print("??????????????????????????????yes??????????");
		Scanner scan=new Scanner(System.in);
		if(scan.hasNext())
		{
			if(scan.next().equals("yes"))
			{
			InputStreamReader ofr = new InputStreamReader(new FileInputStream("org.txt"), "UTF-8");
			BufferedReader obr=new BufferedReader(ofr);
			String oline=null;
			List<String> orglist=new ArrayList();
			int oflag=0;
			while((oline=obr.readLine())!=null)
			{
				orglist.add(oline);
			}
			path=orglist.get(0);
			
			linkpath=orglist.get(1);
			imgpath=orglist.get(2);
			filepath=orglist.get(3);
			String Alinkloc=linkpath+"ALinks.txt";
			//System.out.println(Alinkloc);
			String Imglinkloc=linkpath+"ImgLinks.txt";
			String Doclinkloc=linkpath+"DocLinks.txt";
			String Errorlinkloc=linkpath+"ErrorLinks.txt";
			String docloc=linkpath+"doccontent.txt";
		aLinkFile = new File(Alinkloc);
		imgLinkFile = new File(Imglinkloc);	
		docLinkFile = new File(Doclinkloc);
		errorLinkFile = new File(Errorlinkloc);
		docFile = new File(docloc);
		//????????????????????????????????????????
		File[] files = new File[]{aLinkFile,imgLinkFile,docLinkFile,errorLinkFile,docFile};
		try {
			for(File file: files){
				if(file.exists())	//????????????
					file.delete();	//????????
				file.createNewFile();	//??????
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		long startTime = System.currentTimeMillis();    //????????????
		Spider.getAllLinks(path);	//????????????????
		System.out.println(""
				+ "????????????????????????????????????????????????????????????????????????????????"
				+ "\n??????????"+path
				+ "\n??????????"+sum+"??"
				+ "\n??????????"+getFileCount(imgLinkFile)+"??"
				+ "\n??????????"+getFileCount(docLinkFile)+"??");
		writeTxtFile(aLinkFile, "??????????"+getFileCount(aLinkFile)+"??");
		writeTxtFile(imgLinkFile, "??????????"+getFileCount(imgLinkFile)+"??");
		writeTxtFile(docLinkFile, "??????????"+getFileCount(docLinkFile)+"??");
		writeTxtFile(errorLinkFile, "??????????????"+getFileCount(errorLinkFile)+"??");
		long endTime = System.currentTimeMillis();    //????????????
		String courseFile = imgpath;
		File file=new File(courseFile+"\\imgpakage");
		if(!file.exists()){//????????????????
			file.mkdir();//??????????
		}
		imgpath=courseFile+"\\imgpakage";
		deleteDir(imgpath);
		System.out.println("\n??????????????" + (endTime - startTime) + "ms");    //????????????????
		try {
		InputStreamReader fr = new InputStreamReader(new FileInputStream(Imglinkloc), "UTF-8");
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		String []sp;
		int flag=0;
		while((line=br.readLine())!=null)
		{
			flag++;
			String fpath=imgpath+"\\"+Integer.toString(flag)+".jpg";
			if(flag==getFileCount(imgLinkFile)) 
			{
			break;
			}
			
			downloadPicture(line,fpath);
			
		}System.out.println("????????????");
		}catch(Exception e){
			System.out.println("Caught Exception");
			System.out.println("getMessage():"+e.getMessage());
			System.out.println("getLocalizedMessage():"+
			                     e.getLocalizedMessage());
			System.out.println("toString()"+e);
			System.out.println("printStackTrace():");
			e.printStackTrace(System.out);
		}
		try {
			InputStreamReader fr = new InputStreamReader(new FileInputStream(Alinkloc), "UTF-8");
			BufferedReader br=new BufferedReader(fr);
			String line=null;
			String []sp;
			int flag=0;
			String beforelink=filepath+"htmlcontent.txt";
			String afterlink=filepath+"txtcontent.txt";
			while((line=br.readLine())!=null)
			{
				flag++;
				if(flag==getFileCount(aLinkFile)) 
				{
				break;
				}
				InputStream is2 = UrlCrawBoke.doGet(line);
				String pageStr = UrlCrawBoke.inputStreamToString(is2, "UTF-8");
				is2.close();
				FileWriter is1 = new FileWriter(beforelink);
				is1.write(pageStr); // ?????? write("666")
				is1.close();

				// ????????????html????????????
				String after = Html2Text1(pageStr.toString());

				FileWriter is = new FileWriter(afterlink);
				is.write(after); // ?????? write("666")
				is.close();
				//System.out.println(after);
			}System.out.println("????????????");
			}catch(Exception e){
				System.out.println("Caught Exception");
				System.out.println("getMessage():"+e.getMessage());
				System.out.println("getLocalizedMessage():"+
				                     e.getLocalizedMessage());
				System.out.println("toString()"+e);
				System.out.println("printStackTrace():");
				e.printStackTrace(System.out);
			}
			}
			else {
				System.out.println("????????????????");
			}
	}}
}

