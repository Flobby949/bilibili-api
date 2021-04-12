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
public class VideoDetail {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 视频id
    */
    private Long videoId;

    /**
    * BV号
    */
    private Long bv;

    /**
    * 描述
    */
    private String content;

    /**
    * 弹幕量
    */
    private Long barrageNumber;

    /**
    * 分享量
    */
    private Long shareNumber;

    /**
    * 视频链接
    */
    private String videoUrl;

    /**
    * 视频标签
    */
    private String videoTags;

    /**
    * 评论量
    */
    private String commentNumber;
}