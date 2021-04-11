package top.soft1921.bili.api.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Flobby
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 大分区类型
    */
    private Byte type;

    /**
    * 小分区主题
    */
    private String theme;
}