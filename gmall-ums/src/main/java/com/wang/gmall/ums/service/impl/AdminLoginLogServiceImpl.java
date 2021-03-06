package com.wang.gmall.ums.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wang.gmall.ums.entity.AdminLoginLog;
import com.wang.gmall.ums.mapper.AdminLoginLogMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wang.gmall.ums.service.AdminLoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户登录日志表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-02-08
 */
@Service
public class AdminLoginLogServiceImpl extends ServiceImpl<AdminLoginLogMapper, AdminLoginLog> implements AdminLoginLogService {

}
