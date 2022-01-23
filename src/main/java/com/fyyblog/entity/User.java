package entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Dong
 * @since 2022-01-21
 */
@ApiModel(value = "User对象", description = "用户表")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty("用户名")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("安全符")
    private String salt;

    @ApiModelProperty("头像")
    private String img;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("真实姓名")
    private String realname;

    @ApiModelProperty("员工编号")
    private String num;

    @ApiModelProperty("手机号")
    private String mobile;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("0 未选择 1 男 2 女 ")
    private Integer sex;

    @ApiModelProperty("部门")
    private Integer deptId;

    @ApiModelProperty("岗位")
    private String post;

    @ApiModelProperty("状态,0禁用,1正常,2未激活")
    private Integer status;

    @ApiModelProperty("直属上级ID")
    private Long parentId;

    @ApiModelProperty("最后登录时间")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty("最后登录IP 注意兼容IPV6")
    private String lastLoginIp;

    private Long oldUserId;

    @ApiModelProperty("是否删除 0 未删除 1 已删除")
    private Integer isDel;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    public LocalDateTime getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(LocalDateTime lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
    public Long getOldUserId() {
        return oldUserId;
    }

    public void setOldUserId(Long oldUserId) {
        this.oldUserId = oldUserId;
    }
    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId=" + userId +
            ", username=" + username +
            ", password=" + password +
            ", salt=" + salt +
            ", img=" + img +
            ", createTime=" + createTime +
            ", realname=" + realname +
            ", num=" + num +
            ", mobile=" + mobile +
            ", email=" + email +
            ", sex=" + sex +
            ", deptId=" + deptId +
            ", post=" + post +
            ", status=" + status +
            ", parentId=" + parentId +
            ", lastLoginTime=" + lastLoginTime +
            ", lastLoginIp=" + lastLoginIp +
            ", oldUserId=" + oldUserId +
            ", isDel=" + isDel +
        "}";
    }
}
