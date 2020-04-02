package com.gjn.shoporder.config;

import com.gjn.shoporder.config.entity.UserInfo;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gjn on 2020/4/2
 */
@Component
@ConfigurationProperties(prefix = "data")
public class ShopOrderConfig {
    private UserInfo user;
    private String env;

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

}
