package com.cheng.mail.member.vo;

import lombok.Data;

@Data
public class SocialUser {
    private String access_token;
    private String remind_in;
    private long expires_in;
    private String uid;
    private String  sRealName;
}
