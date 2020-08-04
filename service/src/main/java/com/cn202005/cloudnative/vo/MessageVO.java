package com.cn202005.cloudnative.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ZeHao Li
 */
@Component
public class MessageVO {

    @Value("${msg}")
    private String msg;

    @Value("${server.port}")
    private String serverPort;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getServerPort() {
        return serverPort;
    }

    public void setServerPort(String serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public String toString() {
        return "MessageVO{" +
                "msg='" + msg + '\'' +
                ", serverPort='" + serverPort + '\'' +
                '}';
    }
}
