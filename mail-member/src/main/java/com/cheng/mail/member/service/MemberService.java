package com.cheng.mail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cheng.common.utils.PageUtils;
import com.cheng.mail.member.entity.MemberEntity;
import com.cheng.mail.member.exception.PhoneExistException;
import com.cheng.mail.member.exception.UsernameExistException;
import com.cheng.mail.member.vo.MemberLoginVo;
import com.cheng.mail.member.vo.MemberRegistVo;
import com.cheng.mail.member.vo.SocialUser;

import java.util.Map;

/**
 * 会员
 *
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 18:31:10
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void regist(MemberRegistVo vo);

    void checkPhoneUnique(String phone) throws PhoneExistException;

    void checkUsernameUnique(String username) throws UsernameExistException;

    MemberEntity login(MemberLoginVo vo);

    MemberEntity login(SocialUser socialUser);
}

