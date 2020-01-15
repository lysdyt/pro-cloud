package com.cloud.auth.service.impl;



import com.cloud.auth.entity.SysUser;
import com.cloud.auth.mapper.SysUserMapper;
import com.cloud.auth.service.SysUserService;
import com.cloud.common.data.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户表
 *   主要为了登录信息
 * @author Aijm
 * @date 2019-08-25 20:20:58
 */
@Service
public class SysUserServiceImpl extends BaseService<SysUserMapper, SysUser> implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser loginByName(String loginName, String tenantId) {
        return sysUserMapper.loginByName(loginName);
    }

    @Override
    public SysUser loginByPhone(String mobile, String tenantId) {
        return sysUserMapper.loginByPhone(mobile);
    }

    /**
     * QQ 登录
     *
     * @param qqOpenid
     * @return
     */
    @Override
    public SysUser loginByQQ(String qqOpenid, String tenantId) {
        return sysUserMapper.loginByQQ(qqOpenid);
    }

    /**
     * 微信登录
     *
     * @param wxOpenid
     * @return
     */
    @Override
    public SysUser loginByWX(String wxOpenid, String tenantId) {
        return sysUserMapper.loginByWX(wxOpenid);
    }


}
