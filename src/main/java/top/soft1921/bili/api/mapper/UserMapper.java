package top.soft1921.bili.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.soft1921.bili.api.model.entity.User;

/**
 * @author Flobby
 */
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据id查询用户信息
     */
    User getUser(int userId);

}