package com.murdock.samples.user.core.server.dal.dataobject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * <pre>
 * 用户
 * </pre>
 *
 * @author weipeng2k 2021年06月03日 下午12:39:54
 */
@Setter
@Getter
@ToString
public class UserDO {

    /**
     * PK
     */
    private Long id;
    /**
     * 名称，唯一
     */
    private String name;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 展示用户名
     */
    private String nickName;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 年龄
     */
    private Integer age;

}
