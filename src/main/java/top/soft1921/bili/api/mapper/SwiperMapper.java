package top.soft1921.bili.api.mapper;

import top.soft1921.bili.api.model.entity.Swiper;

public interface SwiperMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Swiper record);

    int insertSelective(Swiper record);

    Swiper selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Swiper record);

    int updateByPrimaryKey(Swiper record);
}