package com.tsoft.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsoft.user.entity.CtUser;
import com.tsoft.user.mapper.CtUserMapper;
import com.tsoft.user.service.CtUserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName CtUserServiceImpl
 * @Description: TODO
 * @Author liupantao
 * @Date 2019/12/23
 * @Version V1.0
 **/
@Service
public class CtUserServiceImpl extends ServiceImpl<CtUserMapper, CtUser> implements CtUserService {
}
