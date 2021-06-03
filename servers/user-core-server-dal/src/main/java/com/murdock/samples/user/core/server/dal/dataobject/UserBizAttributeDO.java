package com.murdock.samples.user.core.server.dal.dataobject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * <pre>
 * 用户业务属性
 *
 * UserDO <>-1---1..*-> UserBizAttributeDO
 * </pre>
 *
 * @author weipeng2k 2021年06月03日 下午12:50:35
 */
@Getter
@Setter
@ToString
public class UserBizAttributeDO {

    /**
     * PK
     */
    private Long id;
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 业务类型
     */
    private Integer bizType;
    /**
     * 业务值
     */
    private String bizValue;
}
