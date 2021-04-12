package top.soft1921.bili.api.service;

import top.soft1921.bili.api.model.entity.User;

import java.util.List;

/**
 * @author :Flobby
 * @date :2021/4/9
 */
public interface UserService {
    List<User> getAll();
    List<User> findById(Integer id);
}
