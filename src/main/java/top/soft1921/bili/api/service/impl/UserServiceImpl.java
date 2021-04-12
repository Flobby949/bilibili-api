package top.soft1921.bili.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import top.soft1921.bili.api.mapper.UserMapper;
import top.soft1921.bili.api.model.entity.User;
import top.soft1921.bili.api.service.UserService;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/9
 * @description :接口实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("*");
        return userMapper.selectList(queryWrapper);

    }
    @Override
    public List<User> getUserById(int userId) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");
        return  userMapper.selectList(queryWrapper);
    }
}
