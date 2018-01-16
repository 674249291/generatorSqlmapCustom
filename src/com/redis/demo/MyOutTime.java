package com.redis.demo;

import redis.clients.jedis.Jedis;

/**
 * Created by xiong on 2018/1/15.
 */
public class MyOutTime implements Runnable {

    String watchkeys = "watchkeys"; // 监视keys
    Jedis jedis = new Jedis("127.0.0.1", 6379);
    String userinfo;
    public MyOutTime() {

    }
    public MyOutTime(String uinfo) {
        this.userinfo=uinfo;
    }
    @Override
    public void run() {
        jedis.auth("123456");
        if(jedis.get("userinfo") != null){
            System.out.println("10秒之内不能进行操作");
        }else{
            jedis.set("userinfo",userinfo);
            jedis.expire("userinfo",1);
            System.out.println("操作中。。。");
        }
        jedis.close();

    }
}
