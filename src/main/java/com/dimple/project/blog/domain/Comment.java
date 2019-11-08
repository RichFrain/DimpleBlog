package com.dimple.project.blog.domain;

import com.dimple.framework.web.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @className: Comment
 * @description:
 * @author: Dimple
 * @date: 10/24/19
 */
@Data
//序列化Json的时候,如果是Null则忽略
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
public class Comment extends BaseEntity {

    private Long id;
    /**
     * Email地址
     */
    @Email(message = "Email地址不合法")
    private String email;
    /**
     * 昵称
     */
    @Length(min = 1, max = 100, message = "昵称长度为{min}~{max}个字符")
    private String nickName;
    /**
     * IP地址
     */
    @Pattern(regexp = "^((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}$", message = "IP地址不合法")
    private String ip;
    /**
     * 地理位置
     */
    private String location;
    /**
     * 系统
     */
    private String os;
    /**
     * 浏览器
     */
    private String browser;
    /**
     * 父评论的id
     */
    private Long parentId;
    /**
     * QQ号码
     */
    @Length(max = 20, message = "QQ号码长度不能超过{max}")
    private String qqNum;
    /**
     * 头像地址
     */
    @Length(max = 256, message = "头像地址长度不能超过{max}")
    private String avatar;
    /**
     * 页面ID
     */
    private Long pageId;
    /**
     * 页面的URL
     */
    private String url;
    /**
     * 1表示显示,0表示不显示
     */
    private Boolean display;
    /**
     * 点赞
     */
    private Long good;
    /**
     * 踩
     */
    private Long bad;
    /**
     * 评论内容
     */
    @NotNull(message = "内容不能为空")
    private String content;
}
