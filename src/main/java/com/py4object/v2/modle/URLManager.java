package com.py4object.v2.modle;

import org.apache.commons.lang.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kozo on 2/9/16.
 */
public class URLManager {
    Map<String ,PlayerSession> session;
    public URLManager(){
        session=new HashMap<String, PlayerSession>();
    }
    public String  put( String url) {
        url=url.substring(url.indexOf("youtube.com/watch?v=")+"youtube.com/watch?v=".length());
        String mappedUrl= RandomStringUtils.random(20,"abcdefghijklmnopqurstuvwsyz1234567809");

        session.put(mappedUrl,new PlayerSession(url));

        return "u/"+mappedUrl;


    }

    public PlayerSession getPlaySession(String path) throws Exception {
        String ppath=path.substring(path.indexOf("u/")+2);
        PlayerSession s=session.get(ppath);
        if(s==null)
            throw new Exception();
        return  s;

    }
}
