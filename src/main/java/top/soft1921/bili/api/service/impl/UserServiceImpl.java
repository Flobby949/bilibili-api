package top.soft1921.bili.api.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.soft1921.bili.api.model.dao.UserDao;
import top.soft1921.bili.api.model.entity.User;
import top.soft1921.bili.api.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :Flobby
 * @version :1.0
 * @date :2021/4/9
 * @description :接口实现类
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }

    @Override
    public List<User> findById(Integer id) {
        return userDao.findById(id);
    }
}
