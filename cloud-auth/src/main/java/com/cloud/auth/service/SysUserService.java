package com.cloud.auth.service;


import com.cloud.auth.entity.SysUser;
import com.cloud.common.data.base.IProService;


/**
 * 用户表
 *
 * @author Aijm
 * @date 2019-08-25 20:20:58
 */
public interface SysUserService extends IProService<SysUser> {

    /**
     *  根据手机号或者邮箱或者手机号登录
     * @param loginName
     * @return
     */
    public SysUser loginByName(String loginName, String tenantId);


    /**
     *  根据手机号登录
     * @param mobile
     * @return
     */
    public SysUser loginByPhone(String mobile, String tenantId);

    /**
     * QQ 登录
     * @param qqOpenid
     * @return
     */
    public SysUser loginByQQ(String qqOpenid, String tenantId);


    /**
     * 微信登录
     * @param wxOpenid
     * @return
     */
    public SysUser loginByWX(String wxOpenid, String tenantId);

}
