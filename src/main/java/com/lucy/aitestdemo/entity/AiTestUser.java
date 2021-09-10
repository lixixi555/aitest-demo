package com.lucy.aitestdemo.entity;

import lombok.Data;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ai_test_user")
@Data
public class AiTestUser extends BaseEntityNew {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 自动生成用例job名称，不为空时表示已经创建job
     */
    @Column(name = "auro_create_case_job_name")
    private String auroCreateCaseJobName;

    /**
     * 执行测试job名称，不为空时表示已经创建job
     */
    @Column(name = "start_test_job_name")
    private String startTestJobName;

    /**
     * 默认jenkins服务器
     */
    @Column(name = "default_jekins_id")
    private Integer defaultJekinsId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;
}