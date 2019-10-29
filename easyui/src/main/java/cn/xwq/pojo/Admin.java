package cn.xwq.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Table("tb_admin")
public class Admin {

    @Id
    private Long adminId;

    @Column(value = "admin_account")
    private String adminAccount;

    @Column(value = "admin_name")
    private String adminName;

    @Column(value = "admin_pwd")
    private String adminPwd;

    @Column(value = "admin_create_date")
    private Date adminCreateDate;

    @Column(value = "admin_status")
    private Integer adminStatus;

    @Column(value = "role_id")
    private Long roleId;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public Date getAdminCreateDate() {
        return adminCreateDate;
    }

    public void setAdminCreateDate(Date adminCreateDate) {
        this.adminCreateDate = adminCreateDate;
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
