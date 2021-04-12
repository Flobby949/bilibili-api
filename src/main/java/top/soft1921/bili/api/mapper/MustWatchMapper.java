package top.soft1921.bili.api.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.soft1921.bili.api.model.entity.MustWatch;

/**
 * @author: 蛋宝
 * @date: 2021/4/12 1:16
 * @description: ${Description}
 */

public interface MustWatchMapper extends BaseMapper<MustWatch> {
    int deleteByPrimaryKey(Integer id);

     int insert(MustWatch record);

    int insertSelective(MustWatch record);

    MustWatch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MustWatch record);

    int updateByPrimaryKey(MustWatch record);
}