package top.soft1921.bili.api.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author loorzve
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Partition {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 分区类型
    */
    private String pName;

    /**
    * 分区视频数量
    */
    private Integer pVideoNumber;
}