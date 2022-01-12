package com.cheng.mail.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.cheng.common.exception.BizCodeEnume;
import com.cheng.mail.member.exception.PhoneExistException;
import com.cheng.mail.member.exception.UsernameExistException;
import com.cheng.mail.member.feign.CouponFeignService;
import com.cheng.mail.member.vo.MemberLoginVo;
import com.cheng.mail.member.vo.MemberRegistVo;
import com.cheng.mail.member.vo.SocialUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cheng.mail.member.entity.MemberEntity;
import com.cheng.mail.member.service.MemberService;
import com.cheng.common.utils.PageUtils;
import com.cheng.common.utils.R;



/**
 * 会员
 *
 * @author cheng
 * @email cheng@gmail.com
 * @date 2021-09-28 18:31:10
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R test(){
        MemberEntity memberEntity=new MemberEntity();
        memberEntity.setNickname("Sun");

        R memberCoupons=couponFeignService.memberCoupon();

        return R.ok().put("member",memberEntity).put("coupons",memberCoupons.get("coupons"));

    }

    @PostMapping("/regist")
    public R regist(@RequestBody MemberRegistVo vo){
        try {
            memberService.regist(vo);
        }
        catch (PhoneExistException e){
            return R.error(BizCodeEnume.PHONE_EXIST_EXCEPTION.getCode(),BizCodeEnume.PHONE_EXIST_EXCEPTION.getMessage());
        }
        catch(UsernameExistException e){
            return R.error(BizCodeEnume.USER_EXIST_EXCEPTION.getCode(),BizCodeEnume.USER_EXIST_EXCEPTION.getMessage());
        }

        return R.ok();
    }

    @PostMapping("/oauth2/login")
    public R oauthlogin(@RequestBody SocialUser socialUser){
        MemberEntity memberEntity= memberService.login(socialUser);
        if (memberEntity!=null){
            return R.ok().setData(memberEntity);
        }
        else{
            return R.error(BizCodeEnume.LOGINACCT_PASSWORD_INVALID_EXCEPTION.getCode(), BizCodeEnume.LOGINACCT_PASSWORD_INVALID_EXCEPTION.getMessage());
        }
    }

    @PostMapping("/login")
    public R login(@RequestBody MemberLoginVo vo){
        MemberEntity memberEntity= memberService.login(vo);
        if (memberEntity!=null){
            return R.ok().setData(memberEntity);
        }
        else{
            return R.error(BizCodeEnume.LOGINACCT_PASSWORD_INVALID_EXCEPTION.getCode(), BizCodeEnume.LOGINACCT_PASSWORD_INVALID_EXCEPTION.getMessage());
        }
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
