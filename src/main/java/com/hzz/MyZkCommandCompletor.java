package com.hzz;

import jline.console.completer.Completer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyZkCommandCompletor implements Completer {
    protected static final Map<String,String> commandMap = new HashMap<String,String>( );

    static {
        commandMap.put("connect", "host:port");
        commandMap.put("close","");
        commandMap.put("create", "[-s] [-e] path data acl");
        commandMap.put("delete","path [version]");
        commandMap.put("rmr","path");
        commandMap.put("set","path data [version]");
        commandMap.put("get","path [watch]");
        commandMap.put("ls","path [watch]");
        commandMap.put("ls2","path [watch]");
        commandMap.put("getAcl","path");
        commandMap.put("setAcl","path acl");
        commandMap.put("stat","path [watch]");
        commandMap.put("sync","path");
        commandMap.put("setquota","-n|-b val path");
        commandMap.put("listquota","path");
        commandMap.put("delquota","[-n|-b] path");
        commandMap.put("history","");
        commandMap.put("redo","cmdno");
        commandMap.put("printwatches", "on|off");
        commandMap.put("quit","");
        commandMap.put("addauth", "scheme auth");
    }

    @Override
    public int complete(String s, int i, List<CharSequence> list) {
        for(String k : commandMap.keySet()) {
            if(k.startsWith(s)) {
                list.add(k);
            }
        }
        return 0;
    }
}
