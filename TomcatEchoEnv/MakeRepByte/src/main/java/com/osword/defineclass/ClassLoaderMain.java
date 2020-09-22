package com.osword.defineclass;
import java.io.*;
public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
        byte[] bs = getBytesByFile("/Users/osword/Desktop/rep/target/classes/com/osword/defineclass/dfs.class");
        for (int i = 0; i < bs.length; i++) {
            System.out.print(bs[i]+",");
        }
    }
    public static byte[] getBytesByFile(String pathStr) {
        File file = new File(pathStr);
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
            byte[] b = new byte[1000];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            byte[] data = bos.toByteArray();
            bos.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
