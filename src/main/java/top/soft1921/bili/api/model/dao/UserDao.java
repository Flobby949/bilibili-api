package top.soft1921.bili.api.model.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import top.soft1921.bili.api.model.entity.User;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/4/12
 * @description UserDao
 */
@Repository
public class UserDao {
    @Resource
    private JdbcTemplate jdbcTemplate;
    /**
     * 查询所有用户
     */
    public List<User> findAll(){
        return jdbcTemplate.query("SELECT * FROM t_user",new BeanPropertyRowMapper<>(User.class));
    }
    /**
     * 根据id查询用户
     */
    public List<User> findById(Integer id){
        return jdbcTemplate.query("SELECT * FROM t_user WHERE id = ? ",
                new Object[]{id},new BeanPropertyRowMapper<>(User.class));
    }


}
