package com.manage.entity.jpa;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "seed")
@Data
public class Order {

    /**
     * 学号,唯一不重复
     * 声明主键
     * 声明主键的生成策略
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //ID
    @Column(length = 20)
    private String name; //姓名*/

    private String jobNumber; //工号
    private Date createTime; //创建时间*/

}
