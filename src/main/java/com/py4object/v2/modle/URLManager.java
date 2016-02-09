package com.py4object.v2.modle;

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
    public void put(String mappedUrl, String url) {
        session.put(mappedUrl,new PlayerSession(url));


    }

    public PlayerSession getPlaySession(String path) throws Exception {
        String ppath=path.substring(path.indexOf("u/")+2);
        PlayerSession s=session.get(ppath);
        if(s==null)
            throw new Exception();
        return  s;

    }
}
