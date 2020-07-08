package com.hu.bean;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    // 主键自动填充
    @TableId(type = IdType.AUTO,value = "1")
    private Long id;
    private String name;
    private Integer age;
    private String email;
    // 自动填充
    @TableField(fill = FieldFill.INSERT)
    private Date create_time;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date update_time;
}
