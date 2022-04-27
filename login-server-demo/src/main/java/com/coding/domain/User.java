package com.coding.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

@Table(name = "user_detail")
public class User extends BaseDO {
    private static final long serialVersionUID = 1L;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 密码
     */
    @ApiModelProperty("昵称")
    private String nickname;
    /**
     * 密码
     */
    @ApiModelProperty("权限")
    private String User_rights;


}
