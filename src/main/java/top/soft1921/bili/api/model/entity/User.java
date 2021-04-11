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
public class User {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 用户名
    */
    private String nickname;

    /**
    * 个性签名
    */
    private String signature;

    /**
    * 头像
    */
    private String avatar;

    /**
    * 等级
    */
    private Integer level;

    /**
    * 手机号
    */
    private String phoneNumber;

    /**
    * 视频链接
    */
    private String password;
}