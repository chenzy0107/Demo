package com.czy.user.mgt.pojo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Data
@Builder
@TableName("tb_user_info")
public class UserInfo implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String userName;

    private Byte sex;

    private LocalDate birthday;

    private Date registerTime;

    private static final long serialVersionUID = 1L;
}