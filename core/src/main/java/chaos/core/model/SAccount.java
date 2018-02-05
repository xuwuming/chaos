package chaos.core.model;

import chaos.api.annoatation.ApiField;
import chaos.utils.Md5Utils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.time.Instant;

public class SAccount implements Serializable {

    @ApiField("id///")
    private String id;

    /**
     * 用户昵称
     */
    @ApiField("nickname/用户昵称//")
    private String nickname;

    /**
     * 登录帐号
     */
    @ApiField("username/登录帐号//")
    private String username;

    /**
     * 密码
     */
    @ApiField("password/密码//")
    private String password;

    /**
     * 1:有效，0:禁止登录
     */
    @ApiField("status/1:有效，0:禁止登录//")
    private Short status;

    /**
     * 用户id 一用户id 可以对应多个账户
     */
    @ApiField("uId/用户id 一用户id 可以对应多个账户//")
    private String uId;

    /**
     * 每次登录后刷新
     */
    @ApiField("token/每次登录后刷新//")
    private String token;

    /**
     * 最后一次登录时间
     */
    @ApiField("lT/最后一次登录时间//")
    private Long lT;

    /**
     * 更新时间
     */
    @ApiField("ut/更新时间//")
    private Long ut = Instant.now().toEpochMilli();

    /**
     * 创建时间
     */
    @ApiField("ct/创建时间//")
    private Long ct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table s_account
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    public String getId() {
        return id;
    }

    /**
     *
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 用户昵称
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 用户昵称
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * 登录帐号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 登录帐号
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 密码
     */
    @JsonIgnore
    public String getPassword() {
        if (!StringUtils.isEmpty(password) && password.length() < 32) this.password = Md5Utils.toMd5(password);
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
        if (!StringUtils.isEmpty(password) && password.length() < 32) this.password = Md5Utils.toMd5(password);
    }


    /**
     * 1:有效，0:禁止登录
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 1:有效，0:禁止登录
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 用户id 一用户id 可以对应多个账户
     */
    public String getuId() {
        return uId;
    }

    /**
     * 用户id 一用户id 可以对应多个账户
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * 每次登录后刷新
     */
    public String getToken() {
        return token;
    }

    /**
     * 每次登录后刷新
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 最后一次登录时间
     */
    public Long getlT() {
        return lT;
    }

    /**
     * 最后一次登录时间
     */
    public void setlT(Long lT) {
        this.lT = lT;
    }

    /**
     * 更新时间
     */
    public Long getUt() {
        return ut;
    }

    /**
     * 更新时间
     */
    public void setUt(Long ut) {
        this.ut = ut;
    }

    /**
     * 创建时间
     */
    public Long getCt() {
        return ct;
    }

    /**
     * 创建时间
     */
    public void setCt(Long ct) {
        this.ct = ct;
    }
}