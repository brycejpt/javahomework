package filehash;

import java.util.ArrayList;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

public class file_hash {

    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        
        byte[] buffer = new byte[1024];
        
        
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        
        int numRead;
        do {
            
            numRead = is.read(buffer);

            if (numRead > 0) {
                
                complete.update(buffer, 0, numRead);
            }
            
            
        } while (numRead != -1);

        
        is.close();

        
        return complete.digest();
    }

    public static File[] sort(File[] s){
        //中间值
        File temp =null;
        //外循环:我认为最小的数,从0~长度-1
        for(int j = 0; j<s.length-1;j++){
            //最小值:假设第一个数就是最小的
            String min = s[j].getName();
            //记录最小数的下标的
            int minIndex=j;
            //内循环:拿我认为的最小的数和后面的数一个个进行比较
            for(int k=j+1;k<s.length;k++){
                //找到最小值
                if (Integer.parseInt(min.substring(0,min.indexOf(".")))>Integer.parseInt(s[k].getName().substring(0,s[k].getName().indexOf(".")))){
                    //修改最小
                    min=s[k].getName();
                    minIndex=k;
                }
            }
            //当退出内层循环就找到这次的最小值
            //交换位置
            temp = s[j];
            s[j]=s[minIndex];
            s[minIndex]=temp;
        }
        return s;
}
    
    public static void dfs(String path) throws Exception {
        File dir = new File(path);
        File[] fs = sort(dir.listFiles());
        
        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isFile()) {
                System.out.println("file " + fs[i].getName());
                
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName());
            }
        }
        for(int j = 0; j < fs.length; j++) {
        	printfliehash(fs[j].getPath());
        }
    }
    
    public static void printfliehash(String path) {
    	try {
            File file = new File(path);
            FileInputStream is = new FileInputStream(file);
            byte[] sha1 = SHA1Checksum(is);

            String result = "";
            for (int i = 0; i < sha1.length; i++) {
                result += Integer.toString(sha1[i], 16);
            }

            System.out.println(file.getName()+"的hash值是："+result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   

    
    public static String filehash(String path) throws Exception {
    	File file = new File(path);
        FileInputStream is = new FileInputStream(file);
        byte[] sha1 = SHA1Checksum(is);

        String result = "";
        for (int i = 0; i < sha1.length; i++) {
            result += Integer.toString(sha1[i], 16);
        }
    	return result;
    }
    
    
    public static void main(String[] args) {
        try {
            dfs("/Users/jiapeitong/Desktop/未命名文件夹 2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}