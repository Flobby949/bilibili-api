package top.soft1921.bili.api.mapper;

import top.soft1921.bili.api.model.entity.Partition;

public interface PartitionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Partition record);

    int insertSelective(Partition record);

    Partition selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Partition record);

    int updateByPrimaryKey(Partition record);
}